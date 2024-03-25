import numpy as np
from typing import List
array: List[int]=np.array([1,2,3,4]) #create an ndarray 

print(np.__version__) #show the version
print(type(array)) 


#ndarray 


#0-D
array_0_D: List[int]=np.array(23) #create an ndarray 


#1-D
array_1_D: List[int]=np.array([23, 23, 23, 2, 32]) #create an ndarray 


#2-D__Matrices
array_2_D: List[int]=np.array([[1, 2, 3], [4, 5, 6]]) #Destaquese que numpy posee modulos especializadas para trabajar con matrices como numpy.mat


#3-D, (tambien conocido mo 3-D tensores)
array_3_D: List[int]=np.array([[[1, 2, 3], [4, 5, 6]],[[1, 2, 3], [4, 5, 6]]]) #Destaquese que numpy posee modulos especializadas para trabajar con tensores


#ndim, es un atributo de la clase ndarray que contiene la dimesion del objeto
print(array_0_D.ndim)
print(array_1_D.ndim)
print(array_2_D.ndim)
print(array_3_D.ndim)


#When the array is created, you can define the number of dimensions by using the ndmin argument.
array_5_D: List[int]=np.array([1, 2, 3],ndmin=5) 
print(array_5_D.ndmin)

