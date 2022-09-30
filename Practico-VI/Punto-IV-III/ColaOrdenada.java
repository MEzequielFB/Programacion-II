import java.util.ArrayList;
import java.util.Collections;

public class ColaOrdenada {
    
    private ArrayList<Comparable> elementos;

    public ColaOrdenada() {
        this.elementos = new ArrayList<>();
    }

    public boolean estaVacio() {
        return this.elementos.isEmpty();
    }

    public Comparable getPrimerElemento() {

        if (!this.elementos.isEmpty()) {
            /* return this.elementos.remove(this.elementos.get(0)); */
            return this.elementos.get(0);
        }
        return null;
    }

    public void removePrimerElemento() {
        this.elementos.remove(0);
    }

    public void addElemento(Comparable elemento) {

        if (!this.elementos.contains(elemento)) {

            this.elementos.add(elemento);
            Collections.sort(this.elementos, Collections.reverseOrder());
        }
    }

    @Override
    public String toString() {
        return "ColaOrdenada [elementos=" + elementos + "]";
    }
}