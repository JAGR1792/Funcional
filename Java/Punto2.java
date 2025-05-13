package Java;

import java.util.Arrays;
import java.util.List;


public class Punto2 {
    private static List<Integer> nuevalista() {
        return Arrays.asList(10000, 25000, 50000);
    }


    public void main() {
        List<Integer> Vcompras = nuevalista();

        double compratotal = Vcompras.stream()
                .mapToDouble(V -> V)// todo para poder usar sum, convertimos cada compra a double
                .sum();

        double ventaDescuento = compratotal * 0.85;
        System.out.println("Valor a pagar sin descuento: " + compratotal);
        System.out.println("Valor real a pagar: " + ventaDescuento);


    }
}
