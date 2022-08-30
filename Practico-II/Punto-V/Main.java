import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Gustavo");
        Cliente c2 = new Cliente("Fernando");

        Peluquero p1 = new Peluquero("Nestor");
        Peluquero p2 = new Peluquero("Maxi");
        Peluquero p3 = new Peluquero("Viviana");
        Peluquero p4 = new Peluquero("Josefina");

        //Turnos c1
        Turno t1 = new Turno(c1, p3, LocalDateTime.of(2022, 8, 14, 14, 30), LocalDateTime.of(2022, 8, 14, 14, 45));
        Turno t2 = new Turno(c1, p1, LocalDateTime.of(2022, 9, 1, 14, 30), LocalDateTime.of(2022, 9, 1, 14, 45));

        //Turnos c2
        Turno t3 = new Turno(c2, p4, LocalDateTime.of(2022, 9, 10, 17, 30), LocalDateTime.of(2022, 9, 10, 17, 55));
        Turno t4 = new Turno(c2, p4, LocalDateTime.of(2022, 9, 8, 17, 30), LocalDateTime.of(2022, 9, 8, 17, 55));

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
        peluqueria1.addTurno(t2);
        peluqueria1.addTurno(t3);
        peluqueria1.addTurno(t4);
        

        //toString peluqueria
        System.out.println(peluqueria1.toString() + "\n");

        //Cobra turnos
        System.out.println("Precio turno t2: " + peluqueria1.cobrarTurno(t2));
        System.out.println("Precio turno t3: " + peluqueria1.cobrarTurno(t3));

        //Primer turno disponible
        System.out.println("Primer turno disponible a la fecha actual: " + peluqueria1.getPrimerTurnoDisponible());

        //Primer turno disponible de un peluquero
        System.out.println("Primer turno disponible de un peluquero a la fecha actual: " + peluqueria1.getPrimerTurnoDisponiblePeluquero(p4));
    }
}