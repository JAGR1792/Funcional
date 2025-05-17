# Lista de los generos de los estudiantes M: Masculino F:Femenino
generos=['M','F','M','F','F','M','M','F','M','F','M','F','M','F','F','F','M','F','M','F']

# Se filtra la lista generos dejando solo las 'M' o 'F' respectivamente
# Se castea el resultado a lista y se mide su longitud
# Se calculan la cantidad de hombres en la lista
cantidad_hombres=len(list(filter(lambda elemento: elemento=='M',generos)))
# Se calcula la cantidad de mujeres en la lista
cantidad_mujeres=len(list(filter(lambda elemento: elemento=='F',generos)))
print(f"Cantidad de hombres: {cantidad_hombres}")
print(f"Cantidad de mujeres: {cantidad_mujeres}")
