import java.util.ArrayList;

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
    public abstract int getMontoAsegurado();
    public abstract int getNumero();
    public abstract int getCostoPoliza();
    public abstract ArrayList<Seguro> buscarSeguros(Filtro filtro);

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

    //Setters
    public void setDniDuenio(String dni_duenio) {
        this.dni_duenio = dni_duenio;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Seguro otroSeguro = (Seguro) o;
            return this.getDniDuenio().equalsIgnoreCase(otroSeguro.dni_duenio) && this.getNombre().equalsIgnoreCase(otroSeguro.getNombre());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Seguro [nombre=" + nombre + "]";
    }
}