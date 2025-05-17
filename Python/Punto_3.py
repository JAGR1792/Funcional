from functools import reduce
# Lista de notas del estudiante
notas=[4,4,3]
# Notas del examen final y trabajo final
examen_final=5
trabajo_final=4
# Se calcula el promedio de las notas parciales del estudiantes
notas_parciales=reduce(lambda acumulador=0,elemento=0:acumulador+elemento,notas)/len(notas)
# Se calcula la nota final teniendo en cuenta los respectivos porcentajes
nota_final=notas_parciales*0.55+examen_final*0.3+trabajo_final*0.15
# Se imprime la nota final del estudiante
print(f"Nota final: {nota_final}")
