#Numoy ofrece 
from numpy import random


# .randint(value) devuelve un valor entero entre 0 y value
print("---------------------------.randint()---------------------------")
x = random.randint(7)

print(x)

arr=random.randint(100, size=(3,5)) #the size parameter specify the shape of an array

print(arr)

# .rand() genera un numero alelorio entre 0 y 1
print("----------------------.rand()--------------------")

x=random.rand()
print(x)

arr=random.rand(3,5)
print(arr)
print(type(arr))


#.choice() choose a element ramdonly in a array.
print("----------------------.choice()--------------------")
arr=[i for i in range(10)]
print(arr)


ch=random.choice(arr)
print(ch)

arrFlit = random.choice(arr, size=(3, 5))

print(arrFlit)


