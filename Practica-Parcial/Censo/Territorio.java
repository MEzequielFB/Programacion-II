import java.util.ArrayList;

public class Territorio extends Region {

    private ArrayList<Region> regiones;

    public Territorio(String nombre) {
        super(nombre);
        this.regiones = new ArrayList<>();
    }

    //Funcionalidades
    @Override
    public ArrayList<Comarca> buscarComarcas(Filtro filtro) {
        ArrayList<Comarca> comarcas_filtradas = new ArrayList<>();
        for (Region region : this.regiones) {
            comarcas_filtradas.addAll(region.buscarComarcas(filtro));
        }
        return comarcas_filtradas;
    }

    public void addRegion(Region region) {
        if (!this.regiones.contains(region)) {
            this.regiones.add(region);
        }
    }

    //Getters
    @Override
    public double getSuperficie() {
        double superficie_total = 0;
        for (Region region : this.regiones) {
            superficie_total += region.getSuperficie();
        }
        return superficie_total;
    }

    @Override
    public int getCantidadHabitantes() {
        int cantidad_habitantes_total = 0;
        for (Region region : this.regiones) {
            cantidad_habitantes_total += region.getCantidadHabitantes();
        }
        return cantidad_habitantes_total;
    }

    @Override
    public double getIngresos() {
        double ingresos_totales = 0;
        for (Region region : this.regiones) {
            ingresos_totales += region.getIngresos();
        }
        return ingresos_totales;
    }

    @Override
    public double getIngresosPerCapita() {
        double ingresos_per_capita_totales = 0;
        for (Region region : this.regiones) {
            ingresos_per_capita_totales += region.getIngresosPerCapita();
        }
        return ingresos_per_capita_totales;
    }

    @Override
    public double getDensidadPoblacion() {
        double densidad_poblacion_total = 0;
        for (Region region : this.regiones) {
            densidad_poblacion_total += region.getDensidadPoblacion();
        }
        return densidad_poblacion_total;
    }
}