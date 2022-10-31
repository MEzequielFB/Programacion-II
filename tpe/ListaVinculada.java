public class ListaVinculada {
    
    private Nodo nodo_raiz;
    private ComportamientoAdd comportamiento_add;

    public ListaVinculada(Nodo nodo_raiz, ComportamientoAdd comportamiento_add) {
        this.nodo_raiz = nodo_raiz;
        this.comportamiento_add = comportamiento_add;
    }

    //Funcionalidades
    public void removeNodoPorPosicion(int posicion) {
        int posicion_nodo = 0;
        Nodo siguiente_nodo_raiz = this.nodo_raiz.getSiguienteNodo();
        if (posicion_nodo == posicion) {
            if (siguiente_nodo_raiz != null) {
                this.setNodoRaiz(siguiente_nodo_raiz);
            } else {
                this.setNodoRaiz(null);
            }
        } else if (siguiente_nodo_raiz != null) {
            posicion_nodo++;
            siguiente_nodo_raiz.removeNodoPorPosicion(posicion_nodo, posicion);
        }
    }

    public void addNodo(Comparable objeto_comparable) {
        this.nodo_raiz.addNodo(objeto_comparable, this.comportamiento_add);
    }

    public void imprimir() {
        this.nodo_raiz.imprimir();
    }

    //Getters
    public Nodo getNodoRaiz() {
        return this.nodo_raiz;
    }

    public ComportamientoAdd getComportamientoAdd() {
        return this.comportamiento_add;
    }

    //Setters
    public void setComportamientoAdd(ComportamientoAdd comportamiento_add) {
        this.comportamiento_add = comportamiento_add;
    }

    public void setNodoRaiz(Nodo nodo_raiz) {
        this.nodo_raiz = nodo_raiz;
    }
}