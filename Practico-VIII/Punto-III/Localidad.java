import java.util.ArrayList;

public class Localidad {
    
    private String nombre;
    private ArrayList<Barrio> barrios;

    public Localidad(String nombre) {
        this.nombre = nombre;
        this.barrios = new ArrayList<>();
    }

    //Funcionalidades
    public void addBarrio(Barrio barrio) {

        if (!this.barrios.contains(barrio)) {
            this.barrios.add(barrio);
        }
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Localidad otraLocalidad = (Localidad) o;
            return this.getNombre().equalsIgnoreCase(otraLocalidad.getNombre());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.nombre + ", " + this.barrios;
    }
}