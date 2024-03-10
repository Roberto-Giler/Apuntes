import random
import enum

class Kid(enum.Enum):
    BOY = 0
    GIRL = 1
def random_kid() -> Kid:
    return random.choice([Kid.BOY, Kid.GIRL])
both_girls = 0
older_girl = 0
either_girl = 0
random.seed(0)

for _ in range(10000):
    younger = random_kid()
    older = random_kid()
    if older == Kid.GIRL:
        older_girl += 1
    if older == Kid.GIRL and younger == Kid.GIRL:
        both_girls += 1
    if older == Kid.GIRL or younger == Kid.GIRL:
        either_girl += 1

print("P(both | older):", both_girls / older_girl) # 0.514 ~ 1/2
print("P(both | either): ", both_girls / either_girl) # 0.342 ~ 1/3

P_DT=0.01*(1/10000)/(0.01*(1/10000)+0.99*(9999/10000))*100
P_DNT=0.99*(1/10000)/(0.99*(1/10000)+0.01*(9999/10000))*100

print(P_DT)
print(P_DNT)
print(P_DT+P_DNT)
print((1/10000)*100)

Numero=[(x+1)*(1/10000) for x in range(12)]

print(Numero)
