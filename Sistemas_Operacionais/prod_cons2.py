# -*- coding: ISO-8859-1 -*-

import thread
import time, random
import sys

length_max = int(sys.argv[1])
s = thread.allocate_lock()
# buffer de itens, 1 para cada tipo, maximo 8 posicoes
t1 = []
t2 = []
t3 = []
t4 = []
t5 = []

num_produtor = int(input("Digite numero de produtores: "))
num_produtor = num_produtor if num_produtor<=5 else 5
num_consumidor = int(input("Digite numero de consumidores: "))
num_consumidor = num_consumidor if num_consumidor<=5 else 5
print(num_produtor, num_consumidor)
class Produtor(object):
   """docstring for Produtor"""
   def __init__(self, tipos=None):
      super(Produtor, self).__init__()
      if tipos is None:
         self._tipos = set()
      else:
         self._tipos = tipos
   
   
   def get_tipo(self):
        """I'm the 'x' property."""
        return self._tipos

   def __str__(self):
      return str([t for t in self._tipos])
class Consumidor(Produtor):
   """docstring for Consumidor"""

produtores = []
consumidores = []
def getinputs(prodcons, num):   
   """ prodcons receive \"prod\" to create producer
   prodcons receive \"cons\" to create consumer 
   num is how many you want to create
   """ 
   tipo = -1
   for i in range(0, num):
      tipos = set()
      while len(tipos) != 5:
         tipo = input("Digite o tipo (1 a 5) para dicionar ao %s %i \n0 para finalizar: "%(prodcons.upper(),i))
         if tipo == 0:
            break
         elif tipo >0 and tipo<=5:
            tipos.add(tipo)
         else:
            print "Tipo errado, sabe ler não?"
      
      if prodcons == "prod":
         a = Produtor(tipos)
         produtores.append(a)
      
      elif prodcons == "cons":
         a = Consumidor(tipos)
         consumidores.append(a)
      
      print a

getinputs("prod", num_produtor)
getinputs("cons", num_consumidor)
      


def tempo(i):
   t = random.randint(3,7)
   print "Processo %i dormindo por %i" %(i, t)
   time.sleep(t)

def thread1():
   while True:
      print "Processo 1 - Adquirindo semáforo"
      s.acquire()
      print "Processo 1 - Seção crítica"
      tempo(1)
      print "Processo 1 - Liberando semáforo"
      s.release()
      print "Processo 1 - seção não crítica"
      tempo(1)

def thread2():
   while True:
      print "Processo 2 - Adquirindo semáforo"
      s.acquire()
      print "Processo 2 - Seção crítica"
      tempo(2)
      print "Processo 2 - Liberando semáforo"
      s.release()
      print "Processo 2 - seção não crítica"
      tempo(2)

thread.start_new_thread(thread1, ())
thread.start_new_thread(thread2, ())

while 1: pass