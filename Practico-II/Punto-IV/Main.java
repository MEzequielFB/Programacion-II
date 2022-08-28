import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("Jorge");
        Usuario u2 = new Usuario("Mariano");
        Usuario u3 = new Usuario("Micaela");

        Cancha c1 = new Cancha("Futbol 5", 400);
        Cancha c2 = new Cancha("Futbol 5", 400);
        Cancha c3 = new Cancha("Paddle", 100);
        Cancha c4 = new Cancha("Paddle", 100);
        Cancha c5 = new Cancha("Paddle", 100);
        Cancha c6 = new Cancha("Paddle", 100);

        Turno t1 = new Turno(u1.getNombre(), c1, LocalDate.of(2022, 9, 2), 14, 15.5);

        Establecimiento e1 = new Establecimiento("Playtime");
    }
}