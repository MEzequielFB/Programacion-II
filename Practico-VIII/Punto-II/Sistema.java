import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sistema {
    
    private ArrayList<Elemento> elementos;

    public Sistema() {
        this.elementos = new ArrayList<>();
    }

    //Funcionalidades
    /* private void eliminarDuplicados(ArrayList<Elemento> elementos) {

        for (Elemento elemento : elementos) {
            for (Elemento elemento1 : elementos) {

            }
        }
        elementos.
    } */

    public ArrayList<Elemento> buscarElementos(Filtro filtro, Comparator<Elemento> comparador) {

        ArrayList<Elemento> elementos_filtrados = new ArrayList<>();
        for (Elemento elemento : this.elementos) {
            /* elementos_filtrados.addAll(elemento.getElementosFiltrados(filtro)); */
            for (Elemento elemento_filtrado : elemento.getElementosFiltrados(filtro)) { //Para que no hayan duplicados
                if (!elementos_filtrados.contains(elemento_filtrado)) {
                    elementos_filtrados.add(elemento_filtrado);
                }
            }
        }

        if (comparador != null) {
            Collections.sort(elementos_filtrados, comparador);
        }
        return elementos_filtrados;
    }

    public void addElemento(Elemento elemento) {

        if (!this.elementos.contains(elemento)) {
            this.elementos.add(elemento);
        }
    }
}