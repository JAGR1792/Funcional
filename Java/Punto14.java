package Java;

import java.util.List;
import java.util.stream.Collectors;

public class Punto14 {
    public static List<Integer> dividePares(List<Integer> lista) {
        return lista.stream()
                   .map(n -> n % 2 == 0 ? n / 2 : n)
                   .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> entrada = List.of(0, 2, 1, 7, 8, 56, 17, 18);
        System.out.println(dividePares(entrada)); // [0, 1, 1, 7, 4, 28, 17, 9]
    }
}