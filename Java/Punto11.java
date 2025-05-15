package Java;

import java.util.Arrays;

public class Punto11 {
    public static void main(String[] args) {
        int[] vector1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vector2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] vector3 = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        int[][] matriz = {vector1, vector2, vector3};

        // Imprimir matriz
        Arrays.stream(matriz).forEach(fila -> {
            Arrays.stream(fila).forEach(num -> System.out.print(num + " "));
            System.out.println();
        });
    }
}