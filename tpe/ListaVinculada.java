import java.util.Iterator;

public class ListaVinculada implements Iterable<Nodo> {
    
    private Nodo nodo_raiz;
    private ComportamientoAdd comportamiento_add;

    public ListaVinculada(Nodo nodo_raiz, ComportamientoAdd comportamiento_add) {
        this.nodo_raiz = nodo_raiz;
        this.comportamiento_add = comportamiento_add;
    }

    //Funcionalidades
    @Override
    public Iterator<Nodo> iterator() {
        return new IteradorNodos();
    }

    public void removeNodoPorNodo(Nodo nodo_param) {
        Nodo siguiente_nodo_raiz = this.nodo_raiz.getSiguienteNodo();
        if (this.nodo_raiz.equals(nodo_param)) {
            if (siguiente_nodo_raiz != null) {
                this.setNodoRaiz(siguiente_nodo_raiz);
                this.nodo_raiz.setAnteriorNodo(null);
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
                this.nodo_raiz.setAnteriorNodo(null);
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
    public Nodo getNodoPorPosicion(int posicion_param) {
        int posicion = 0;
        if (this.getPosicionNodo(this.nodo_raiz) == posicion_param) {
            return this.nodo_raiz;
        }
        posicion++;
        Nodo siguiente_nodo = this.nodo_raiz.getSiguienteNodo();
        if (siguiente_nodo != null) {
            return siguiente_nodo.getNodoPorPosicion(posicion_param, posicion);
        }
        return null;
    }

    public int getCantidadNodos() {
        int contador = 0;
        if (this.nodo_raiz != null) {
            contador++;
            Nodo siguiente_nodo = this.nodo_raiz.getSiguienteNodo();
            if (siguiente_nodo != null) {
                contador += siguiente_nodo.getCantidadNodos();
            }
        }
        return contador;
    }

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

    public Nodo getNodoRaiz() {
        return this.nodo_raiz;
    }

    public ComportamientoAdd getComportamientoAdd() {
        return this.comportamiento_add;
    }

    //Setters
    public void setComportamientoAdd(ComportamientoAdd comportamiento_add) {
        this.comportamiento_add = comportamiento_add;
        this.invertirLista();
        /* int posicion_final = this.getCantidadNodos() - 1;
        if (posicion_final != -1) {
            Nodo ultimo_nodo = this.getNodoPorPosicion(posicion_final);
            this.setNodoRaiz(ultimo_nodo);
            this.addNodo(ultimo_nodo);
        } */
    }

    private void invertirLista() {
        int cantidad_nodos = this.getCantidadNodos();
        int posicion_final = cantidad_nodos - 1;
        Nodo ultimo_nodo = null;
        if (cantidad_nodos > 0) {
            ultimo_nodo = this.getNodoPorPosicion(posicion_final);
        }
        while (posicion_final >= 0) {
            Nodo nodo_actual = this.getNodoPorPosicion(posicion_final);
            nodo_actual.invertirSiguienteAnterior();
            posicion_final--;
        }
        if (ultimo_nodo != null) {
            this.setNodoRaiz(ultimo_nodo);
        }
        /* this.recorrer(cantidad_nodos); */
    }

    /* public void recorrer(int cantidad_nodos) {
        int posicion_inicial = 0;
        if (posicion_inicial < cantidad_nodos - 1) {
            this.getNodoPorPosicion(posicion_inicial).setAnteriorNodo(null);
        }
        while (posicion_inicial < cantidad_nodos - 1) {
            Nodo nodo_actual = this.getNodoPorPosicion(posicion_inicial);
            Nodo siguiente_nodo = nodo_actual.getSiguienteNodo();
            if (siguiente_nodo != null) {
                siguiente_nodo.setAnteriorNodo(nodo_actual);
            }
            posicion_inicial++;
        }
    } */

    public void setNodoRaiz(Nodo nodo_raiz) {
        this.nodo_raiz = nodo_raiz;
    }

    //Clase privada
    private class IteradorNodos implements Iterator<Nodo> {

        private int posicion;

        public IteradorNodos() {
            this.posicion = 0;
        }

        @Override
        public boolean hasNext() {
            return this.posicion < getCantidadNodos();
        }

        @Override
        public Nodo next() {
            this.posicion++;
            return getNodoPorPosicion(this.posicion-1);
        }
    }
}