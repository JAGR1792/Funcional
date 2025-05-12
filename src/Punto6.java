import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public static List<Integer> nuevalista() {
    List<Integer> lista = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < 100; i++) {
        lista.add(random.nextInt(100) + 1); // Genera un número entre 1 y 100
    }
    return lista;
}


public void main() {
    List<Integer> lista = nuevalista();
 int Max = lista.stream().max(Integer::compareTo).get();
 int Min = lista.stream().min(Integer::compareTo).get();

    System.out.println("Número Maximo: " + Max);
    System.out.println("Número Minimo: " + Min);
}
