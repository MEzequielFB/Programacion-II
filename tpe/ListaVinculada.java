public class ListaVinculada {
    
    private Nodo nodo_raiz;
    private ComportamientoAdd comportamiento_add;

    public ListaVinculada(Nodo nodo_raiz, ComportamientoAdd comportamiento_add) {
        this.nodo_raiz = nodo_raiz;
        this.comportamiento_add = comportamiento_add;
    }

    //Funcionalidades
    public int getPosicionNodo(Nodo nodo_buscado) {

        int posicion_nodo = 0;
        if (this.nodo_raiz.equals(nodo_buscado)) {
            return posicion_nodo;
        }
        posicion_nodo++;
        Nodo siguiente_nodo = this.nodo_raiz.getSiguienteNodo();
        if (siguiente_nodo != null) {
            return siguiente_nodo.getPosicionNodo(nodo_buscado, posicion_nodo);
        }
        return -1;
    }

    public void removeNodoPorNodo(Nodo nodo_param) {
        Nodo siguiente_nodo_raiz = this.nodo_raiz.getSiguienteNodo();
        if (this.nodo_raiz.equals(nodo_param)) {
            if (siguiente_nodo_raiz != null) {
                this.setNodoRaiz(siguiente_nodo_raiz);
                this.removeNodoPorNodo(nodo_param); //Se llama a si misma porque cambia el nodo raiz. Se verifica que la nueva raiz no conincida con el nodo a borrar
            } else {
                this.setNodoRaiz(null);
            }
        } else if (siguiente_nodo_raiz != null) {
            siguiente_nodo_raiz.removeNodoPorNodo(nodo_param);
        }
    }

    /* public void removeNodoPorObjetoComparable(Comparable objeto_comparable) {
        Nodo siguiente_nodo_raiz = this.nodo_raiz.getSiguienteNodo();
        if (this.nodo_raiz.getObjetoComparable().compareTo(objeto_comparable) == 0) {
            if (siguiente_nodo_raiz != null) {
                this.setNodoRaiz(siguiente_nodo_raiz);
                this.removeNodoPorObjetoComparable(objeto_comparable); //Se llama a si misma porque cambia el nodo raiz. Se verifica que la nueva raiz no conincida con el nodo a borrar
            } else {
                this.setNodoRaiz(null);
            }
        } else if (siguiente_nodo_raiz != null) {
            siguiente_nodo_raiz.removeNodoPorObjetoComparable(objeto_comparable);
        }
    } */

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

    public void addNodo(Nodo nodo_nuevo) {
        this.nodo_raiz.addNodo(nodo_nuevo, this.comportamiento_add);
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