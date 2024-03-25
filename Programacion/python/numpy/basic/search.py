import numpy as np


# for list unorder
# where(condicion):  selecionara a los indices de los  elmentos del array que que cumpla la condicion 
#then is posible find a specific number if we use or define the condicion as arr==FindValor
print("---------------------Where----------------------------------")
arr = np.array([1, 2, 3, 4, 5, 4, 4])

x = np.where(arr ==4)

print(x)


#for list order
#searchsorted(): performs a binary search in the array, and returns the index where the specified value would be inserted to maintain the search order

print("------------------------------searchsorted()------------------------------")

nparray_order=[i for i in range(10)]

index = np.searchsorted(nparray_order,110)

print(index) #this method reurn 0 if the elemeno is not in the array

#The method starts the search from the left and returns the first index where the number 7 is no longer larger than the next value.

#we can give the argument side="right", where star count since right

print("----------search right----------")
index = np.searchsorted(nparray_order,9)
print(index) 


# Multiple Values

nparray_order=[i for i in range(10)]
valorFind1=3
valorFind2=4
valorFind3=7
index = np.searchsorted(nparray_order,[valorFind1,valorFind2,valorFind3])

print(index)

