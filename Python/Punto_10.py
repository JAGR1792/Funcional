# Se importa el módulo numpy y se le asigna el alias 'np'
import numpy as np

# Se crea una matriz de 4 filas y 5 columnas con valores enteros aleatorios entre -100 y 99
matriz = np.random.randint(-100, 100, size=(4, 5))

# Se imprime la matriz generada
print("Matriz:")
print(matriz)

# Se solicita al usuario que ingrese un número entero para buscarlo en la matriz
valor = int(input("Ingrese un valor: "))

"""Se utiliza la función np.where para obtener las posiciones (índices) donde el valor ingresado
   aparece en la matriz
   Esta función retorna dos arreglos: uno con las filas y otro con las columnas donde se encontró
   el valor"""
posicion = np.where(matriz == valor)

# Se verifica si el valor fue encontrado (es decir, si el arreglo de filas no está vacío)
if posicion[0].size > 0:
    # Si se encontró, se muestra la primera posición donde aparece el valor
    print(f"El valor {valor} se encuentra en la posición ({posicion[0][0]}, {posicion[1][0]})")
else:
    # Si no se encontró, se muestra un mensaje indicándolo
    print(f"El valor {valor} no se encuentra en la matriz")
