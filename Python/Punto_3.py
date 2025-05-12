"""Punto 3: Un aprendiz desea saber cuál será su calificación final en la materia de Algoritmos. Dicha calificación se compone de los siguientes porcentajes:

55% del promedio de sus tres calificaciones parciales.

30% de la calificación del examen final.

15% de la calificación de un trabajo final."""
from functools import reduce
notas=[4,1,2]
examen_final=5
trabajo_final=3
notas_parciales=reduce(lambda acumulador=0,elemento=0:acumulador+elemento,notas)/len(notas)
nota_final=notas_parciales*0.55+examen_final*0.3+trabajo_final*0.15
print(f"Nota final: {nota_final}")
