# Lista de los generos de los estudiantes M: Masculino F:Femenino
n=int(input("Ingrese la cantidad de estudiantes: "))
generos=list(map(lambda elemento:input(f"Ingrese el género del estudiante {elemento+1}: "),range(n)))

# Se filtra la lista generos dejando solo las 'M' o 'F' respectivamente
# Se castea el resultado a lista y se mide su longitud
# Se calculan la cantidad de hombres en la lista
cantidad_hombres=len(list(filter(lambda elemento: elemento=='M',generos)))
# Se calcula la cantidad de mujeres en la lista
cantidad_mujeres=len(list(filter(lambda elemento: elemento=='F',generos)))
print(f"Cantidad de hombres: {cantidad_hombres}")
print(f"Cantidad de mujeres: {cantidad_mujeres}")
porcentaje_hombres=cantidad_hombres/n*100
porcentaje_mujeres=cantidad_mujeres/n*100
print(f"Porcentaje de hombres: {porcentaje_hombres}%")
print(f"Porcentaje de mujeres: {porcentaje_mujeres}%")
