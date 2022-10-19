import java.util.ArrayList;

public class ArbolBinario {
    
    private ArrayList<Nodo> nodos;
    private ComportamientoNodo comportamiento_nodo;

    public ArbolBinario(ComportamientoNodo comportamiento_nodo, Nodo nodo) {
        this.comportamiento_nodo = comportamiento_nodo;
    }

    //Funcionalidades


    public void addNodo(Nodo nodo) {
        comportamiento_nodo.addNodo(nodo, this.nodos);
    }

    //Setters
    public void setComportamientoNodo(ComportamientoNodo comportamiento_nodo) {
        this.comportamiento_nodo = comportamiento_nodo;
    }
}