from numpy import random

# it is a generalization of binomial distribution

#radom.multinomial():parameters:
    #n: number of possible outcome. (trial number).
    #pval: outcomes probabilities list
    #size: the shape of returned array, default=1

array_multinomial=random.multinomial(n=4,pvals=[1/100 for _ in range(100)],size=10**(7))

print(array_multinomial)

countO=0
countNo=0

array=[]
for i in range(len(array_multinomial)):
    if array_multinomial[i][37]==3:
        countO+=1
        array.append(i)
    else:
        countNo+=1

if (countO+countNo==100):
    print("se completo las 100")
print(countO)
print(countNo)

