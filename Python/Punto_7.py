"""Punto 7: Realice un algoritmo que almacene 15 valores y los ordena en orden inverso"""
lista=[0]*15
resultado=list(map(lambda elemento:random.randint(-100,100),lista))
print(f"Lista Original: {resultado}")
orden=sorted(resultado)
print(f"Lista Orden Ascendente: {orden}")
orden_inverso=sorted(resultado,reverse=True)
print(f"Lista Orden Descendente: {orden_inverso}")
