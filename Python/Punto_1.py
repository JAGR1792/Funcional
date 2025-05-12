"""
Punto 1: Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas,
el vendedor desea saber cuánto dinero obtendrá por concepto de comisiones por las tres ventas
que realiza en el mes y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones."""
from functools import reduce
lista=[100,200,300]
sueldoBase=500
comisiones=reduce(lambda acumulador=0,elemento=0:acumulador+elemento,lista)*0.1
print(comisiones)
sueldoTotal=sueldoBase+comisiones
print(sueldoTotal)
