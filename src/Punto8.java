import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public static List<Integer> nuevalista() {
    List<Integer> lista = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < 20; i++) {
        lista.add(random.nextInt(100) + 1);
    }
    return lista;
}

public void main() {
    List<Integer> lista = nuevalista();
    int Maximo = lista.stream()
            .mapToInt(v->v)
            .max()
            .orElse(0); // Si la lista esta vacía

    System.out.println(lista);
    System.out.println("Número con valor mas alto: " + Maximo);

    for (int i = 0; i < lista.size(); i++) {
        if (lista.get(i) == Maximo) {
            System.out.print("Indice del número: ");
            System.out.println(i+1);
        }
    }
}