import java.util.ArrayList;

public abstract class Region {
    
    private String nombre;

    public Region(String nombre) {
        this.nombre = nombre;
    }

    //Metodos abstractos
    public abstract double getSuperficie();
    public abstract int getCantidadHabitantes();
    public abstract double getIngresos();
    public abstract double getIngresosPerCapita();
    public abstract double getDensidadPoblacion();
    public abstract ArrayList<Comarca> buscarComarcas(Filtro filtro);

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Region otraRegion = (Region) o;
            return this.getNombre().equalsIgnoreCase(otraRegion.getNombre());
        }
        catch(Exception exc) {
            return false;
        }
    }
}