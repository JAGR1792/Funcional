package Java;

import java.util.*;
import java.util.stream.*;

public class Punto8 {
    public void main() {
        List<Integer> lista = Stream.generate(() -> new Random().nextInt(100)).limit(20).toList();

        int maximo = lista.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0); // si la Lista esta vacía

        System.out.println(lista);
        System.out.println("Número con valor más alto: " + maximo);

        IntStream.range(0, lista.size())
                .filter(i -> lista.get(i) == maximo)
                .mapToObj(i -> "Índice del número: " + (i + 1))
                .forEach(System.out::println);
    }
}
