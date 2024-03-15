import numpy as np 

#es posible interar sobre un numpy array usando bucles for

nparray_1_D=np.array([i for i in range(10)])




for elemn in nparray_1_D:
    print(elemn)

nparray_2_D=np.array([ [f"0-{i}" for i in range(10)], [f'1-{i}' for i in range(10)] ])
print(nparray_2_D)

print([elem for fila in nparray_2_D
            for elem in fila])


    
    #notese que a altas dimensiones iterar de esta manera  puede producir inconvenientes

# using the funtion nditer(), 


nparray_100_D=np.array([i for i in range(10)],ndmin=32)#OBSERVACION: el maximo de dimensiones permitida es 32
print(nparray_100_D)

for elem in np.nditer(nparray_100_D):
    print(elem)



#iterating numpy array with different data types 
 # it's posible use the argument in nditer() "op_dtypes" for change the type de elements while iterating
 # for the least is requiered have a other space to perform this action, this can to get using the argument flags=[buffered']

# for elem in np.nditer(nparray_2_D,flags=['buffered'],op_dtypes=['S2']):
#     print(elem)

print(nparray_1_D)


# enumerate the array

for idx, x in np.ndenumerate(nparray_100_D):
    print(idx,x)



