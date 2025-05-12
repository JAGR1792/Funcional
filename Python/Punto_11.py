"""Punto 11: Realice un algoritmo que cree tres vectores de 10 posiciones, los lea y asigne sus valores a una matriz x(3,10). imprimir la matriz."""
vector1=[0]*10
vector2=[0]*10
vector3=[0]*10
vector1=list(map(lambda elemento:int(input("Ingrese un número: ")),vector1))
vector2=list(map(lambda elemento:int(input("Ingrese un número: ")),vector2))
vector3=list(map(lambda elemento:int(input("Ingrese un número: ")),vector3))
matriz=[0]*3
matriz[0]=vector1
matriz[1]=vector2
matriz[2]=vector3
print(matriz)
