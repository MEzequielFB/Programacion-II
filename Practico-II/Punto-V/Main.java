import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Gustavo");
        Cliente c2 = new Cliente("Fernando");

        Peluquero p1 = new Peluquero("Nestor");
        Peluquero p2 = new Peluquero("Maxi");
        Peluquero p3 = new Peluquero("Viviana");
        Peluquero p4 = new Peluquero("Josefina");

        Turno t1 = new Turno(c1, p1, LocalDate.of(2022, 8, 30), LocalTime.of(15, 30), LocalTime.of(15, 45));

        Peluqueria peluqueria1 = new Peluqueria("Peluqueria");

        //Agrega peluqueros
        peluqueria1.addPeluquero(p1);
        peluqueria1.addPeluquero(p2);
        peluqueria1.addPeluquero(p3);
        peluqueria1.addPeluquero(p4);

        //Agrega clientes
        peluqueria1.addCliente(c1);
        peluqueria1.addCliente(c2);

        //Agrega turnos
        peluqueria1.addTurno(t1);

        //Consola
    }
}