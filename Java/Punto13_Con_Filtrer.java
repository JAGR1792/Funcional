package Java;

import java.util.List;

public class Punto13_Con_Filtrer {
    public static long contarConFilter(List<Integer> lista, int x) {
        return lista.stream()
                   .filter(n -> n == x)
                   .count();
    }

    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 3, 2, 4, 2, 5);
        System.out.println(contarConFilter(lista, 2)); // 3
    }
}