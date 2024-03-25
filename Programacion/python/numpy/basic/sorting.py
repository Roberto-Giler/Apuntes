import numpy as np
import random

#sort(): Ordered sequence is any sequence that has an order corresponding to elements, like numeric or alphabetical, ascending or descending.
print("--------------------sort()--------------------")
random.seed(0)

nparray_unorder_1=[i*(-1)**(i) for i in range(10)]
nparray_unorder_2=[random.randrange(-100,100) for _ in range(10)]

print("Listas no ordenadas")
print( nparray_unorder_1 )
print( nparray_unorder_2 )

print("Listas ordenadas")
print( np.sort( nparray_unorder_1 ) )
print( np.sort( nparray_unorder_2 ) )


#it is posible ordered other type data


arr = np.array(['banana', 'cherry', 'apple'])

print(np.sort(arr))



arr = np.array([True, False, True])

print(np.sort(arr))



