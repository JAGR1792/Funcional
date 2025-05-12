"""Punto 15: Escriba una función que devuelva una lista con todos los números de la lista de entrada que estén en el rango indicado por los dos primeros argumentos.

Ejemplo: enRango(5,10,[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]) = [5,6,7,8,9,10]"""
def enRango(i,f,lista):
  return list(filter(lambda elemento: elemento>=i and elemento<=f,lista))
lista=[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]
print(enRango(5,10,lista))
