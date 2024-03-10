import sys, re
from collections import Counter
from typing import Dict, Set,List

import matplotlib.pyplot as plt
import math
import random
import statistics as stt


press_releases: Dict[str, Set[str]] = {}
print(press_releases)


numero: float=math.pi
print(f'el numero es {numero} y su tipo es  {type(numero)}')

print([x for x in range(5)])

listaNumerosN: List[List[float]]=[]
for NListas in range(1000):
    listaNumerosN.append([])
    for i in range(1000):
        ra=random.random()*2-1
        if ra<0:
            listaNumerosN[NListas].append(ra)

lenNegativos: List[float]=[len(x) for x in listaNumerosN]

print(stt.mean(lenNegativos))

print("-----------------Otra Prueba-----------------")


print("------------Prueba 1------------")
listaP1_1=[[i,i*2] for i in range(10)]
listaP1_2=[elem for elem in listaP1_1] # Crea una copia

listaP1_1[0]=(12,1)
print(listaP1_1)
print(listaP1_2)



print(listaP1_1==listaP1_2)

print("DESPUES DEL CAMBIO")

listaP2_1=[[i,i*2] for i in range(10)]
listaP2_2=listaP2_1 #apuntan a la misma direccion

print("------------Prueba 2------------")

listaP2_1[0]=(12,1)
print(listaP2_1)
print(listaP2_2)





print(listaP2_1==listaP2_2)

print("------------Prueba 3------------")


import csv
with open('iris.dat') as f:
    readerf=csv.reader(f)
    data=[row for row in readerf]

print(data[1])

print(84/(25+84))
print(84/(44+84))

array=[]
array2=[(i*2) for i in range(10)]
array3=[(i*3) for i in range(10)]
array.append(array2)
print(array)
array.append(array3)
print(array)


print("ddd"*2)
