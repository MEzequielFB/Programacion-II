import java.util.ArrayList;

public class ComportamientoAddDesc implements AccionEjecutable {

    private ArrayList<Nodo> nodos;

    public ComportamientoAddDesc() {
        this.nodos = new ArrayList<>();
    }

    @Override
    public void ejecutarNodo(Nodo nodo) {
        this.nodos.add(0, nodo);
    }
    public ArrayList<Nodo> getLista() {
        return this.nodos;
    }
}