package Java;

import java.util.Arrays;
import java.util.List;

import static java.lang.Math.round;


public class Punto4 {
private static List<String> nuevalista(){
    return Arrays.asList("M", "F", "M", "F", "F", "M", "M", "F", "M", "F",
            "M", "F", "M", "F", "F", "F", "M", "F", "M", "F");
}


public void main() {
    List <String> personas = nuevalista();
    long contadorM = personas.stream()
            .filter(genero -> genero.equals("M"))
            .count();

    long contadorF = personas.stream()
            .filter(genero -> genero.equals("F"))
            .count();

    long Total = contadorM + contadorF;



    if (Total > 0) {
        System.out.println("Total de personas: " + Total);
        System.out.print("Porcentaje de Hombres: " + round((contadorM / (double) Total) * 100)); // Se redondea
        System.out.println("%");
        System.out.print("Porcentaje de Mujeres: " + round((contadorF / (double) Total) * 100));
        System.out.println("%");
    } else {
        System.out.println("No hay personas registradas.");
    }
}
}