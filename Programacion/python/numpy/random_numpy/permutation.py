import numpy as np 
from numpy import random

#what is a permutarions?

# for this the modulo  NUMPY RANDOM proveé two methods
    #shuffle():     shuffle  means changing arrangement of elements in/place. ie. in the array itself.
    #permutation(): Generate a random permutation of elements of following array:

# what's the difference between shuffle() and permutation()?
#the main difference is that shuffle doesn't return the change o permutation and permutation() yes  
#shuffle()
print("---------------------.shuffle()---------------------")
arr=np.array([i for i in range(5)])

print(arr)
random.shuffle(arr)
print(arr)

#permutation()
print("---------------------.permutation()---------------------")
arr=np.array([i for i in range(5)])

print(arr)
newArr=random.permutation(arr)
print(newArr)

