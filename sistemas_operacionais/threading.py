import threading
import time
import random
global buffer
lock = threading._allocate_lock()   #objeto para bloquear/liberar as variáveis
event = threading.Event()
class Produtor(threading.Thread):
    def __init__(self,tipos, id):
        super(Produtor, self).__init__()
        self.tipos = list(tipos)
        self.id = id
        self.count_item = 0
        self.repeticoes = 3
    '''Run() é onde as ações da thread são executadas.'''
    def run(self):
        while self.tipos:
            #print("Iniciando produtor ",self.id)
            tipo = self.tipos.pop(self.tipos.index(random.choice(self.tipos))) #selecionando um tipo aleatóriamente
            valor = random.randint(0, 3000)
            lock.acquire()
            print("Produtor {}, produzindo item do tipo {} ({}ms).".format(self.id, tipo, valor))
            self.count_item += 1
            item = Item(tipo, self.id, self.count_item, valor)
            buffer.append(item)
            tempo_espera = random.randint(0, 3000)
            print('Produtor {} irá esperar por {}ms.'.format(self.id, tempo_espera))
            #print("Finalizando produção ",self.id)
            lock.release()
            event.set()
            time.sleep(float(tempo_espera)/1000)
        event.clear()
class Consumidor(threading.Thread):
    def __init__(self, tipos, id):
        super(Consumidor, self).__init__()
        self.tipos = tipos
        self.id = id
    def run(self):
        while buffer:
            #print("Iniciando consumidor", self.id)
            tipo = random.choice(self.tipos)  # selecionando um tipo aleatóriamente
            remocao = False
            lock.acquire()
            for item in buffer:
                if item.tipo == tipo:
                    remocao = True
                    item_removido = buffer.pop(buffer.index(item))
                    print('Consumidor {} consumiu o item {}(tipo {}) do produtor {} ({}ms)'
                          .format(self.id, item_removido.count_produtor, item_removido.tipo,
                                  item_removido.id_produtor,
                                  item_removido.valor))
                    print("Consumidor {} irá esperar por {}ms".format(self.id, item_removido.valor))
                    tempo_espera = float(item_removido.valor) / 1000
                    #print("finalizando consumidor ", self.id)
                    lock.release()
                    time.sleep(tempo_espera)
            if remocao is False:
                lock.release()
class Item:
    def __init__(self, tipo, id_produtor, count_produtor, valor):
        self.tipo = tipo
        self.id_produtor = id_produtor
        self.count_produtor = count_produtor
        self.valor = valor
    @property
    def tipo(self):
        return self._tipo
    @property
    def id_produtor(self):
        return self._id_produtor
    @property
    def count_produtor(self):
        return self._count_produtor
    @property
    def valor(self):
        return self._valor
    @tipo.setter
    def tipo(self, value):
        self._tipo = value
    @id_produtor.setter
    def id_produtor(self, value):
        self._id_produtor = value
    @count_produtor.setter
    def count_produtor(self, value):
        self._count_produtor = value
    @valor.setter
    def valor(self, value):
        self._valor = value
if __name__ == '__main__':
    buffer = []
    lista_threads = []
    '''while True:
        try:
            a, b = map(int, input("Digite a quantidade de produtores e consumidores, separados por virgula, a serem criados,"
                        " respectivamente(No max 5 no total): ").split(','))
            break
        except ValueError:
            print("Digite novamente")'''
    a,b = 3,2
    for i in range(a):
        '''tipo_produtor = tuple(input("Digite os tipos de itens que o Produtor {}"
                                    " irá produzir: ".format(i)).split(','))   #tuple com os tipos do produtor.'''
        tipo_produtor = ('A', "B")
        t = Produtor(tipo_produtor, i)
        t.start()  #start() inicia o método run do objeto thread
        lista_threads.append(t)
    for i in range(b):
        '''tipo_consumidor = tuple(input("Digite os tipos de itens que o Consumidor {}"
                                      " irá consumir: ".format(i)).split(','))  # tuple com os tipos do consumidor.'''
        tipo_consumidor = ('A', 'B')
        t = Consumidor(tipo_consumidor, i)
        t.start()
        lista_threads.append(t)
    '''join() avisa a thread main para esperar essa thread específica finalizar antes de executar a próxima instrução'''
    for thread in lista_threads:
        thread.join()
    print("Execução finalizada.")
