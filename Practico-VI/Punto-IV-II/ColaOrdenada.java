import java.util.ArrayList;
import java.util.Collections;

public class ColaOrdenada {
    
    private ArrayList<Comparable> elementos;

    public ColaOrdenada() {
        this.elementos = new ArrayList<>();
    }

    public boolean contieneElemento(Comparable elemento) {
        return this.elementos.contains(elemento);
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public Comparable getPrimerElemento() {

        if (!this.elementos.isEmpty()) {

            return this.elementos.remove(0);
        }
        return null;
    }

    public void addElemento(Comparable nuevo_elemento) {

        if (!this.elementos.contains(nuevo_elemento)) {

            /* for (Comparable elemento : this.elementos) {

                if (nuevo_elemento.compareTo(elemento) > 0) {

                    this.elementos.add(this.elementos.indexOf(elemento), nuevo_elemento);
                    return;
                }
            } */
            this.elementos.add(nuevo_elemento);
            Collections.sort(this.elementos, Collections.reverseOrder());
            //Collections.sort ordena por default de menor a mayor teniendo en cuenta el compareTo del elemento. Con Collections.reverseOrder() se revierte de mayor de menor
        }
    }

    @Override
    public String toString() {
        return "ColaOrdenada [elementos=" + elementos + "]";
    }
}
