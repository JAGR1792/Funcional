# Se importa el módulo datetime para poder usar date
from datetime import date

# Se crea una fecha de nacimiento
fecha_nacimiento = input("Ingrese su fecha de nacimiento (aaaa-mm-dd): ")
fecha_nacimiento = date.fromisoformat(fecha_nacimiento)

# Se obtiene la fecha actual
fecha_actual = date.today()

# Se calcula la edad, restando los años y ajustando si aún no ha cumplido años este año
edad = fecha_actual.year - fecha_nacimiento.year
if (fecha_actual.month, fecha_actual.day) < (fecha_nacimiento.month, fecha_nacimiento.day):
    edad -= 1

# Se imprime la fecha de nacimiento y edad
print(f"Fecha de nacimiento: {fecha_nacimiento}")
print(f"Edad: {edad}")
