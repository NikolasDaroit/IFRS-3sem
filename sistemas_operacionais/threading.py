#!/usr/bin/python
# -*- coding: utf-8 -*-

#import _thread
#import time
#import random
#import sys
#import threading

from threading import Thread, _allocate_lock, Event
import time
import random
from queue import Queue
from collections import deque
queue = Queue(10)
lock = _allocate_lock()   #objeto para bloquear/liberar as variáveis
event = Event()
#length_max = int(sys.argv[1])#
#s = _thread.allocate_lock()

# buffer de itens, 1 para cada allowed_type, maximo 8 posicoes
buffer_itens = {1:[], 2:[], 3:[], 4:[], 5:[]}
global buffer_list
buffer_list = []
num_producer = 5#int(input('Digite numero de produceres: '))
num_producer = (num_producer if num_producer <= 5 else 5)
num_consumer = 5#int(input('Digite numero de consumeres: '))
num_consumer = (num_consumer if num_consumer <= 5 else 5)
print (num_producer, num_consumer)


class Producer(object):

    """docstring for Producer"""

    def __init__(self, allowed_types=None):
        super(Producer, self).__init__()
        self._id = random.randint(1, 100)
        self.count = 0
        if allowed_types is None:
            self._allowed_types = set()
        else:
            self._allowed_types = allowed_types


    def get_allowed_type(self):
        """I'm the 'x' property."""

        return list(self._allowed_types)

    def __str__(self):
        return str([t for t in self._allowed_types])

    def __repr__(self):
        return "id: {}".format(self._id)
class Consumidor(Producer):

    """docstring for Consumidor"""


produceres = []
consumeres = []
produceres_deque = deque()
consumeres_deque = deque()


def getinputs(prodcons, num):
    """ prodcons receive \"prod\" to create producer
   prodcons receive \"cons\" to create consumer 
   num is how many you want to create
   """

    allowed_type = -1
    for i in range(0, num):
        allowed_types = set()

        """
        while len(allowed_types) != 5:
            #allowed_type =  random.randint(0, 5)
            allowed_type = \
                int(input('Digite o allowed_type (1 a 5) para dicionar ao %s %i \n0 para finalizar: '
                       % (prodcons.upper(), i)))
            if allowed_type == 0:
                break
            elif allowed_type > 0 and allowed_type <= 5:
                allowed_types.add(allowed_type)
            else:
                print('Tipo errado, sabe ler n\xc3\xa3o?')
        """ 
        if prodcons == 'prod':
            
            allowed_types = set()
            for i in range(1,6):
                allowed_types.add(random.randint(1, 5))
            
            # allowed_types = [1,2,3,4,5]
            a = Producer(allowed_types)
            produceres.append(a)
            produceres_deque.append(a)
            print("PROD", a._id, a)
        elif prodcons == 'cons':
            allowed_types = set()
            for i in range(1,6):
                allowed_types.add(random.randint(1, 5))
            
            # allowed_types = [1,2,3,4,5]
            a = Consumidor(allowed_types)
            consumeres.append(a)
            consumeres_deque.append(a)
            print("CONS", a._id, a)
        


getinputs('prod', num_producer)
getinputs('cons', num_consumer)


class Item(object):

    """docstring for Producer"""

    def __init__(
        self,
        allowed_type,
        producer,
        count,
        ):
        super(Item, self).__init__()
        self.allowed_type = allowed_type
        self.producer = producer
        self.count = count

    def __str__(self):
        return int(self.allowed_type)

    def __repr__(self):
        return str(self.allowed_type)

"""
- O producer, a cada produção, cria um item de um allowed_type escolhido aleatoriamente entre os allowed_types que ele está
apto a produzir;
- Cada item produzido conterá o allowed_type do item, o ID do seu respectivo producer, qual o número (count) do
item produzido por aquele producer, e um valor aleatório entre 0 e 3000 (milissegundos);
- Após produzir um item, o producer deverá dormir um tempo aleatório entre 0 e 3000 milissegundos;
- Os produceres sempre escrevem na tela os itens que estão producing e o tempo que irão dormir.
- Os consumeres consomem um item dentre os allowed_types que ele está apto a consumir, mostrando seu
conteúdo na tela, e depois indo dormir o tempo especificado no item;
"""
class ProducerThread(Thread):
    def __init__(self, types):
        Thread.__init__(self)
        self.producer = produceres_deque.popleft()
        produceres_deque.append(self.producer)
        self.types = list(types)
    def run(self):
        while self.types:
            allowed_type = self.types.pop(random.randrange(len(self.types)))
            lock.acquire()
            print("producer %i runnning"%(self.producer._id))
            self.producer.count += 1
            print("producer %i creating item %i"%(self.producer._id,allowed_type))
            soneca = random.randint(10000, 15000)
            count = self.producer.count
            item = Item(allowed_type, self.producer._id, count)
            buffer_list.append(item)
            print("producer %i sleeping por %ims"%(self.producer._id,soneca))
            print("buffer is now %s "%(buffer_list))
            lock.release()
            event.set()
            time.sleep(soneca)
        event.clear()
                
            

class ConsumerThread(Thread):
    def __init__(self, types):
        Thread.__init__(self)
        self.consumer = consumeres_deque.popleft()
        consumeres_deque.append(self.consumer)
        self.types = list(types)
    def run(self):
        while buffer_list:
            buff = [i.allowed_type for i in buffer_list]
            allowed_type = random.choice(self.types)
            print("AT %s - BUFF %s "%(allowed_type, buff))
            
            lock.acquire()
            print("consumer %i runnning. Allowed %s Buffer %s"%(self.consumer._id, allowed_type, buffer_list))
            removed = False
            for item in buffer_list:

                if allowed_type == item.allowed_type:
                    removed = True
                    buffer_list.remove(item)
                    print("consumer %i consuming item %i"%(self.consumer._id,allowed_type))
                    self.consumer.count += 1
                    print("consumindo item %i"%allowed_type)
                    soneca = random.randint(10000, 15000)
                    count = self.consumer.count                 
                    print("consumer %i sleeping por %ims"%(self.consumer._id,soneca))
                    print("buffer is now %s "%(buffer_list))
                    lock.release()
                    time.sleep(soneca)
            if removed is False:
                lock.release()

                    
                   
def createthreads():
    threads = []
    for producer in produceres:
        thread = ProducerThread(producer.get_allowed_type())
        threads.append(thread)
        thread.start()

    for consumer in consumeres:
        thread = ConsumerThread(consumer.get_allowed_type())
        threads.append(thread)
        thread.start()
    
    random.shuffle(threads)
    for thread in threads:
        thread.join()

    

while True:
    
    createthreads()
