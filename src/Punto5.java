import java.time.LocalDate;
import java.time.Period;
import java.util.stream.Stream;

public static void main(String[] args) {
    LocalDate fechaNacimiento = LocalDate.of(2007, 2, 4);

    int edad = Stream.of(fechaNacimiento)
            .map(fecha -> Period.between(fecha, LocalDate.now()).getYears())
            .findFirst()
            .orElse(0);

    System.out.println("Edad: " + edad + " años");
}

