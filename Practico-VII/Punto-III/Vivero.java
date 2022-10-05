import java.util.ArrayList;

public class Vivero {
    
    private ArrayList<Planta> plantas;

    public Vivero() {
        this.plantas = new ArrayList<>();
    }

    //Funcionalidades
    public ArrayList<Planta> buscarPlantas(Filtro filtro) {

        ArrayList<Planta> plantas_filtradas = new ArrayList<>();
        for (Planta planta : this.plantas) {

            if (filtro.cumple(planta)) {
                plantas_filtradas.add(planta);
            }
        }

        return plantas_filtradas;
    }

    public boolean contienePlanta(Planta planta) {
        return this.plantas.contains(planta);
    }

    public void addPlanta(Planta planta) {

        if (!this.plantas.contains(planta)) {
            this.plantas.add(planta);
        }
    }
}