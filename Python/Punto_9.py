"""Punto 9: Realice un algoritmo que cree un vector de 16 posiciones llenarlo y partirlo en dos de 8 posiciones."""
import random
lista=[0]*16
resultado=list(map(lambda elemento:random.randint(-100,100),lista))
print(f"Lista Original: {resultado}")
resultado1=resultado[0:8]
print(f"Sublista 1: {resultado1}")
resultado2=resultado[8:16]
print(f"Sublista 2: {resultado2}")
