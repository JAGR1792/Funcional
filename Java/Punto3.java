package Java;

import java.util.Arrays;
import java.util.List;



/*Un aprendiz desea saber cuál será su calificación final en la materia de Algoritmos.
Dicha calificación se compone de los siguientes porcentajes:
55% del promedio de sus tres calificaciones parciales.
30% de la calificación del examen final.
15% de la calificación de un trabajo final.*/

public class Punto3 {
    private static List<Integer> calificaciones() {
        return Arrays.asList(4, 1, 2);
    }

    public void main() {

        double examen_final = 5;
        double trabajo_final = 3;


        List<Integer> parciales = calificaciones();
        double notas_parciales = parciales.stream()
                .mapToDouble(v -> v)
                .average()
                .orElse(0);
        double calificacion_final = (notas_parciales * 0.55) + (examen_final * 0.3) + (trabajo_final * 0.15);
        System.out.println("Califción Final: " + calificacion_final);
    }
}