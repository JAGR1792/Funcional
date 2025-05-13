package Java;

import java.util.Arrays;
import java.util.List;

public class Punto1 {

    private static List<Integer> nuevalista() {
        return Arrays.asList(100, 200, 300);
    }

    public void main() {
        double sueldobase = 500;
        List<Integer> Ventas = nuevalista(); // IMPORTANTE, MANEJAR POR SEPARADO LAS LISTAS.

        double comisiones = Ventas.stream()// Convierte la lista de ventas en un stream
                .mapToDouble(ventaporcentaje -> ventaporcentaje * 0.1) // obtiene el 10% de cada venta
                .sum(); // suma el 10% de todas las ventas, para así, quedar una comisión.

        double sueldototal = sueldobase + comisiones;

        System.out.println("Comisiones $: " + comisiones);
        System.out.println("Sueldo Total $:" + sueldototal);
    }
}