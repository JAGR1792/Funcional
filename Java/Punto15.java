package Java;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// usa la interfaz ingreso lista.

@FunctionalInterface
interface FiltradorRango {
    List<Integer> filtrar(List<Integer> lista, int min, int max);
}
public class Punto15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IngresoLista ingresoLista = () -> { // literalmente se repetira en todos, gracias por todo ingreso lista.
            System.out.println("Ingrese los números separados por espacios:");
            return Stream.of(scanner.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        };

        List<Integer> entrada = ingresoLista.obtenerLista();
        System.out.println("Ingrese el rango mínimo:");
        int min = scanner.nextInt();
        System.out.println("Ingrese el rango máximo:");
        int max = scanner.nextInt();
        scanner.close();


        FiltradorRango filtrador = (lista, limiteInferior, limiteSuperior) -> lista.stream()
                .filter(n -> n >= limiteInferior && n <= limiteSuperior)
                .collect(Collectors.toList());

        System.out.println("Números en rango [" + min + " - " + max + "]: " + filtrador.filtrar(entrada, min, max));
    }
}