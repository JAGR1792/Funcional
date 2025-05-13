package Java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Punto10 {
    public static void main(String[] args) {
        int filas = 4, columnas = 5;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in); // La entrada del usuario
        int[][] matriz = IntStream.range(0, filas)
                .mapToObj(i -> IntStream.range(0, columnas)
                        .map(j -> random.nextInt(100) + 1)
                        .toArray())
                .toArray(int[][]::new);

        Arrays.stream(matriz)
                .map(Arrays::toString)
                .forEach(System.out::println);

        System.out.println("Ingrese un número para buscar en la matriz: ");
        int numeroBuscado = scanner.nextInt();
        IntStream.range(0, filas * columnas)
                .filter(i -> matriz[i / columnas][i % columnas] == numeroBuscado)
                /*Indica que se recorre índice por índice, donde corresponda el número buscado al que esta en ese espacio
                * Funciona, por índices.*/

                .mapToObj(i -> "Posición: [" + (i / columnas) + "][" + (i % columnas) + "]")
                .forEach(System.out::println);
    }
}