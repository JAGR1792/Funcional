# La tarea de 17 ejercicios, de programación funcional, Paradigmas.

Esto es una tareita que tiene 17 puntos de programacion en java, hay ejercicios de ventas, descuentos, 
notas, vectores, matrices y funciones usando streams, esta sencillo, dentro de lo que cabe, para mí es hermoso.



## ¿Pero que es un stream? 

un stream en java es como una forma de trabajar con listas o arreglos de manera mejor, sin tener que usar muchos for
se pueden usar para filtrar datos, transformar cosas, sumar, etc...
muy grosso modo, como cuando se maneja un SQL, aunque ustedes jamas han visto como se maneja, piensen esto como un excel. 
es mas preciso así.

Esto es como cuando conocí por primera vez los ArrayList, el tema, es que es procedimental, 
como un algoritmo paso a paso, pero con un gran volúmen de datos.

Ejemplo de stream en java:
- Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas, el vendedor desea saber cuánto dinero obtendrá por concepto de 
comisiones por las tres ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.

```java
import java.util.Arrays;
import java.util.List;

private static List<Integer> nuevalista(){
    return Arrays.asList(100,200,300);  // Aquí creamos una lista, con las ventas, que hizo el vendedor. el vendio 3 productos con ese respectivo valor.
}
        public void main() {
        double sueldobase = 500;  //Dice que recibe un sueldo base
        List<Integer> Ventas = nuevalista(); // IMPORTANTE, MANEJAR POR SEPARADO LAS LISTAS.

            double comisiones = Ventas.stream()// Convierte la lista de ventas en un stream
                    .mapToDouble(ventaporcentaje -> ventaporcentaje * 0.1)
/* obtiene el 10% de cada venta, por que ahí dice que es por comisión de sus ventas*/
                    .sum(); // suma el 10% de todas las ventas, para así, quedar una comisión.

            double sueldototal = sueldobase + comisiones; 

            System.out.println("Comisiones $: " + comisiones);
            System.out.println("Sueldo Total $:" + sueldototal);
        }
```

asi no se usa un for clasico, todo se hace en cadena y queda mas limpio. mas Zas 💎💎

## lista de ejercicios

### hechos Python✅
- [x] 1. vendedor sueldo y comision
- [x] 2. descuento del 15%
- [x] 3. nota final de algoritmos
- [x] 4. porcentaje hombres mujeres
- [x] 5. edad de una persona
- [x] 6. vector con mayor y menor
- [x] 7. 15 valores en orden inverso
- [x] 8. mayor valor en 20 numeros
- [x] 9. vector de 16 partido en dos
- [x] 10. matriz 4x5 y buscar valor
- [x] 11. 3 vectores y pasarlos a matriz 3x10
- [x] 12. 25 alumnos nombre apellido y 4 notas
- [x] 13. contar veces que aparece x usando filter y reduce
- [x] 14. dividir entre 2 los pares de una lista
- [x] 15. devolver numeros que esten en un rango
- [x] 16. contar numeros positivos en una lista
- [x] 17. eliminar numeros menores o iguales a un numero
### faltan Python❎

### hechos Java✅
- [x] 1. vendedor sueldo y comision
- [x] 2. descuento del 15%
- [x] 3. nota final de algoritmos
- [x] 4. porcentaje hombres mujeres
- [x] 5. edad de una persona
- [x] 6. vector con mayor y menor
- [x] 7. 15 valores en orden inverso
- [x] 8. mayor valor en 20 numeros
- [x] 9. vector de 16 partido en dos
- [x] 10. matriz 4x5 y buscar valor
- [x] 12. 25 alumnos nombre apellido y 4 notas

### faltan Java ❎
- [ ] 11. 3 vectores y pasarlos a matriz 3x10
- [ ] 13. contar veces que aparece x usando filter y reduce
- [ ] 14. dividir entre 2 los pares de una lista
- [ ] 15. devolver numeros que esten en un rango
- [ ] 16. contar numeros positivos en una lista
- [ ] 17. eliminar numeros menores o iguales a un numero

## Saludos a la gente de zona, a mi mamá, a mi papá, a mi gato, a mi gata, a mi pajaro, a el señor de la esquina. 🔥
## Y recuerden:
- Me levanto bien tarde, siempre valiendo madres
- sin salir de mi cuarto, viendo monitos chinos
- me desvelo a lo pendejo, no mas valiendo queso
- tragando y durmiendo, todo el día, soy feliz
