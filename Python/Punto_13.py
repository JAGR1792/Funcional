""""Punto 13: Cree una función que cuente el número de veces que aparece x en una lista. Desarrolle dos versiones de la función: una usando filter y otra usando reduce y map."""
from functools import reduce
def numVeces_Filter(x,lista):
  return list(filter(lambda elemento: elemento==x,lista)).count(x)
def numVeces_Reduce_Map(x,lista):
  return len(list(filter(lambda elemento: elemento==x,lista)))

lista=[2,4,5,6,7,4,3,5,2,7,5,8,5,9,5,3,8,5]
x=5
print(numVeces_Filter(x,lista))
print(numVeces_Reduce_Map(x,lista))
