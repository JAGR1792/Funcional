package Java;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface IngresoVentas {
    List<Integer> obtenerVentas();
}

public class Punto1 {
    public static void main(String[] args) {
        double sueldobase = 500;
        IngresoVentas ingresoVentas = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese los montos de ventas separados por espacios:");
            String input = scanner.nextLine();
            scanner.close();
            return Stream.of(input.split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        };

        List<Integer> Ventas = ingresoVentas.obtenerVentas();

        double comisiones = Ventas.stream() // Convertimos la lista en stream
                .mapToDouble(ventaporcentaje -> ventaporcentaje * 0.1) // Aplicamos el porcentaje de comisión
                .sum(); // Sumamos las comisiones

        double sueldototal = sueldobase + comisiones;

        System.out.println("Comisiones $: " + comisiones);
        System.out.println("Sueldo Total $: " + sueldototal);
    }
}