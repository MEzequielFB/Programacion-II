import java.util.ArrayList;
import java.util.Collections;

public class Censo {
    
    private ArrayList<Territorio> regiones;

    public Censo() {
        this.regiones = new ArrayList<>();
    }

    //Funcionalidades
    public void addRegion(Territorio region) {
        if (!this.regiones.contains(region)) {
            this.regiones.add(region);
        }
    }

    //Getters
    public ArrayList<Comarca> buscarComarcas(Filtro filtro) {

        ArrayList<Comarca> comarcas_filtradas = new ArrayList<>();
        for (Territorio region : this.regiones) {
            comarcas_filtradas.addAll(region.buscarComarcas(filtro));
        }
        Collections.sort(comarcas_filtradas);
        return comarcas_filtradas;
    }

    public int getDensidadPorTerritorio(Territorio region) {
        return region.getDensidad();
    }

    public int getIngresosPerCapitaPorTerritorio(Territorio region) {
        return region.getIngresosPerCapita();
    }

    public int getIngresosPorTerritorio(Territorio region) {
        return region.getIngresos();
    }

    public int getSuperficiePorTerritorio(Territorio region) {
        return region.getSuperficie();
    }

    public int getCantidadHabitantesPorTerritorio(Territorio region) {
        return region.getCantidadHabitantes();
    }
}