package Java;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@FunctionalInterface
interface Contador {
    long contar(List<Integer> lista, int x);
}

@FunctionalInterface
interface IngresoLista {
    List<Integer> obtenerLista();
}

public class Punto13_Con_Filter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IngresoLista ingresoLista = () -> {
            System.out.println("Ingrese los números separados por espacios:");
            return List.of(scanner.nextLine().split(" ")).stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        };
        List<Integer> lista = ingresoLista.obtenerLista();
        System.out.println("Ingrese el número a contar:");
        int x = scanner.nextInt();
        scanner.close();

        Contador contador = (lst, num) -> lst.stream()
                .filter(n -> n == num)
                .count();

        System.out.println("Cantidad de veces que aparece " + x + ": " + contador.contar(lista, x));
    }
}