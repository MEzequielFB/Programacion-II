public class Proceso {
    
    private static int contador;

    private int id;
    private double memoria;

    public Proceso(double memoria) {

        this.id = contador;
        this.memoria = memoria;
        
        contador++;
    }

    //Getters
    public int getId() {
        return this.id;
    }

    public double getMemoria() {
        return this.memoria;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Proceso otroProceso = (Proceso) o;
            return this.getId() == otroProceso.getId();
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Proceso [id=" + id + ", memoria=" + memoria + "]";
    }
}