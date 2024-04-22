from numpy import random
import matplotlib.pyplot as plt 
import seaborn as sns


# Ziof distributions are used to samoe date based on zipf's law

# What's  Zipf's Law?
    #In a collection, the nth common term is 1/n the most common term.


# random,zipf() parameters:
    # a: distribution parameter, a >=1
    # size: The shape of the returned array

nparray_zipf=random.zipf(a=2,size=100)

sns.displot(nparray_zipf)

plt.savefig('./numpy/random_numpy/zipf_distribution.jpg',format='jpg')                                    

