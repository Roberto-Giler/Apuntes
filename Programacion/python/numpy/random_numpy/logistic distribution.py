from  numpy import random
import matplotlib.pyplot as plt
import seaborn as sns
# the logistic distribution i used for to describe growth.

# random.logistic() parameters 
    # loc: mean. Default 0.
    # scale: standard derivation. Default 1.
    # the shape of the returned array.

arrayLogistic=random.logistic(loc=0, scale=1, size=100)
print(arrayLogistic)

sns.displot(random.logistic(loc=0, scale=1,size=100))
plt.savefig("Logistic distribution.jpg", format="jpg")

