import random
n=int(input("Ingrese un tamaño para el vector: "))
lista=[0]*n
"""Se recorre cada posición del arreglo con map, cambiando el elemento
   por un número ingresado por usuario"""
resultado=list(map(lambda elemento:int(input("Ingrese un número: ")),lista))
# Se calculan el elemento mayor ingresado y su posicion en el vector
maximo=max(resultado)
posicion=resultado.index(maximo)
# Se imprimen la lista creada, su elemento mayor y su posición
print(resultado)
print(f"Máximo: {maximo}")
print(f"Posición del máximo: {posicion}")
