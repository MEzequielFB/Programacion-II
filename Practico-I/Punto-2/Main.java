public class Main {
    public static void main(String[] args) {

        Electrodomestico e1 = new Electrodomestico("Ventilador");
        System.out.println(e1.toString());

        System.out.println("Es de bajo consumo? " + e1.esBajoConsumo());
        System.out.println("Balance: " + e1.getBalance());
        System.out.println("Es de alta gama? " + e1.esAltaGama());
    }
}