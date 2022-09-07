import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Entrenador e1 = new Entrenador("Juan", "Villa", LocalDate.of(1972, 2, 23));

        Masajista m1 = new Masajista("Roberto", "Periotti", LocalDate.of(1997, 11, 11), "Masajeador senior", 7);

        Futbolista f1 = new Futbolista("Sergio", "Villalba", LocalDate.of(2000, 8, 2), "Delantero", 'D');
        Futbolista f2 = new Futbolista("Mateo", "Carreo", LocalDate.of(2000, 1, 20), "Defensor", 'I');

        Contingente contigente1 = new Contingente();

        contigente1.addIntegrante(e1);
        contigente1.addIntegrante(m1);
        contigente1.addIntegrante(f1);
        contigente1.addIntegrante(f2);

        System.out.println("Nro pasaporte e1: " + e1.getNumeroPasaporte());
        System.out.println("Nro pasaporte m1: " + m1.getNumeroPasaporte());
        System.out.println("Nro pasaporte f1: " + f1.getNumeroPasaporte());
        System.out.println("Nro pasaporte f2: " + f2.getNumeroPasaporte());

        f1.setEstado("En país de origen");
        f2.setEstado("En concentración - En país de origen");
        e1.setEstado("Viajando");

        System.out.println("Disponible para recaudación e1: " + contigente1.estaDisponibleRecaudacion(e1));
        System.out.println("Disponible para recaudación f1: " + contigente1.estaDisponibleRecaudacion(f1));
        System.out.println("Disponible para recaudación f2: " + contigente1.estaDisponibleRecaudacion(f2));
    }
}