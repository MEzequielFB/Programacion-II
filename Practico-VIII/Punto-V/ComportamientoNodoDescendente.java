import java.util.ArrayList;
import java.util.Collections;

public class ComportamientoNodoDescendente extends ComportamientoNodo {
    
    @Override
    public void addNodo(Nodo nodo, ArrayList<Nodo> lista_nodos) {
        lista_nodos.add(nodo);
        Collections.sort(lista_nodos, Collections.reverseOrder());
    }
}