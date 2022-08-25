import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("Manuel");
        Persona p2 = new Persona("Lucas");
        Persona p3 = new Persona("Carla");

        Reunion r1 = new Reunion("Aulas comunes I Aula I", "Como programar", LocalDate.of(2022, 8, 29), 15, 17);
        Reunion r2 = new Reunion("Aulas comunes III Aula I", "Como hacer un CV", LocalDate.of(2022, 9, 2), 15, 17);

        Agenda a1 = new Agenda();
    }
}