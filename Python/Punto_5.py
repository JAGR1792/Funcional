"""Punto 5: Realizar un algoritmo que calcule la edad de una persona."""
from datetime import date
fecha_nacimiento=date(2007,2,4)
fecha_actual=date.today()
edad=fecha_actual.year-fecha_nacimiento.year
print(f"Edad: {edad}")
