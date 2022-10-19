import java.util.ArrayList;
import java.util.Collections;

public class ComportamientoNodo implements AccionEjecutable {

    @Override
    public void imprimirNodo(Nodo nodo) {
        System.out.println(nodo);
    }

    @Override
    public void addNodo(Nodo nodo, ArrayList<Nodo> lista_nodos) {
        lista_nodos.add(nodo);
        Collections.sort(lista_nodos);
    }

    /* @Override
    public void addNodoDescendentemente(Nodo nodo, ArrayList<Nodo> lista_nodo) {
        lista_nodo.add(nodo);
        Collections.sort(lista_nodo, Collections.reverseOrder());
    } */
}