public class Nodo {
 
    private Comparable objeto_comparable;
    private Nodo siguiente_nodo;
    private Nodo anterior_nodo;

    public Nodo(Comparable objeto_comparable) {
        this.objeto_comparable = objeto_comparable;
    }
    
    //Funcionalidades
    public void invertirSiguienteAnterior() { //El siguiente del nodo actual se vuelve el anterior, y el anterior se vuelve el siguiente
        Nodo aux = this.siguiente_nodo;
        this.setSiguienteNodo(this.anterior_nodo);
        this.setAnteriorNodo(aux);
    }

    public void removeNodoPorValor(Comparable objeto_comparable) {
        if (this.objeto_comparable.compareTo(objeto_comparable) == 0) { //Si los valores son iguales...
            if (this.siguiente_nodo != null) { //Si el nodo actual tiene un nodo siguiente...
                this.anterior_nodo.setSiguienteNodo(this.siguiente_nodo); //El siguiente nodo del nodo actual se setea como el siguiente nodo del anterior nodo del nodo actual. Ej: nodo1 -> nodo2 -> nodo3 => nodo1 -> nodo3
                this.siguiente_nodo.setAnteriorNodo(this.anterior_nodo); //El anterior nodo del nodo actual se setea como el anterior nodo de su siguiente nodo. Ej: nodo1 <- nodo2 <- nodo3 => nodo1 <- nodo3
                this.anterior_nodo.removeNodoPorValor(objeto_comparable); //Llama al remove del anterior nodo para seguir eliminando ocurrencias
            } else {
                this.anterior_nodo.setSiguienteNodo(null); //Si el nodo actual no tiene siguiente, su anterior nodo setea su siguiente nodo como null
            }
        } else if (this.siguiente_nodo != null) { //Si no son iguales los valores y el siguiente del nodo actual no es null, se llama al remove de su siguiente
            this.siguiente_nodo.removeNodoPorValor(objeto_comparable);
        }
    }

    public void removeNodoPorPosicion(int posicion_nodo, int posicion) {
        if (posicion_nodo == posicion) { //Si las posiciones son iguales..
            if (this.siguiente_nodo != null) {
                this.anterior_nodo.setSiguienteNodo(this.siguiente_nodo); //El siguiente nodo del nodo actual se setea como el siguiente nodo del anterior nodo del nodo actual
                this.siguiente_nodo.setAnteriorNodo(this.anterior_nodo); //El anterior nodo del nodo actual se setea como el anterior nodo de su siguiente nodo
            } else {
                this.anterior_nodo.setSiguienteNodo(null); //Si el nodo actual no tiene siguiente, su anterior nodo setea su siguiente nodo como null
            }
        } else if (this.siguiente_nodo != null) {
            posicion_nodo++;
            this.siguiente_nodo.removeNodoPorPosicion(posicion_nodo, posicion);
        }
    }

    /* public void imprimir() {
        System.out.println(this);
        if (this.siguiente_nodo != null) {
            this.siguiente_nodo.imprimir();
        }
    } */

    //Getters
    public Nodo getNodoPorPosicion(int posicion_param, int posicion_nodo) {
        if (posicion_nodo == posicion_param) {
            return this;
        }
        posicion_nodo++;
        if (this.siguiente_nodo != null) {
            return this.siguiente_nodo.getNodoPorPosicion(posicion_param, posicion_nodo);
        }
        return null;
    }

    public int getCantidadNodos() { //Cada nodo suma 1 al contador
        int contador = 1;
        if (this.siguiente_nodo != null) {
            contador += this.siguiente_nodo.getCantidadNodos();
        }
        return contador;
    }

    public int getPosicionNodo(Comparable objeto_comparable, int posicion_nodo) {
        if (this.objeto_comparable.compareTo(objeto_comparable) == 0) {
            return posicion_nodo;
        }
        posicion_nodo++;
        if (this.siguiente_nodo != null) {
            return this.siguiente_nodo.getPosicionNodo(objeto_comparable, posicion_nodo);
        }
        return -1;
    }

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

    @Override
    public boolean equals(Object o) {

        try {
            Nodo otroNodo = (Nodo) o;
            return this.getObjetoComparable().equals(otroNodo.getObjetoComparable());
        }
        catch(Exception exc) {
            return false;
        }
    }
}