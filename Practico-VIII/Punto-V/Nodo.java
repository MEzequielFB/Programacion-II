public class Nodo implements Comparable<Nodo> {
    
    private int valor;
    private Nodo nodo_padre;
    private Nodo nodo_izquierda;
    private Nodo nodo_derecha;

    public Nodo(int valor, Nodo nodo_izquierda, Nodo nodo_derecha) {
        this.valor = valor;
        setNodoIzquierda(nodo_izquierda);
        setNodoDerecha(nodo_derecha);
    }

    //Funcionalidades
    public void recorrer(AccionEjecutable comportamiento) {
        if (nodo_izquierda != null) {
            nodo_izquierda.recorrer(comportamiento);
        }
        comportamiento.ejecutarNodo(this);
        if (nodo_derecha != null) {
            nodo_derecha.recorrer(comportamiento);
        }
    }

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

    @Override
    public String toString() {
        return this.valor + "";
    }
}