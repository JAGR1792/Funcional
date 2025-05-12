# La tarea de 17 ejercicios, de funcional

esto es un proyecto que tiene 17 puntos de programacion en java, hay ejercicios de ventas, descuentos, 
notas, vectores, matrices y funciones usando streams, esta sencillo, dentro de lo que cabe, para mí es hermoso.



## ¿Pero que es un stream? 🤔

un stream en java es como una forma de trabajar con listas o arreglos de manera mejor, sin tener que usar muchos for
se pueden usar para filtrar datos, transformar cosas, sumar, etc...

Esto es como cuando conocí por primera vez los ArrayList, el tema, es que es procedimental, 
como un algoritmo paso a paso, pero con un gran volúmen de datos.

ejemplo de stream en java:

```java
List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> dobles = lista.stream()
    .map(n -> n * 2)  // Ten en cuenta la función map, Maptodouble, MaptoInt son y seran muy usados durante sus programaciones.
    .collect(Collectors.toList());

System.out.println(dobles); // imprime [2, 4, 6, 8, 10]
```

asi no se usa un for clasico, todo se hace en cadena y queda mas limpio. mas Zas 💎💎

## lista de ejercicios

### hechos ✅
- [x] 1. vendedor sueldo y comision
- [x] 2. descuento del 15%
- [x] 3. nota final de algoritmos
- [x] 4. porcentaje hombres mujeres
- [x] 5. edad de una persona
- [x] 6. vector con mayor y menor
- [x] 7. 15 valores en orden inverso
- [x] 8. mayor valor en 20 numeros
- [x] 9. vector de 16 partido en dos

### faltan 
- [ ] 10. matriz 4x5 y buscar valor
- [ ] 11. 3 vectores y pasarlos a matriz 3x10
- [ ] 12. 25 alumnos nombre apellido y 4 notas
- [ ] 13. contar veces que aparece x usando filter y reduce
- [ ] 14. dividir entre 2 los pares de una lista
- [ ] 15. devolver numeros que esten en un rango
- [ ] 16. contar numeros positivos en una lista
- [ ] 17. eliminar numeros menores o iguales a un numero

## saludos a la gente de zona, a mi mamá, a mi papá, a mi gato, a mi gata, a mi pajaro, a el señor de la esquina. 🔥

"""Me levanto bien tarde, siempre valiendo madres
sin salir de mi cuarto, viendo monitos chinos
me desvelo a lo pendejo, no mas valiendo queso
tragando y durmiendo, todo el día, soy feliz"""
