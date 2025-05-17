from functools import reduce
# Se define el número de estudiantes que se registraran
num_alumnos=3   # Para hacer la prueba será con tres estudiantes

"""
Obtener datos estudiantes, permite crear una lista por alumno
-La lista contine en posición 0 el nombre del alumno
-En posición 1 el apellido del alumno
-En la posición 2 se encuentra un arreglo de 4 notas"""
def obtener_datos_alumno(i):
  nombre = input(f"Ingrese el nombre del alumno {i + 1}: ")
  apellido = input(f"Ingrese el apellido del alumno {i + 1}: ")
  notas = list(map(lambda j: float(input(f"Ingrese la nota {j + 1} del alumno {i + 1}: ")), range(4)))
  return [nombre, apellido, notas]

# Se crea una lista de alumnos, con la cantidad de alumnos definida
alumnos = list(map(obtener_datos_alumno, range(num_alumnos)))
"""
Función para calcular el promedio de un alumno.
- Extrae las notas de la lista del alumno.
- Usa reduce para sumar las notas y calcula el promedio dividiendo por la cantidad.
- Devuelve una lista con: [nombre, apellido, notas, promedio]
"""
def calcular_promedio(alumno):
  nombre, apellido, notas = alumno
  promedio = sum(notas) / len(notas)
  return [nombre, apellido, notas, promedio]

# Se aplica 'calcular_promedio' a cada alumno de la lista
# Resulta en una nueva lista donde cada alumno tiene su promedio incluido
alumnos_con_promedio = list(map(calcular_promedio, alumnos))

#Función para imprimir los datos de un alumno:
#Muestra nombre, apellido, notas y promedio.
def imprimir_datos_alumno(alumno):
  nombre, apellido, notas, promedio = alumno
  print(f"Nombre: {nombre}")
  print(f"Apellido: {apellido}")
  print(f"Notas: {notas}")
  print(f"Promedio: {promedio}")
  print()

# Se imprimen los datos de todos los alumnos con promedio usando map
list(map(imprimir_datos_alumno, alumnos_con_promedio))
