public class Contribuyente {
    
    private static int contador;

    private int id_tributaria;
    private String nombre;
    private double monto_fijo;

    public Contribuyente(String nombre, double monto_fijo) {

        this.id_tributaria = contador;
        this.setNombre(nombre);
        setMontoFijo(monto_fijo);

        contador++;
    }

    //Getters
    public int getIdtributaria() {
        return this.id_tributaria;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getMontoFijo() {
        return this.monto_fijo;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMontoFijo(double monto_fijo) {

        if (monto_fijo > 0) {
            this.monto_fijo = monto_fijo;
        }
    }

    @Override
    public boolean equals(Object o) {

        try {
            Contribuyente otroContribuyente = (Contribuyente) o;
            return this.getNombre().equals(otroContribuyente.getNombre()) && this.getIdtributaria() == otroContribuyente.getIdtributaria();
        }
        catch(Exception exc) {
            return false;
        }
    }
}