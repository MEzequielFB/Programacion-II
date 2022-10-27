import java.util.ArrayList;

public class TerritorioCompuesto extends Territorio {

    private ArrayList<Territorio> regiones;

    public TerritorioCompuesto(String nombre) {
        super(nombre);
        this.regiones = new ArrayList<>();
    }

    //Funcionalidades
    @Override
    public ArrayList<Comarca> buscarComarcas(Filtro filtro) {

        ArrayList<Comarca> comarcas_filtradas = new ArrayList<>();
        for (Territorio region : this.regiones) {
            comarcas_filtradas.addAll(region.buscarComarcas(filtro));
        }
        return comarcas_filtradas;
    }

    public void addRegion(Territorio territorio) {
        if (!this.regiones.contains(territorio)) {
            this.regiones.add(territorio);
        }
    }

    //Getters
    @Override
    public int getDensidad() {
        
        int densidad_total = 0;
        for (Territorio region : this.regiones) {
            densidad_total += region.getDensidad();
        }
        return densidad_total;
    }

    @Override
    public int getIngresosPerCapita() {
        
        int ingresos_per_capita_total = 0;
        for (Territorio region : this.regiones) {
            ingresos_per_capita_total += region.getIngresosPerCapita();
        }
        return ingresos_per_capita_total;
    }

    @Override
    public int getSuperficie() {
        
        int superficie_total = 0;
        for (Territorio region : this.regiones) {
            superficie_total += region.getSuperficie();
        }
        return superficie_total;
    }

    @Override
    public int getCantidadHabitantes() {
        
        int cantidad_habitantes_total = 0;
        for (Territorio region : this.regiones) {
            cantidad_habitantes_total += region.getCantidadHabitantes();
        }
        return cantidad_habitantes_total;
    }

    @Override
    public int getIngresos() {
        
        int monto_ingresos_total = 0;
        for (Territorio region : this.regiones) {
            monto_ingresos_total += region.getIngresos();
        }
        return monto_ingresos_total;
    }
}