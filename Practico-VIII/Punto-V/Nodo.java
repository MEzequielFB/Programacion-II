public class Nodo {
    
    private Comparable valor;
    private Nodo nodo_padre;
    private Nodo nodo_izquierda;
    private Nodo nodo_derecha;

    public Nodo() {

    }

    public Nodo(Comparable valor) {
        this.valor = valor;
    }

    //Funcionalidades
    public void addNodo(Comparable valor) {

        if (this.valor == null) {
            this.valor = valor;
        } else {
            int resultado = this.valor.compareTo(valor);
            if (resultado > 0) {
                if (this.nodo_izquierda != null) {
                    this.nodo_izquierda.addNodo(valor);
                } else {
                    this.nodo_izquierda = new Nodo(valor);
                    this.nodo_izquierda.setPadre(this);
                }
            }
    
            if (resultado < 0) {
                if (this.nodo_derecha != null) {
                    this.nodo_derecha.addNodo(valor);
                } else {
                    this.nodo_derecha = new Nodo(valor);
                    this.nodo_derecha.setPadre(this);
                }
            }
        }
    }

    public void recorrer(AccionEjecutable accion_ejecutable) {
        if (nodo_izquierda != null) {
            nodo_izquierda.recorrer(accion_ejecutable);
        }
        accion_ejecutable.ejecutarNodo(this);
        if (nodo_derecha != null) {
            nodo_derecha.recorrer(accion_ejecutable);
        }
    }

    public boolean esHoja() {
        if (this.nodo_izquierda == null && this.nodo_derecha == null) {
            return true;
        }
        return false;
    }

    //Getters
    public Comparable getValor() {
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

    @Override
    public String toString() {
        return this.valor + "";
    }
}