"""Punto 10: Realice un algoritmo que cree una matriz m(4,5), la llene y calcule la posición de un valor en una matriz ingresado por el usuario"""
import random
import numpy as np

matriz = np.random.randint(-100, 100, size=(4, 5))
print("Matriz:")
print(matriz)

valor = int(input("Ingrese un valor: "))
posicion = np.where(matriz == valor)

if posicion[0].size > 0:
    print(f"El valor {valor} se encuentra en la posición ({posicion[0][0]}, {posicion[1][0]})")
else:
    print(f"El valor {valor} no se encuentra en la matriz")
