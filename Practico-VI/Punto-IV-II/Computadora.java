public class Computadora implements Comparable<Computadora> {
    
    private static int contador;

    private int id;
    private int velocidad;
    private Proceso proceso_ejecutado;

    public Computadora(int velocidad) {

        this.id = contador;
        this.velocidad = velocidad;
        this.proceso_ejecutado = null;

        contador++;
    }

    //Getters
    public int getId() {
        return this.id;
    }

    public int getVelocidad() {
        return this.velocidad;
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
        return "Computadora [id=" + id + ", velocidad= " + velocidad + ", proceso_ejecutado=" + proceso_ejecutado + "]";
    }

    @Override
    public int compareTo(Computadora otraComputadora) {
        if (this.getVelocidad() > otraComputadora.getVelocidad()) {
            return 1;
        }
        else if (this.getVelocidad() < otraComputadora.getVelocidad()) {
            return -1;
        }
        return 0;
    }
}