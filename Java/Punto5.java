package Java;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.util.stream.Stream;

@FunctionalInterface
interface IngresoFecha {
    LocalDate obtenerFecha();
}

public class Punto5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        IngresoFecha ingresoFecha = () -> {
            System.out.println("Ingrese su fecha de nacimiento (YYYY-MM-DD):");
            return LocalDate.parse(scanner.nextLine());
        };

        LocalDate fechaNacimiento = ingresoFecha.obtenerFecha();
        scanner.close();
        int edad = Stream.of(fechaNacimiento)
                .map(fecha -> Period.between(fecha, LocalDate.now()).getYears())
                .findFirst()
                .orElse(0);

        System.out.println("Edad: " + edad + " años");
    }
}