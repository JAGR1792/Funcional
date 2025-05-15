package Java;

import java.util.List;
import java.util.stream.Collectors;

public class Punto15 {
    public static List<Integer> enRango(int min, int max, List<Integer> lista) {
        return lista.stream()
                   .filter(n -> n >= min && n <= max)
                   .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> entrada = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        System.out.println(enRango(5, 10, entrada)); // [5, 6, 7, 8, 9, 10]
    }
}