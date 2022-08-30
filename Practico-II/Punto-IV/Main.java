import java.time.LocalDate;

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

        Turno t1 = new Turno(u2, c1, LocalDate.of(2022, 9, 2), 14, 14.5);
        Turno t2 = new Turno(u2, c2, LocalDate.of(2022, 9, 2), 14, 15.5);

        Turno t3 = new Turno(u2, c2, LocalDate.of(2022, 8, 2), 14, 15.5);
        Turno t4 = new Turno(u2, c2, LocalDate.of(2022, 8, 3), 14, 15.5);
        Turno t5 = new Turno(u1, c2, LocalDate.of(2022, 8, 10), 14, 15.5);

        Establecimiento e1 = new Establecimiento("Playtime");

        //Agregar usuarios al establecimiento
        e1.addUsuario(u1);
        e1.addUsuario(u2);
        e1.addUsuario(u3);
        
        //Agregar canchas al establecimiento
        e1.addCancha(c1);
        e1.addCancha(c2);
        e1.addCancha(c3);
        e1.addCancha(c4);
        e1.addCancha(c5);
        e1.addCancha(c6);

        //Agregar turnos al establecimiento
        e1.addTurno(t1);
        e1.addTurno(t2);
        e1.addTurno(t3);
        e1.addTurno(t4);
        e1.addTurno(t5);

        //Consola
        System.out.println(e1.toString()+"\n");
        System.out.println("Precio t1: " + e1.cobrarTurno(t1));
        System.out.println("Precio t5: " + e1.cobrarTurno(t5));
    }
}