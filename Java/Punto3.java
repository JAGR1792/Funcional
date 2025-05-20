package Java;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface IngresoNotas {
    List<Double> obtenerNotas();
}

public class Punto3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Implementación de la interfaz funcional para ingresar las notas parciales
        IngresoNotas ingresoNotas = () -> {
            System.out.println("Ingrese las notas parciales separadas por espacios:");
            return Stream.of(scanner.nextLine().split(" "))
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());
        };
        List<Double> parciales = ingresoNotas.obtenerNotas();
        System.out.println("Ingrese la calificación del examen final:");
        double examen_final = scanner.nextDouble();
        System.out.println("Ingrese la calificación del trabajo final:");
        double trabajo_final = scanner.nextDouble();
        scanner.close();
        double notas_parciales = parciales.stream()
                .mapToDouble(v -> v)
                .average()
                .orElse(0);
        double calificacion_final = (notas_parciales * 0.55) + (examen_final * 0.3) + (trabajo_final * 0.15);
        System.out.println("Calificación Final: " + calificacion_final);
    }
}