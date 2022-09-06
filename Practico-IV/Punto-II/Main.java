public class Main {
    public static void main(String[] args) {

        Luz luz1 = new Luz("Rojo");

        Timbre timbre1 = new Timbre();
        Timbre timbre2 = new Timbre();

        Sensor s1 = new Sensor("Cocina");
        Sensor s2 = new Sensor("Living");
        Sensor s3 = new Sensor("Habitacion");
        Sensor s4 = new Sensor("Banio");

        Sensor s5 = new Sensor("Habitacion");
        Sensor s6 = new Sensor("Patio");

        Alarma alarma1 = new Alarma(timbre1);
        AlarmaLuminosa alarma2 = new AlarmaLuminosa(timbre2, luz1);

        //Alarma normal
        System.out.println("Alarma normal:");
        alarma1.addSensor(s1);
        alarma1.addSensor(s2);
        alarma1.addSensor(s3);
        alarma1.addSensor(s4);

        alarma1.comprobar();
        System.out.println("Alarma activada: " + alarma1.estaActivada() + "\n");

        s1.setConflictos(true);
        s3.setConflictos(true);
        alarma1.comprobar();
        System.out.println("Alarma activada: " + alarma1.estaActivada() + "\n");

        alarma1.parar();
        alarma1.comprobar();
        System.out.println("Alarma activada: " + alarma1.estaActivada() + "\n");

        //Alarma luminosa
        System.out.println("Alarma luminosa:");
        alarma2.addSensor(s5);
        alarma2.addSensor(s6);
        
        alarma2.comprobar();
        System.out.println("Alarma activada: " + alarma2.estaActivada() + "\n");

        s6.setConflictos(true);
        alarma2.comprobar();
        System.out.println("Alarma activada: " + alarma2.estaActivada() + "\n");

        alarma2.parar();
        alarma2.comprobar();
        System.out.println("Alarma activada: " + alarma2.estaActivada() + "\n");
    }
}