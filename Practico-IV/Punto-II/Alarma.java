import java.util.ArrayList;

public class Alarma {

    private Timbre timbre;
    private ArrayList<Sensor> sensores;

    public Alarma(Timbre timbre) {
        
        this.timbre = timbre;
        this.sensores = new ArrayList<>();
    }

    //Funcionalidades
    public void comprobar() {

        String zonasEnConflicto = "";
        for (Sensor sensor : this.sensores) {

            if (sensor.hayConflictos()) {

                this.activar();
                zonasEnConflicto += sensor.getNombre() + " ";
            }
        }
        System.out.println("Conflictos en: " + zonasEnConflicto);
    }

    public void activar() {
        this.timbre.hacerSonar();
    }

    public void parar() {
        this.timbre.parar();

        for (Sensor sensor : this.sensores) {
            sensor.setConflictos(false);
        }
    }

    public void addSensor(Sensor s) {

        if (!this.sensores.contains(s)) {

            this.sensores.add(s);
        }
    }

    //Getters
    public boolean estaActivada() {
        return this.timbre.estaSonando();
    }

    public Timbre getTimbre() {
        return timbre;
    }

    public ArrayList<Sensor> getSensores() {
        return this.sensores;
    }
}