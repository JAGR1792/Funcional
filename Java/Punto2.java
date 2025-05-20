package Java;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface IngresoCompras {
    List<Integer> obtenerCompras();
}

public class Punto2 {
    public static void main(String[] args) {
        // Implementación de la interfaz funcional usando Scanner
        IngresoCompras ingresoCompras = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese los montos de compras separados por espacios:");
            String input = scanner.nextLine();
            scanner.close(); // Para no gastar tanta memoria.
            return Stream.of(input.split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        };

        List<Integer> Vcompras = ingresoCompras.obtenerCompras();
        double compratotal = Vcompras.stream()
                .mapToDouble(V -> V) // Convertimos cada compra a double para usar sum()
                .sum();
        double ventaDescuento = compratotal * 0.85;
        System.out.println("Valor a pagar sin descuento: " + compratotal);
        System.out.println("Valor real a pagar con descuento: " + ventaDescuento);
    }
}