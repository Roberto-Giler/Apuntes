# is posible resahping a nparray using the nethod reshape()
import numpy as np


nparray=np.array([ [i for i in range(8)],[i for i in range(8)] ])

print(nparray)


dimen=[4,4]

nparray_modify=nparray.reshape(dimen) #notese que el producto de las dimensiones de dim debe ser igual al numero de elmentos del array original

print(f"El numpy array sin modificar la forma:{nparray} /n el array cpn la forma modificada {nparray_modify}")

print(nparray.base)
print(nparray_modify.base)#Es una view


nparray[1,:]=[1]#se le asigna a toda la fila 1 los el valor de 1 en cada uno de las casillas
print(nparray[1,:])

#unknow dimensional hacer que el valor se adapte al arrau original
print(nparray.reshape(-1)) #solo puede haber una sola dimension d esconocida






