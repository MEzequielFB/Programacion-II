import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Camion c1 = new Camion(LocalDate.of(2022, 9, 2));
        Camion c2 = new Camion(LocalDate.of(2022, 9, 20));

        Barco b1 = new Barco(500);
        Barco b2 = new Barco(1000);

        Puerto puerto1 = new Puerto();

        puerto1.addBarco(b1);
        puerto1.addBarco(b2);

        puerto1.addcamion(c1);
        puerto1.addcamion(c2);

        System.out.println(puerto1 + "\n");

        puerto1.cargarBarco();
        System.out.println(puerto1 + "\n");

        puerto1.simularFinalizacionDeLaCarga();
        System.out.println(puerto1 + "\n");

        puerto1.cargarBarco();
        System.out.println(puerto1 + "\n");

        puerto1.simularFinalizacionDeLaCarga();
        System.out.println(puerto1 + "\n");

        puerto1.cargarBarco();
        System.out.println(puerto1 + "\n");
    }
}