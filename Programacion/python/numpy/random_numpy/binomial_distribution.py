from numpy import random 

import matplotlib.pyplot as plt

import seaborn as sns

# Binomial Distribution is a Discrete Distribution.


#random.binomial(): we get a binoomial distribution data.
#parameters:
    # n: number of trial
    # p: probability of occurence of each trial.
    #size.the shape of the returned array

binomial_array=random.binomial(n=20,p=0.5,size=20)
print(binomial_array)


sns.displot(random.binomial(n=100,p=0.5,size=10000))

plt.savefig("binomia distribution.jpg",format="jpg")
