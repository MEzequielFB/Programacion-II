public class Sensor {
 
    private String nombre;
    private boolean hayConflictos;

    public Sensor(String nombre) {

        this.nombre = nombre;
        this.hayConflictos = false;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public boolean hayConflictos() {
        return hayConflictos;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setConflictos(boolean hayConflictos) {
        this.hayConflictos = hayConflictos;
    }

    @Override
    public boolean equals(Object o) { //Dos sensores son iguales si tienen el mismo nombre

        Sensor otroSensor = (Sensor) o;
        return this.nombre.equals(otroSensor.getNombre());
    }
}