package Java;

import java.util.List;

public class Punto13_Con_MAP {
    public static long contarConReduce(List<Integer> lista, int x) {
        return lista.stream()
                   .map(n -> n == x ? 1 : 0)
                   .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 3, 2, 4, 2, 5);
        System.out.println(contarConReduce(lista, 2)); // 3
    }
}