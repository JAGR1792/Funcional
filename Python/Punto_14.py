""""Punto 14: Escriba una función que reciba como argumento una lista y devuelva la lista que resulta de dividir por 2 los elementos pares de la lista de entrada.

Ejemplo: dividePares([0,2,1,7,8,56,17,18]) = [0,1,4,28,9]""""
def dividePares(lista):
  return list(map(lambda elemento:elemento/2 if elemento%2==0 else elemento,lista))
lista=[0,2,1,7,8,56,17,18]
print(dividePares(lista))
