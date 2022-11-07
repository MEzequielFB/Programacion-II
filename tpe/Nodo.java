public class Nodo {
 
    private Comparable objeto_comparable;
    private Nodo siguiente_nodo;
    private Nodo anterior_nodo;

    public Nodo(Comparable objeto_comparable) {
        this.objeto_comparable = objeto_comparable;
    }
    
    //Funcionalidades
    public void invertirSiguienteAnterior() {
        /* if (this.anterior_nodo != null) { */
            Nodo aux = this.siguiente_nodo;
            this.setSiguienteNodo(this.anterior_nodo);
            this.setAnteriorNodo(aux);
            /* this.siguiente_nodo.setAnteriorNodo(this); */
        /* } */
    }

    public void removeNodoPorNodo(Nodo nodo_param) {
        if (this.equals(nodo_param)) {
            if (this.siguiente_nodo != null) {
                this.anterior_nodo.setSiguienteNodo(this.siguiente_nodo);
                this.siguiente_nodo.setAnteriorNodo(this.anterior_nodo);
                this.anterior_nodo.removeNodoPorNodo(nodo_param); //Llama al remove del anterior nodo para seguir eliminando ocurrencias
            } else {
                this.anterior_nodo.setSiguienteNodo(null);
            }
        } else if (this.siguiente_nodo != null) {
            this.siguiente_nodo.removeNodoPorNodo(nodo_param);
        }
    }

    /* public void removeNodoPorObjetoComparable(Comparable objeto_comparable) {
        if (this.objeto_comparable.compareTo(objeto_comparable) == 0) {
            if (this.siguiente_nodo != null) {
                this.anterior_nodo.setSiguienteNodo(this.siguiente_nodo);
                this.siguiente_nodo.setAnteriorNodo(this.anterior_nodo);
                this.anterior_nodo.removeNodoPorObjetoComparable(objeto_comparable); //Llama al remove del anterior nodo para seguir eliminando ocurrencias
            } else {
                this.anterior_nodo.setSiguienteNodo(null);
            }
        } else if (this.siguiente_nodo != null) {
            this.siguiente_nodo.removeNodoPorObjetoComparable(objeto_comparable);
        }
    } */

    public void removeNodoPorPosicion(int posicion_nodo, int posicion) {
        if (posicion_nodo == posicion) {
            if (this.siguiente_nodo != null) {
                this.anterior_nodo.setSiguienteNodo(this.siguiente_nodo);
                this.siguiente_nodo.setAnteriorNodo(this.anterior_nodo);
            } else {
                this.anterior_nodo.setSiguienteNodo(null);
            }
        } else if (this.siguiente_nodo != null) {
            posicion_nodo++;
            this.siguiente_nodo.removeNodoPorPosicion(posicion_nodo, posicion);
        }
    }

    public void addNodo(Nodo nodo_nuevo, ComportamientoAdd comportamiento_add) {
        if (this.siguiente_nodo == null) {
            comportamiento_add.add(this, nodo_nuevo);
        } else {
            this.siguiente_nodo.addNodo(nodo_nuevo, comportamiento_add);
        }
    }

    public void imprimir() {
        System.out.println(this);
        if (this.siguiente_nodo != null) {
            this.siguiente_nodo.imprimir();
        }
    }

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

    public int getCantidadNodos() {
        int contador = 1;
        if (this.siguiente_nodo != null) {
            contador += this.siguiente_nodo.getCantidadNodos();
        }
        return contador;
    }

    public int getPosicionNodo(Nodo nodo_buscado, int posicion_nodo) {
        if (this.equals(nodo_buscado)) {
            return posicion_nodo;
        }
        posicion_nodo++;
        if (this.siguiente_nodo != null) {
            return this.siguiente_nodo.getPosicionNodo(nodo_buscado, posicion_nodo);
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