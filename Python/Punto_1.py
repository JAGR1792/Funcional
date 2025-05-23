from functools import reduce
#Ventas del vendedor, ingresadas por el vendedor
ventas=list(map(lambda elemento:int(input(f"Ingrese su venta {elemento+1}: ")),range(3)))
# Sueldo base del vendedor, que el vendedor no puede modificar
sueldoBase=15000
# Se suman las ventas y se obtiene el 10% para comisión
comisiones=reduce(lambda acumulador=0,elemento=0:acumulador+elemento,ventas)*0.1
# Se calcula el sueldo total sumando el sueldo base y las comisiones
sueldoTotal=sueldoBase+comisiones
# Se imprimen las comisiones y el sueldo total
print(f"Comisión: {comisiones}")
print(f"Sueldo total: {sueldoTotal}")
