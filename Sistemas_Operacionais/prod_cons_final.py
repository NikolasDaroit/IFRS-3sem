#!/usr/bin/python
# -*- coding: utf-8 -*-

import _thread
import time
import random
import sys
import threading

#length_max = int(sys.argv[1])#
s = _thread.allocate_lock()

# buffer de itens, 1 para cada tipo, maximo 8 posicoes
buffer_itens = {1:[], 2:[], 3:[], 4:[], 5:[]}

num_produtor = int(input('Digite numero de produtores: '))
num_produtor = (num_produtor if num_produtor <= 5 else 5)
num_consumidor = int(input('Digite numero de consumidores: '))
num_consumidor = (num_consumidor if num_consumidor <= 5 else 5)
print (num_produtor, num_consumidor)


class Produtor(object):

    """docstring for Produtor"""

    def __init__(self, tipos=None):
        super(Produtor, self).__init__()
        self._id = random.randint(100, 1000)
        self.contador = 0
        if tipos is None:
            self._tipos = set()
        else:
            self._tipos = tipos


    def get_tipo(self):
        """I'm the 'x' property."""

        return list(self._tipos)

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
            tipo = \
                int(input('Digite o tipo (1 a 5) para dicionar ao %s %i \n0 para finalizar: '
                       % (prodcons.upper(), i)))
            if tipo == 0:
                break
            elif tipo > 0 and tipo <= 5:
                tipos.add(tipo)
            else:
                print('Tipo errado, sabe ler n\xc3\xa3o?')

        if prodcons == 'prod':
            a = Produtor(tipos)
            produtores.append(a)
        elif prodcons == 'cons':

            a = Consumidor(tipos)
            consumidores.append(a)

        print(a)


getinputs('prod', num_produtor)
getinputs('cons', num_consumidor)


class Item(object):

    """docstring for Produtor"""

    def __init__(
        self,
        tipo,
        produtor,
        contador,
        ):
        super(Item, self).__init__()
        self.tipo = tipo
        self.produtor = produtor
        self.contador = contador

"""
- O produtor, a cada produção, cria um item de um tipo escolhido aleatoriamente entre os tipos que ele está
apto a produzir;
- Cada item produzido conterá o tipo do item, o ID do seu respectivo produtor, qual o número (contador) do
item produzido por aquele produtor, e um valor aleatório entre 0 e 3000 (milissegundos);
- Após produzir um item, o produtor deverá dormir um tempo aleatório entre 0 e 3000 milissegundos;
- Os produtores sempre escrevem na tela os itens que estão produzindo e o tempo que irão dormir.

- Os consumidores consomem um item dentre os tipos que ele está apto a consumir, mostrando seu
conteúdo na tela, e depois indo dormir o tempo especificado no item;
"""
def thread_produtor(produtor):
    while True:
        # maximo de 8 itens no buffer
        tipo = random.choice(produtor.get_tipo())
        if len(buffer_itens[tipo])<8:
            print("produtor %i iniciado"%produtor._id)
            s.acquire()
            produtor.contador += 1
            print("produzindo item %i"%tipo)
            soneca = random.randint(0, 3000)
            contador = produtor.contador
            item = Item(tipo, produtor._id, contador)
            buffer_itens[tipo].append(item)
            print("Produtor %i Dormindo por %ims"%(produtor._id,soneca))
            s.release()
            time.sleep(soneca)

        else: 
            continue

#for prod in produtores:
#    _thread.start_new_thread(thread_produtor(prod), ())


"""def tempo(i):
    t = random.randint(3, 7)
    print 'Processo %i dormindo por %i' % (i, t)
    time.sleep(t)
"""

"""def thread1():
    while True:
        print 'Processo 1 - Adquirindo sem\xc3\xa1foro'
        s.acquire()
        print 'Processo 1 - Se\xc3\xa7\xc3\xa3o cr\xc3\xadtica'
        tempo(1)
        print 'Processo 1 - Liberando sem\xc3\xa1foro'
        s.release()
        print 'Processo 1 - se\xc3\xa7\xc3\xa3o n\xc3\xa3o cr\xc3\xadtica'
        tempo(1)


def thread2():
    while True:
        print 'Processo 2 - Adquirindo sem\xc3\xa1foro'
        s.acquire()
        print 'Processo 2 - Se\xc3\xa7\xc3\xa3o cr\xc3\xadtica'
        tempo(2)
        print 'Processo 2 - Liberando sem\xc3\xa1foro'
        s.release()
        print 'Processo 2 - se\xc3\xa7\xc3\xa3o n\xc3\xa3o cr\xc3\xadtica'
        tempo(2)"""


#thread.start_new_thread(thread1, ())
#thread.start_new_thread(thread2, ())

while 1:
    for prod in produtores:
        _thread.start_new_thread(thread_produtor(prod), ())

