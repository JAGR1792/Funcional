"""Punto 4: Un maestro desea saber qué porcentaje de hombres y que porcentaje de mujeres hay en un grupo de estudiantes."""
from functools import reduce
generos=['M','F','M','F','F','M','M','F','M','F','M','F','M','F','F','F','M','F','M','F']
cantidad_hombres=len(list(filter(lambda elemento: elemento=='M',generos)))
cantidad_mujeres=len(list(filter(lambda elemento: elemento=='F',generos)))
print(f"Cantidad de hombres: {cantidad_hombres}")
print(f"Cantidad de mujeres: {cantidad_mujeres}")
