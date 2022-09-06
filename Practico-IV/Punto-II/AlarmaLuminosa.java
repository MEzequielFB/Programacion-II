public class AlarmaLuminosa extends Alarma {
    
    private Luz luz;

    public AlarmaLuminosa(Timbre timbre, Luz luz) {

        super(timbre);
        this.luz = luz;
    }

    //Funcionalidades
    @Override
    public void activar() {

        this.getTimbre().hacerSonar();
        this.luz.encender();
    }

    @Override
    public void parar() {

        this.getTimbre().parar();
        this.luz.apagar();

        for (Sensor sensor : this.getSensores()) {

            sensor.setConflictos(false);
        }
    }

    public boolean estaEncendida() {
        return this.luz.estaEncendido();
    }
}