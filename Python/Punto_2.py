from functools import reduce
# Cantidad de productos que comprará el cliente
n=int(input("Ingrese la cantidad de productos que va a comprar: "))
# Lista de precios de productos del cliente
precios=list(map(lambda elemento:int(input(f"Ingrese el precio del producto {elemento+1}: ")),range(n)))
# Se calcula el total a pagar sin el descuento, sumando cada precio
compraTotal=reduce(lambda acumulador=0,elemento=0:acumulador+elemento,precios)
# Se calcula el valor a pagar con un descuento de 15%
ventaDescuento=compraTotal*0.85
# Se imprimen el valor a pagar sin descuento y con el descuento
print(f"Valor a pagar sin descuento: {compraTotal}")
print(f"Valor a pagar con descuento: {ventaDescuento}")
