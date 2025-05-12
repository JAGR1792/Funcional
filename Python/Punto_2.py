"""Punto 2: Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuánto deberá pagar finalmente por su compra."""
from functools import reduce
lista=[10000,25000,50000]
compraTotal=reduce(lambda acumulador=0,elemento=0:acumulador+elemento,lista)
ventaDescuento=compraTotal*0.85
print(f"Valor a pagar sin descuento: {compraTotal}")
print(f"Valor a pagar con descuento: {ventaDescuento}")
