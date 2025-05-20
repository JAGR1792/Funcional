package Java;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.lang.Math.round;

@FunctionalInterface
interface IngresoGeneros {
    List<String> obtenerGeneros();
}

public class Punto4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IngresoGeneros ingresoGeneros = () -> {
            System.out.println("Ingrese los géneros (M para masculino, F para femenino) separados por espacios:");
            return Stream.of(scanner.nextLine().split(" "))
                    .map(String::toUpperCase) // Convierte todo a mayusculas, seguro
                    .filter(g -> g.equals("M") || g.equals("F")) // solo letras válidas, aquí solo pasan M y F
                    .collect(Collectors.toList());
        };
        List<String> personas = ingresoGeneros.obtenerGeneros();
        scanner.close();
        long contadorM = personas.stream().filter(genero -> genero.equals("M")).count();
        long contadorF = personas.stream().filter(genero -> genero.equals("F")).count();
        long total = contadorM + contadorF;
        if (total > 0) {
            System.out.println("Total de personas: " + total);
            System.out.println("Porcentaje de Hombres: " + round((contadorM / (double) total) * 100) + "%");
            System.out.println("Porcentaje de Mujeres: " + round((contadorF / (double) total) * 100) + "%");
        } else {
            System.out.println("No hay personas registradas.");
        }
    }
}