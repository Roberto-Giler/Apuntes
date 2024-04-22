from numpy import random
import matplotlib.pyplot as plt
import seaborn as sns

#Rayleight Distribution is used in a signal processing 

#random.rayleight() parameters:
    #scale: Standard derivation: default 1.0:
    #size: The shape of the returned array 

nparray_rayleight=random.rayleigh(scale=1,size=10000)

sns.displot(nparray_rayleight)

plt.savefig('./numpy/random_numpy/rayleight_distributions.jpg',format='jpg')                                    

#At unit stddev and 2 degrees of freedom rayleigh and chi square represent the same distributions                                          