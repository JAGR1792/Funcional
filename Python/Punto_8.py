"""Punto 8: Realice un algoritmo que lea una secuencia de 20 números almacenarlos en un vector y mostrar la posición donde se encuentra el mayor valor leído"""
import random
n=int(input("Ingrese un tamaño para el arreglo: "))
lista=[0]*n
resultado=list(map(lambda elemento:int(input("Ingrese un número: ")),lista))
print(resultado)
maximo=max(resultado)
print(f"Máximo: {maximo}")
posicion=resultado.index(maximo)
print(f"Posición del máximo: {posicion}")
