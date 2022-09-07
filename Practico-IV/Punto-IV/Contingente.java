import java.util.ArrayList;

public class Contingente {
    
    private ArrayList<Integrante> integrantes;

    public Contingente() {

        this.integrantes = new ArrayList<>();
    }

    //Funcionalidades
    public boolean estaDisponibleRecaudacion(Integrante i) {

        if (this.integrantes.contains(i)) {

            return i.getEstado().equalsIgnoreCase("en país de origen");
        }
        return false;
    }

    public void addIntegrante(Integrante i) {

        if (!this.integrantes.contains(i)) {

            this.integrantes.add(i);
        }
    }
}