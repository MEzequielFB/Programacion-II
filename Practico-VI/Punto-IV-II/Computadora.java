public class Computadora {
    
    private static int contador;

    private int id;
    private Proceso proceso_ejecutado;

    public Computadora() {

        this.id = contador;
        this.proceso_ejecutado = null;

        contador++;
    }

    //Getters
    public int getId() {
        return this.id;
    }

    public boolean estaDisponible() {
        return this.proceso_ejecutado == null;
    }

    //Setters
    public void setProcesoEjecutado(Proceso proceso_ejecutado) {
        this.proceso_ejecutado = proceso_ejecutado;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Computadora otraComputadora = (Computadora) o;
            return this.getId() == otraComputadora.getId();
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Computadora [id=" + id + ", proceso_ejecutado=" + proceso_ejecutado + "]";
    }
}