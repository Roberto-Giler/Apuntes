import numpy as np 
# it's posible use concatenate() funtion,that concatenate along with the axis
print("-------------concatenate-----------------")
arr1 = np.array([1, 2, 3])

arr2 = np.array([4, 5, 6])

arr_concatenated = np.concatenate((arr1, arr2)) # if axis I is not give him, then will take axis=0

print(arr_concatenated)

# specifining  axis
print("-------------concatenate_ForInstance-----------------")
arr1 = np.array([[1, 2], [3, 4]])

arr2 = np.array([[5, 6], [7, 8]])

arr = np.concatenate((arr1, arr2), axis=1)

print(arr)


# Joining Arrays Using Stack Functions.
# Stack 

print("-----------------Stacking---------------")
arr1 = np.array([[1, 2, 3],[4, 5, 6]])

arr2 = np.array([[4, 5, 6],[1, 2, 3]])

arr = np.stack((arr1, arr2), axis=2)

print(arr)




# hstack(): NumPy provides a helper function: hstack() to stack along rows.


arr1 = np.array([1, 2, 3])

arr2 = np.array([4, 5, 6])

arr = np.hstack((arr1, arr2))

print(arr)

# NumPy provides a helper function: vstack()  to stack along columns.



arr1 = np.array([1, 2, 3])

arr2 = np.array([4, 5, 6])

arr = np.vstack((arr1, arr2))

print(arr)

# NumPy provides a helper function: dstack() to stack along height, which is the same as depth.


arr1 = np.array([1, 2, 3])

arr2 = np.array([4, 5, 6])

arr = np.dstack((arr1, arr2))

print(arr)








