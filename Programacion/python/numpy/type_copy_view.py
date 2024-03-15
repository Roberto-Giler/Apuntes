import numpy as np

# i - integer
# b - boolean
# u - unsigned integer
# f - float
# c - complex float
# m - timedelta
# M - datetime
# O - object
# S - string
# U - unicode string
# V - fixed chunk of memory for other type ( void )

#For i, u, f, S and U we can define size as well.

arrayOfInt=np.array([1,2,3,4]) 
arrayOfStr=np.array(['string_1',"string_2","string_3","string_4"]) 
print(arrayOfInt.dtype)
print(arrayOfStr.dtype)

arr = np.array([1, 2, 3, 4], dtype='S')

#ejemplo 
arr = np.array([1, 2, 3, 4], dtype='i4')


#covertir una nparray
nparray=np.array([2,"2","3",4,"0",1])
newnparray=nparray.astype(int) #
print(newnparray)

print(newnparray.astype(bool))


# Copy
nparrayCopy=nparray.copy()


#view
nparrayView=nparray.view()





nparrayReas = nparray

nparray[0]=2222

print(nparrayReas)
print(nparray)


#attribute "base"
print("--------------base----------------")
print(nparray.base)
print(nparrayCopy.base)
print(nparrayView.base)
print(nparrayReas.base)


