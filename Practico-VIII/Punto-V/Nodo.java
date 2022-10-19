public class Nodo implements Comparable<Nodo> {
    
    private int valor;
    private Nodo nodo_padre;
    private Nodo nodo_izquierda;
    private Nodo nodo_derecha;
    private ComportamientoNodo comportamiento_nodo;

    public Nodo(int valor, Nodo nodo_izquierda, Nodo nodo_derecha, ComportamientoNodo compormiento_nodo) {
        this.valor = valor;
        setNodoIzquierda(nodo_izquierda);
        setNodoDerecha(nodo_derecha);
        this.comportamiento_nodo = compormiento_nodo;
    }

    //Funcionalidades
    public boolean esHoja() {
        if (this.nodo_izquierda == null && this.nodo_derecha == null) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Nodo otroNodo) {
        return this.getValor() - otroNodo.getValor();
    }

    //Getters
    public int getValor() {
        return this.valor;
    }

    public Nodo getNodoPadre() {
        return this.nodo_padre;
    }

    public Nodo getNodoIzquierda() {
        return this.nodo_izquierda;
    }

    public Nodo getNodoDerecha() {
        return this.nodo_derecha;
    }

    //Setters
    public void setPadre(Nodo nodo_padre) {
        this.nodo_padre = nodo_padre;
    }

    public void setNodoIzquierda(Nodo nodo_izquierda) {

        if (nodo_izquierda != null) {

            if (this.compareTo(nodo_izquierda) > 0) {
                this.nodo_izquierda = nodo_izquierda;
                nodo_izquierda.setPadre(this);
            }
        } else {
            this.nodo_izquierda = nodo_izquierda;
        }
    }

    public void setNodoDerecha(Nodo nodo_derecha) {

        if (nodo_derecha != null) {

            if (this.compareTo(nodo_derecha) < 0) {
                this.nodo_derecha = nodo_derecha;
                nodo_derecha.setPadre(this);
            }
        } else {
            this.nodo_derecha = nodo_derecha;
        }
    }

    public void setComportamientoNodo(ComportamientoNodo comportamiento_nodo) {
        this.comportamiento_nodo = comportamiento_nodo;
    }
}