import numpy as np
import random 
random.seed(0)

ndarray_1_D=np.array([random.randrange(100) for _ in range(10)])



# ndarrayWorng=np.array([[1 for _ in range(10)],[3]]) error por que el array no es homogenio 
# acceder a los elmentos ndarray[] de 1-D
[print(ndarray_1_D[i]) for i in range(len(ndarray_1_D))]


# acceder a los elmentos ndarray[] de n-D 
# ndarray[p_1,p_2,...,p_n] donde se acedera a la a la posicion (p_1,p_2,...,p_n)

ndarray_2_D=np.array([[random.randrange(100), random.randrange(100)] for _ in range(10)])

[print(p_1,p_2,ndarray_2_D[p_1,p_2]) for p_1 in range(len(ndarray_2_D))
                                 for p_2 in range(len(ndarray_2_D[0]))
]

#Slicing
start=0
end=4
step=1     #puede ser negativo

print(ndarray_1_D[start:end:step])
print(ndarray_1_D[start:])
print(ndarray_1_D[:end])

#Slicing 2_D
print("-----------Slicing 2-----------")
print(ndarray_2_D[1:3,:len(ndarray_2_D[0])])

#De manera similar para N_D, D>2

print(np.array([i for i in range(10)])[2:9])


#ver las dimenciones completas, con el atributo shape
ndarray=np.array([1 for _ in range(10)])



print(ndarray.shape)


arr = np.array([1, 2, 3, 4], ndmin=5)
print(arr.shape,arr[0,0,0,0,:])


