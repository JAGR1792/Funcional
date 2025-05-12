"""Punto 17: Escriba una función que elimine todos los números menores o iguales que el argumento indicado.

Ejemplo: mayor([1,5,7,9,1,2,12,23,45,5,8],4) = [5,7,9,12,23,45,5,8]"""
def mayores(lista,num):
  return list(filter(lambda elemento: elemento>num,lista))
lista=[1,5,7,9,1,2,12,23,45,5,8]
print(mayores(lista,4))
