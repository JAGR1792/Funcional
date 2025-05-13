package Java;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Punto12 {
    public static void main(String[] args) {
        // Generamos los nombres y apellidos
        List<String> nombres = IntStream.range(1, 26) // En teoria de conjuntos 1 cerrado, 26 abierto.
                .mapToObj(i -> "Nombre " + i )
                .collect(Collectors.toList());

        List<String> apellidos = IntStream.range(1, 26)
                .mapToObj(i -> "Apellido " + i)
                .collect(Collectors.toList());

        // Generamos las notas en el rango de 0 a 5
        List<List<Double>> notas = IntStream.range(0, 25)
                .mapToObj(i -> Stream.generate(() -> Math.random() * 5)
                        .limit(4) // 4 notas
                        .collect(Collectors.toList()))//  da una lista con las 4 notas de un estudiante.
                .collect(Collectors.toList()); // crea una lista que tiene una lista que contiene 25 listas de notas

        // Calculamos y mostramos los resultados
        IntStream.range(0, 25)
                .mapToObj(i -> {
                    String nombreCompleto = nombres.get(i) + " " + apellidos.get(i);
                    List<Double> notasEstudiante = notas.get(i);

                    // Redondear cada nota a 2 decimales
                    String notasTexto = notasEstudiante.stream()
                            .map(n -> redondear(n))// seguro que esto se puede reemplazar por algo, y usar menos lineas
                            .collect(Collectors.joining(", "));

                    // Se calcula el promedio
                    double promedio = notasEstudiante.stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .orElse(0.0);

                    String promedioTexto = redondear(promedio);

                    return nombreCompleto + " - Notas: [" + notasTexto + "] - Promedio: " + promedioTexto;
                })
                .forEach(System.out::println);
    }

    // pa que se vea bonito, redondeamos, debe alguna manera para meterla dentro ahi, y acortar lineas.
    private static String redondear(double valor) {
        double redondeado = Math.round(valor * 100.0) / 100.0;
        return "" + redondeado;
    }
}
