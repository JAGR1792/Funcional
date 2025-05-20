package Java;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Punto9 {

    public static List<Integer> nuevaLista() {
        Random random = new Random();
        return new Random().ints(16, 1, 101)  // números al azar
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> vector = nuevaLista();

        List<Integer> primeraMitad = vector.stream()
                .limit(8)
                .collect(Collectors.toList());

        List<Integer> segundaMitad = vector.stream()
                .skip(8)
                .collect(Collectors.toList());

        System.out.println("Vector completo: " + vector);
        System.out.println("Primera mitad: " + primeraMitad);
        System.out.println("Segunda mitad: " + segundaMitad);
    }
}
