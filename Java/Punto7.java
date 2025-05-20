package Java;

import java.util.*;
import java.util.stream.Stream;

public class Punto7 {
public void main() {
    List<Integer> lista = Stream.generate(() -> new Random().nextInt(100)).limit(15).toList();
    int[] numerosInversos = lista.stream()
            .sorted(Comparator.reverseOrder())  // Ordenar en orden inverso
            .mapToInt(n -> n)
            .toArray();

    System.out.println("Lista original: "+ lista);
    System.out.println("Lista en orden inverso: " + Arrays.toString(numerosInversos));
}
}