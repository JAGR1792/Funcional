import random
lista=[0]*16
resultado=list(map(lambda elemento:random.randint(-100,100),lista))

resultado1=resultado[0:8]
resultado2=resultado[8:16]
print(f"Lista Original: {resultado}")
print(f"Sublista 1: {resultado1}")
print(f"Sublista 2: {resultado2}")
