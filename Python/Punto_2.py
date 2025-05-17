from functools import reduce
# Lista de precios de productos del cliente
precios=[10000,25000,50000]
# Se calcula el total a pagar sin el descuento, sumando cada precio
compraTotal=reduce(lambda acumulador=0,elemento=0:acumulador+elemento,precios)
# Se calcula el valor a pagar con un descuento de 15%
ventaDescuento=compraTotal*0.85
# Se imprimen el valor a pagar sin descuento y con el descuento
print(f"Valor a pagar sin descuento: {compraTotal}")
print(f"Valor a pagar con descuento: {ventaDescuento}")
