import numpy as np

nparray_1=np.array([i for i in range(100000)])
nparray_2=np.array([i for i in range(100000)])


# np.add() ~ sum parameters:}
    # ---
print("--------------------------sum-----------------")
print(np.add(nparray_1, nparray_2))

# npp.substract() ~ subtraction
print("--------------------------substract-----------------")
print(np.subtract(nparray_1, nparray_2))
# np.multiply() ~ multiplication
print("--------------------------multiplications-----------------")
print(np.multiply(nparray_1,nparray_2))

# np.divide() ~ division
print("--------------------------division-----------------")
print(np.divide(np.append(nparray_1[1:],[1],axis=0),np.append(nparray_2[1:],[1],axis=0) ) )

# np.power() ~ exponentiation
print("--------------------------exponentiation-----------------")
print(np.power(nparray_1,nparray_2))

#np.mod ~ mod (xdxdx)
print("--------------------------remainder-----------------")
print(np.mod(np.append(nparray_1[1:],[1],axis=0),np.append(nparray_2[1:],[1],axis=0) ) )

#no.divmod ~ [[quitiendt],[mod]]
print("--------------------------quotient and remainder-----------------")
print(np.divmod(np.append([1],nparray_1[1:]),np.append([1],nparray_1[1:]) ))

# np.absolute ~ abs()
print("--------------------------absolute-----------------")

print("---No absolute----")
nparray_noAbs=np.array([i -5 for i in range(11)])
print(nparray_noAbs)

print("---absolute----")
nparray_Abs=np.absolute(nparray_noAbs)
print(nparray_Abs)




