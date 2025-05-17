from functools import reduce

def numVeces_Filter(x, lista):
    # Filtra la lista, dejando solo los elementos iguales a x
    # Se castea el resultado a lista y se obtiene su longitud
    return len(list(filter(lambda elemento: elemento == x, lista)))

def numVeces_Reduce_Map(x, lista):
    # map: convierte cada elemento en 1 si es igual a x, en 0 si no
    # reduce: suma todos los 1s
    return reduce(lambda acc, e: acc + e, map(lambda e: 1 if e == x else 0, lista))
x=5
print(numVeces_Filter(x,lista))
print(numVeces_Reduce_Map(x,lista))
