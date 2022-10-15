import java.util.ArrayList;

public class Provincia {
    
    private String nombre;
    private ArrayList<Localidad> localidades;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.localidades = new ArrayList<>();
    }

    //Funcionalidades
    public void addLocalidad(Localidad localidad) {

        if (!this.localidades.contains(localidad)) {
            this.localidades.add(localidad);
        }
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Provincia otraProvincia = (Provincia) o;
            return this.getNombre().equalsIgnoreCase(otraProvincia.getNombre());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.nombre + ", " + this.localidades;
    }
}