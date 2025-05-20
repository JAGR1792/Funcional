package Java;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Ingresar Lista hace todo

@FunctionalInterface
interface FiltrarMayor {
    List<Integer> filtrar(List<Integer> lista, int umbral);
}

public class Punto17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IngresoLista ingresoLista = () -> {
            System.out.println("Ingrese los números separados por espacios:");
            return Stream.of(scanner.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        };

        List<Integer> entrada = ingresoLista.obtenerLista();
        System.out.println("Ingrese el umbral:");
        int umbral = scanner.nextInt();
        scanner.close();


        FiltrarMayor filtrarMayor = (lista, limite) -> lista.stream()
                .filter(n -> n > limite)
                .collect(Collectors.toList());

        System.out.println("Números mayores a " + umbral + ": " + filtrarMayor.filtrar(entrada, umbral));
    }
}