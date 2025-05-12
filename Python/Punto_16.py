"""Punto 16: Escriba una función que cuente el número de números positivos de una lista.

Ejemplo: cuentaPositivos([0,1,-3,-2,8,-1,6]) = 3"""
def cuentaPositivos(lista):
  return len(list(filter(lambda elemento: elemento>0,lista)))
lista=[0,1,-3,-2,8,-1,6]
print(cuentaPositivos(lista))
