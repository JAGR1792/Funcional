"""Punto 12: Realice un algoritmo que calcule las notas de un grupo de 25 alumnos, guardando nombre,
apellido y 4 notas por cada uno, calcular promedio, e imprimir todos los datos en pantalla. utilizando matrices."""
from functools import reduce
num_alumnos=25

def obtener_datos_alumno(i):
  nombre = input(f"Ingrese el nombre del alumno {i + 1}: ")
  apellido = input(f"Ingrese el apellido del alumno {i + 1}: ")
  notas = list(map(lambda j: float(input(f"Ingrese la nota {j + 1} del alumno {i + 1}: ")), range(4)))
  return [nombre, apellido, notas]

alumnos = list(map(obtener_datos_alumno, range(num_alumnos)))

def calcular_promedio(alumno):
  nombre, apellido, notas = alumno
  promedio = reduce(lambda a, b: a + b, notas) / len(notas)
  return [nombre, apellido, notas, promedio]

alumnos_con_promedio = list(map(calcular_promedio, alumnos))

def imprimir_datos_alumno(alumno):
  nombre, apellido, notas, promedio = alumno
  print(f"Nombre: {nombre}")
  print(f"Apellido: {apellido}")
  print(f"Notas: {notas}")
  print(f"Promedio: {promedio}")
  print()

list(map(imprimir_datos_alumno, alumnos_con_promedio))
