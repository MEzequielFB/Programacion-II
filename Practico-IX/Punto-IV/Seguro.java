public abstract class Seguro {

    private String nombre;
    private String dni_duenio;
    private String descripcion;

    public Seguro(String nombre, String dni_duenio, String descripcion) {
        this.nombre = nombre;
        this.dni_duenio = dni_duenio;
        this.descripcion = descripcion;
    }

    //Metodos abstractos
    public abstract int getMonto();
    public abstract int getNumero();

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public String getDniDuenio() {
        return this.dni_duenio;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Seguro otroSeguro = (Seguro) o;
            return this.getDniDuenio().equalsIgnoreCase(otroSeguro.dni_duenio) && this.getDescripcion().equalsIgnoreCase(otroSeguro.getDescripcion());
        }
        catch(Exception exc) {
            return false;
        }
    }
}