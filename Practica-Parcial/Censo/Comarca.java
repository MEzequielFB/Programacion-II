import java.util.ArrayList;

public class Comarca extends Region implements Comparable<Comarca> {
    
    private double superficie;
    private int cantidad_habitantes;
    private double ingresos;

    public Comarca(String nombre, double superficie, int cantidad_habitantes, double ingresos) {
        super(nombre);
        this.superficie = superficie;
        this.cantidad_habitantes = cantidad_habitantes;
        this.ingresos = ingresos;
    }

    //Funcionalidades
    @Override
    public ArrayList<Comarca> buscarComarcas(Filtro filtro) {
        ArrayList<Comarca> comarcas_filtradas = new ArrayList<>();
        if (filtro.cumple(this)) {
            comarcas_filtradas.add(this);
        }
        return comarcas_filtradas;
    }

    @Override
    public int compareTo(Comarca otraComarca) {
        return this.getNombre().compareToIgnoreCase(otraComarca.getNombre());
    }

    //Getters
    @Override
    public double getSuperficie() {
        return this.superficie;
    }

    @Override
    public int getCantidadHabitantes() {
        return this.cantidad_habitantes;
    }

    @Override
    public double getIngresos() {
        return this.ingresos;
    }

    @Override
    public double getIngresosPerCapita() {
        return this.ingresos / (double) this.cantidad_habitantes;
    }

    @Override
    public double getDensidadPoblacion() {
        return (double) this.cantidad_habitantes / this.superficie;
    }
}