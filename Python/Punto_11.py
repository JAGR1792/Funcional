# Se crean tres vectores de 10 posiciones cada uno
vector1=[0]*10
vector2=[0]*10
vector3=[0]*10
# Se pide al usuario que llene cada vector
vector1=list(map(lambda elemento:int(input("Ingrese un número: ")),vector1))
vector2=list(map(lambda elemento:int(input("Ingrese un número: ")),vector2))
vector3=list(map(lambda elemento:int(input("Ingrese un número: ")),vector3))
# Se crea una matriz de 3 elementos
matriz=[0]*3
# Se llena cada elemento de la matriz con los vectores creados
matriz[0]=vector1
matriz[1]=vector2
matriz[2]=vector3
# Se muestra la matriz creada
print(matriz)
