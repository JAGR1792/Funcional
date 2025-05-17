# Se importa el modulo random para generar números pseudoaleatorios
import random
# Se crea un arreglo de tamaño 15 lleno de ceros
lista=[0]*15
"""Se recorre cada posición del arreglo con map, reemplazando el elemento
   por un número entre -100 y 100"""
resultado=list(map(lambda elemento:random.randint(-100,100),lista))
# Se imprime la lista original, ordenada de menor a mayor y de mayor a menor
print(f"Lista Original: {resultado}")
orden=sorted(resultado)
print(f"Lista Orden Ascendente: {orden}")
orden_inverso=sorted(resultado,reverse=True)
print(f"Lista Orden Descendente: {orden_inverso}")
