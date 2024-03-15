import numpy as np

#it is posible split using the numpy funtion array_split(nparray,numeroDePartes), where return numeroDePartes array
nparray=np.array([i for i in range(10)])

print(np.array_split(nparray,2))

    # notese que el array 


# Para cortar nparray de N-D, donde N>1, es posible usar el ARGUMENTO axis=m, m<n

print("----------------------Split()-N-D--------------------")

arr = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9], [10, 11, 12], [13, 14, 15], [16, 17, 18]])

newarr = np.array_split(arr, 3, axis=1)#cortara apartir del eje de entrada

print(newarr)


#hsplit(), Use the hsplit() as alternate solution the least case to  method to split the 2-D array into three 2-D arrays along rows.

print("--------------------hsplit()-------------------")

arr = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9], [10, 11, 12], [13, 14, 15], [16, 17, 18]])

newarr = np.hsplit(arr, 3)

print(newarr)

#
#similar alternative are to "vstack() and dstack() are available as vsplit() a]nd dsplit()].

