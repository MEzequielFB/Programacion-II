import java.util.ArrayList;
import java.util.Collections;

public class Sistema {
    
    private ArrayList<Region> regiones;

    public Sistema() {
        this.regiones = new ArrayList<>();
    }

    //Funcionalidades
    public ArrayList<Comarca> buscarComarcas(Filtro filtro) {
        ArrayList<Comarca> comarcas_filtradas = new ArrayList<>();
        for (Region region : this.regiones) {
            this.regiones.addAll(region.buscarComarcas(filtro));
        }
        Collections.sort(comarcas_filtradas);
        return comarcas_filtradas;
    }

    public void addRegion(Region region) {
        if (!this.regiones.contains(region)) {
            this.regiones.add(region);
        }
    }

    //Getters
    public double getDensidadPoblacionPorRegion(Region region) {
        return region.getDensidadPoblacion();
    }

    public double getIngresosPerCapitaPorRegion(Region region) {
        return region.getIngresosPerCapita();
    }

    public double getSuperficiePorRegion(Region region) {
        return region.getSuperficie();
    }

    public int getCantidadHabitantesPorRegion(Region region) {
        return region.getCantidadHabitantes();
    }
}