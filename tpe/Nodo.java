public class Nodo {
 
    private Comparable objeto_comparable;
    private Nodo siguiente_nodo;
    private Nodo anterior_nodo;

    public Nodo(Comparable objeto_comparable) {
        this.objeto_comparable = objeto_comparable;
    }

    //Funcionalidades
    public void removeNodoPorPosicion(int posicion_nodo, int posicion) {
        if (posicion_nodo == posicion) {
            if (this.siguiente_nodo != null) {
                this.anterior_nodo.setSiguienteNodo(this.siguiente_nodo);
            } else {
                this.anterior_nodo.setSiguienteNodo(null);
            }
        } else if (this.siguiente_nodo != null) {
            posicion_nodo++;
            this.siguiente_nodo.removeNodoPorPosicion(posicion_nodo, posicion);
        }
    }

    public void addNodo(Comparable objeto_comparable, ComportamientoAdd comportamiento_add) {
        if (this.siguiente_nodo == null) {
            comportamiento_add.add(this, objeto_comparable);
        } else {
            this.siguiente_nodo.addNodo(objeto_comparable, comportamiento_add);
        }
    }

    public void imprimir() {
        System.out.println(this);
        if (this.siguiente_nodo != null) {
            this.siguiente_nodo.imprimir();
        }
    }

    //Getters
    public Comparable getObjetoComparable() {
        return this.objeto_comparable;
    }

    public Nodo getSiguienteNodo() {
        return this.siguiente_nodo;
    }

    public Nodo getAnteriorNodo() {
        return this.anterior_nodo;
    }

    //Setters
    public void setSiguienteNodo(Nodo siguiente_nodo) {
        this.siguiente_nodo = siguiente_nodo;
    }

    public void setAnteriorNodo(Nodo anterior_nodo) {
        this.anterior_nodo = anterior_nodo;
    }

    @Override
    public String toString() {
        return this.objeto_comparable + "";
    }
}