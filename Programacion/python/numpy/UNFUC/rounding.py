import numpy as np
from numpy import random

random.seed(0)

array_decimal=np.array([(random.rand()-0.5)*20 for _ in range(10)])
print(f" decimals array: {array_decimal}")

# How can we rounding in munpy?
    #There are primarilyfive ways of rounding off decimals
        # Trucantions: remove the decimals
        # fix: remove the decimals
        # rounding; Rounding
        # floor: Rounding to nearest lower integer
        # cell: Rounding to nearest upper integer

# Remove the decimals
#Trucation: remove the decimals
# np.trunc()
print("--------------------------------------Truncamineto--------------------------------------")
print(np.trunc(array_decimal))


# fix(): remove the decimals
#np.trunc()
print("--------------------------------------fix--------------------------------------")
print(np.fix(array_decimal))

# Rounding: increments a digit a(n+1) if a(n)>=5
#np.around()
print("--------------------------------------fix--------------------------------------")
print(np.around(array_decimal))

# floor: round to the nearest lower integer 
print("--------------------------------------floor--------------------------------------")
print(np.floor(array_decimal))

# ceil ~ round to nearest upper integer (¬floor)
print("--------------------------------------floor--------------------------------------")
print(np.ceil(array_decimal))



# print(f"trunc type: {type(np.trunc)}")
# print(f"fix type : {np.fix}")
