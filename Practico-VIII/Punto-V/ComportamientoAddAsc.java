import java.util.ArrayList;

public class ComportamientoAddAsc implements AccionEjecutable {

    private ArrayList<Nodo> nodos;

    public ComportamientoAddAsc() {
        this.nodos = new ArrayList<>();
    }

    @Override
    public void ejecutarNodo(Nodo nodo) {
        this.nodos.add(nodo);
    }

    public ArrayList<Nodo> getLista() {
        return this.nodos;
    }
}