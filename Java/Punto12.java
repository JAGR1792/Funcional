package Java;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@FunctionalInterface
interface IngresoDatos {List<String> obtenerDatos(String tipoDato, int cantidad);}

@FunctionalInterface
interface GeneradorNotas {List<Double> generarNotas();}

public class Punto12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IngresoDatos ingresoDatos = (tipoDato, cantidad) -> IntStream.range(0, cantidad)
                .mapToObj(i -> {
                    System.out.print("Ingrese el " + tipoDato + " del estudiante " + (i + 1) + ": ");
                    return scanner.nextLine();
                })
                .collect(Collectors.toList());

        GeneradorNotas generadorNotas = () -> Stream.generate(() -> Math.random() * 5)
                .limit(4) // Generamos 4 notas
                .collect(Collectors.toList());

        int cantidadEstudiantes = 25; // para pruebas usaremos 2

        List<String> nombres = ingresoDatos.obtenerDatos("nombre", cantidadEstudiantes);
        List<String> apellidos = ingresoDatos.obtenerDatos("apellido", cantidadEstudiantes);
        List<List<Double>> notas = IntStream.range(0, cantidadEstudiantes)
                .mapToObj(i -> generadorNotas.generarNotas())
                .collect(Collectors.toList());

        // Calculamos y mostramos los resultados
        IntStream.range(0, cantidadEstudiantes)
                .mapToObj(i -> {
                    String nombreCompleto = nombres.get(i) + " " + apellidos.get(i);
                    List<Double> notasEstudiante = notas.get(i);

                    // Convertimos las notas a texto y lo redondeamos
                    String notasTexto = notasEstudiante.stream()
                            .map(Punto12::redondear)
                            .collect(Collectors.joining(" - "));
                    // Calculamos el promedio
                    double promedio = notasEstudiante.stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .orElse(0.0);
                    String promedioTexto = redondear(promedio);
                    return nombreCompleto + " - Notas: [" + notasTexto + "] - Promedio: " + promedioTexto;
                })
                .forEach(System.out::println);
        scanner.close();
    }
    private static String redondear(double valor) {
        return String.format("%.2f", Math.round(valor * 100.0) / 100.0);
    }
}