public class Main {
    public static void main(String[] args) {

        Luz luz1 = new Luz("Rojo");

        Timbre timbre1 = new Timbre();

        Alarma alarma1 = new Alarma(timbre1);
        AlarmaLuminosa alarma2 = new AlarmaLuminosa(timbre1, luz1);

        //Alarma normal
        System.out.println("Alarma normal");
        alarma1.comprobar();
        System.out.println("Alarma activada: " + alarma1.estaActivada() + "\n");

        alarma1.setHayMovimiento(true);
        alarma1.comprobar();
        System.out.println("Alarma activada: " + alarma1.estaActivada() + "\n");

        alarma1.parar();
        System.out.println("Alarma activada: " + alarma1.estaActivada() + "\n");

        //Alarma luminosa
        System.out.println("Alarma luminosa");
        alarma2.comprobar();
        System.out.println("Alarma activada: " + alarma2.estaActivada() + "\n");

        alarma2.setVidrioRoto(true);
        alarma2.comprobar();
        System.out.println("Alarma activada: " + alarma2.estaActivada());
        System.out.println("Luz prendida: " + alarma2.estaEncendida() + "\n");

        alarma2.parar();
        System.out.println("Alarma activada: " + alarma2.estaActivada());
        System.out.println("Luz prendida: " + alarma2.estaEncendida());
    }
}