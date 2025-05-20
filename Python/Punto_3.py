from functools import reduce
# Lista de notas del estudiante
notas=list(map(lambda elemento:float(input(f"Ingrese su nota {elemento+1}: ")),range(3)))
# Notas del examen final y trabajo final
examen_final=float(input("Ingrese la nota de su examen final"))
trabajo_final=float(input("Ingrese la nota de su trabajo final"))
# Se calcula el promedio de las notas parciales del estudiantes
notas_parciales=reduce(lambda acumulador=0,elemento=0:acumulador+elemento,notas)/len(notas)
# Se calcula la nota final teniendo en cuenta los respectivos porcentajes
nota_final=notas_parciales*0.55+examen_final*0.3+trabajo_final*0.15
# Se imprime la nota final del estudiante
print(f"Nota final: {nota_final}")
