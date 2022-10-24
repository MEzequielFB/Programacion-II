import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        LocalDate fecha_actual = LocalDate.now();
        LocalDate fecha = LocalDate.of(2022, 10, 20);

        System.out.println(Math.abs(Period.between(fecha_actual, fecha).getDays()));
    }
}