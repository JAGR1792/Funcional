package Java;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Punto6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese longitud del arreglo: ");
        int n = scanner.nextInt();

        // Generar lista con números aleatorios usando el paradigma funcional
        List<Integer> lista = Stream.generate(() -> new Random().nextInt(100)) // Números aleatorios entre 0 y 99
                .limit(n)
                .collect(Collectors.toList());

        // Obtener el máximo y mínimo usando Streams
        int max = lista.stream().max(Integer::compareTo).orElseThrow();
        int min = lista.stream().min(Integer::compareTo).orElseThrow();

        System.out.println("Lista generada: " + lista);
        System.out.println("Número Máximo: " + max);
        System.out.println("Número Mínimo: " + min);
    }
}