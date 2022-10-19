/* public class NodoCompuesto extends Nodo {

    private Nodo nodo_izquierda;
    private Nodo nodo_derecha;

    public NodoCompuesto(int valor, Nodo nodo_izquierda, Nodo nodo_derecha) {
        super(valor);
        setNodoIzquierda(nodo_izquierda);
        setNodoDerecha(nodo_derecha);
    }

    //Getters
    public Nodo getNodoIzquierda() {
        return this.nodo_izquierda;
    }

    public Nodo getNodoDerecha() {
        return this.nodo_derecha;
    }

    //Setters
    public void setNodoIzquierda(Nodo nodo_izquierda) {
        if (this.compareTo(nodo_izquierda) > 0) {
            this.nodo_izquierda = nodo_izquierda;
            nodo_izquierda.setPadre(this);
        }
    }

    public void setNodoDerecha(Nodo nodo_derecha) {
        if (this.compareTo(nodo_derecha) < 0) {
            this.nodo_derecha = nodo_derecha;
            nodo_derecha.setPadre(this);
        }
    }
} */