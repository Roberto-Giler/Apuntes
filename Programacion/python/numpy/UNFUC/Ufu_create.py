import numpy as np
# is create with the command frompyfunc(), yours parameters are:
    # function: the functions name.
    # inputs: the imput number.
    # outputs: the output number.

def myadd(x1,x2):
    return x1+x2
npmyadd=np.frompyfunc(myadd,2,1)

nparray_1=[i for i in range(10000000)]
nparray_2=[i for i in range(10000000)]

print(npmyadd(nparray_1,nparray_2))

print(type(myadd),type(npmyadd))
