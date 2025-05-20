package Java;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Usa interfaz ingreso Lista, declarada previamente.

public class Punto14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IngresoLista ingresoLista = () -> {
            System.out.println("Ingrese los números separados por espacios:");
            return Stream.of(scanner.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        };

        List<Integer> entrada = ingresoLista.obtenerLista();
        scanner.close();


        List<Integer> resultado = entrada.stream()
                .map(n -> n % 2 == 0 ? n / 2 : n)
                .toList();

        System.out.println("Lista transformada: " + resultado);
    }
}
