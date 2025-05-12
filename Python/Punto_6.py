"""Punto 6: Realice un algoritmo que cree un vector de longitud n donde n lo define el usuario calcula número mayor y menor"""
import random
n=int(input("Ingrese un tamaño para el arreglo: "))
lista=[0]*n
resultado=list(map(lambda elemento:random.randint(-100,100),lista))
print(resultado)
maximo=max(resultado)
minimo=min(resultado)
print(f"Máximo: {maximo}")
print(f"Mínimo: {minimo}")
