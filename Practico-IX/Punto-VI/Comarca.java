import java.util.ArrayList;

public class Comarca extends Territorio implements Comparable<Comarca> {

    private int superficie;
    private int cantidad_habitantes;
    private int ingresos;

    public Comarca(String nombre, int superficie, int cantidad_habitantes, int ingresos) {
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

    //Getters
    @Override
    public int getDensidad() {
        return (int) ((double) this.cantidad_habitantes / (double) this.superficie);
    }

    @Override
    public int getIngresosPerCapita() {
        return (int) ((double) this.ingresos / (double) this.cantidad_habitantes);
    }

    public int getSuperficie() {
        return this.superficie;
    }

    public int getCantidadHabitantes() {
        return this.cantidad_habitantes;
    }

    public int getIngresos() {
        return this.ingresos;
    }

    @Override
    public int compareTo(Comarca otraComarca) {
        return this.getNombre().compareTo(otraComarca.getNombre());
    }
}