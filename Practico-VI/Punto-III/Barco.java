public class Barco {
    
    private static int contador;

    private int id;
    private double capacidad;
    private Camion camion_asignado;

    public Barco(double capacidad) {

        this.id = contador;
        this.capacidad = capacidad;
        this.camion_asignado = null;

        contador++;
    }

    //Getters
    public int getId() {
        return this.id;
    }

    public double getCapacidad() {
        return this.capacidad;
    }

    public Camion getCamionAsignado() {
        return this.camion_asignado;
    }

    //Setters
    public void setCamionAsignado(Camion camion_asignado) {
        this.camion_asignado = camion_asignado;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Barco otroBarco = (Barco) o;
            return this.getId() == otroBarco.getId();
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Barco [id=" + id + ", capacidad=" + capacidad + "]";
    }
}