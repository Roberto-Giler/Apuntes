from numpy import random
import matplotlib.pyplot as plt 
import seaborn as sns

#Chi Squeare distribution is ised as a basis to verify the hypothesis

#Chi Square Distribution parameters>
    # df: degree of freedom
    # size: the shape of the returned array

arr=random.chisquare(df=2, size=10**5)

sns.displot(arr)
plt.savefig('./numpy/random_numpy/Chiramdom_Square_distribution.jpg',format='jpg')



    