from numpy import random
import matplotlib.pyplot as plt
import seaborn as sns

#It fits the probability distribution of many events, eg. IQ Scores, Heartbeat etc.

#random.normal(): we get a normal distribution data.
#parameters:
    #loc-(Mean) where peak of the bell exists
    #scale-(standard deviation) ho flat the gra´h distribution shoulb se
    #size.the shape of the returned array


sns.displot(random.normal(size=10**(0),scale=1,loc=0))

plt.savefig("distribucion_normal.jpg", format="jpg")


