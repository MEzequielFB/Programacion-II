import java.util.ArrayList;

public abstract class Territorio {
    
    private String nombre;

    public Territorio(String nombre) {
        this.nombre = nombre;
    }

    //Metodos abstractos
    public abstract int getSuperficie();
    public abstract int getCantidadHabitantes();
    public abstract int getIngresos();
    public abstract ArrayList<Comarca> buscarComarcas(Filtro filtro);
    public abstract int getDensidad();
    public abstract int getIngresosPerCapita();

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Territorio otroTerritorio = (Territorio) o;
            return this.getNombre().equalsIgnoreCase(otroTerritorio.getNombre());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " [nombre=" + nombre + "]";
    }
}