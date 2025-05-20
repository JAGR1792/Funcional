package Java;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// No lo he aclarado pero ingreso Lista, como estoy trabajando en el mismo paquete, la interfaz
// ingreso Lista solo se ha declarado en el punto 13 con filter, y la vamos a reutilizar hasta el final.


@FunctionalInterface
interface ContadorPositivos {
    long contar(List<Integer> lista);
}

public class Punto16 {
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
        ContadorPositivos contadorPositivos = lista -> lista.stream()
                .filter(n -> n > 0)
                .count();

        System.out.println("Cantidad de números positivos: " + contadorPositivos.contar(entrada));
    }
}