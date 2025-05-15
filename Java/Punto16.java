package Java;

import java.util.List;

public class Punto16 {
    public static long cuentaPositivos(List<Integer> lista) {
        return lista.stream()
                   .filter(n -> n > 0)
                   .count();
    }

    public static void main(String[] args) {
        List<Integer> entrada = List.of(0, 1, -3, -2, 8, -1, 6);
        System.out.println(cuentaPositivos(entrada)); // 3
    }
}