# Se importa el modulo random para generar números pseudoaleatorios
import random
# Se solicita ingresar el tamaño del arreglo
n=int(input("Ingrese un tamaño para el arreglo: "))
# Se crea un arreglo del tamaño solicitado lleno de ceros
lista=[0]*n
"""Se recorre cada posición del arreglo con map, cambiando el elemento
   por un número entre -100 y 100"""
resultado=list(map(lambda elemento:random.randint(-100,100),lista))
# Se imprime la lista generada
print(resultado)
# Se guardan el número mayor y menor de la lista en maximo y minimo
maximo=max(resultado)
minimo=min(resultado)
# Se imprimen los elementos mayor y menor
print(f"Máximo: {maximo}")
print(f"Mínimo: {minimo}")
