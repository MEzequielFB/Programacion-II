import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();

        Persona p1 = new Persona("Manuel");
        Persona p2 = new Persona("Lucas");
        Persona p3 = new Persona("Carla", "4825951305", "mail@hotmail.com"); //Asistente

        Reunion r1 = new Reunion("Aulas comunes I Aula I", "Como programar", LocalDate.of(2022, 8, 29), 15, 17);
        Reunion r2 = new Reunion("Aulas comunes I Aula I", "Como hacer un CV", LocalDate.of(2022, 8, 29), 17, 18);

        Agenda a1 = new Agenda();

        //Agrega personas a las reuniones
        r1.addPersona(p1);
        r1.addPersona(p2);

        r2.addPersona(p1);
        r2.addPersona(p3);

        //Agrega reuniones a la agenda
        a1.addReunion(r1);
        a1.addReunion(r2);

        //Muestra reuniones de la agenda
        main.imprimirToString(a1);
    }

    public void imprimirToString(Object o) {
        System.out.println(o.toString());
    }
}