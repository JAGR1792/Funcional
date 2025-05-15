package Java;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Collectors; 

public class Punto11 {
    public static void main(String[] args) {
        int[] vector1 = IntStream.rangeClosed(1, 10).toArray();
        int[] vector2 = IntStream.rangeClosed(11, 20).toArray();
        int[] vector3 = IntStream.iterate(21, n -> n + 1).limit(10).toArray();
        int[][] matriz = Stream.of(vector1, vector2, vector3).toArray(int[][]::new);

        // Imprimir la matriz 
        Arrays.stream(matriz)
              .map(fila -> Arrays.stream(fila)
                              .mapToObj(num -> String.format("%2d", num))
                              .collect(Collectors.joining(" ")))
              .forEach(System.out::println);
    }
}