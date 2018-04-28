import threading

class MailBox:
        def __init__(self):
                self.mensagem = ''
                self.leituraLiberada = False
                self.threadCondition = threading.Condition()
        
        def escreveMensagem(self,msg):
                self.threadCondition.acquire()
                while (self.leituraLiberada):
                        try:
                                self.threadCondition.wait()
                        except Exception,  e:
                                return e
                self.mensagem = msg
                self.leituraLiberada = True
                self.threadCondition.notify()
                self.threadCondition.release()

        def consomeMensagem(self):
                self.threadCondition.acquire()
                while not(self.leituraLiberada):
                        try:
                                self.threadCondition.wait()
                        except Exception, e:
                                return e                
                self.leituraLiberada = False
                self.threadCondition.notify()
                self.threadCondition.release()
                return self.mensagem

class Consumidor (threading.Thread):

        def __init__(self,mb):
                threading.Thread.__init__(self)
                self.mailBox = mb
        
        def run(self):
                print self.mailBox.consomeMensagem()

class Produtor (threading.Thread):
        
        def __init__(self,mb):
                threading.Thread.__init__(self)
                self.mailBox = mb
        
        def run(self):
                self.mailBox.escreveMensagem("Ola thread")

mb = MailBox()
prod = Produtor(mb)
cons = Consumidor(mb)
cons.start()
prod.start()
prod.join()