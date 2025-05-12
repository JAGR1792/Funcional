import java.util.*;
import java.util.stream.Collectors;

public static List<Integer> nuevalista() {
    List<Integer> lista = new ArrayList<>();

    for (int i = 0; i < 15; i++) {
        lista.add(i+1);
    }
    return lista;
}


public void main() {
List<Integer> lista = nuevalista();
    int[] numerosInversos = lista.stream()
            .sorted(Comparator.reverseOrder())  // Ordenar en orden inverso
            .mapToInt(n -> n) // Convertimos a int
            .toArray(); // Convertimos el Stream a un array

    System.out.println("Lista original: "+ lista);
    System.out.println("Lista en orden inverso: " + Arrays.toString(numerosInversos));
}