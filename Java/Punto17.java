package Java;

import java.util.List;
import java.util.stream.Collectors;

public class Punto17 {
    public static List<Integer> mayor(List<Integer> lista, int umbral) {
        return lista.stream()
                   .filter(n -> n > umbral)
                   .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> entrada = List.of(1, 5, 7, 9, 1, 2, 12, 23, 45, 5, 8);
        System.out.println(mayor(entrada, 4)); // [5, 7, 9, 12, 23, 45, 5, 8]
    }
}