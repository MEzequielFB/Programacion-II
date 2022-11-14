import java.util.Iterator;

public class ListaVinculada implements Iterable<Nodo> {
    
    private Nodo nodo_raiz;
    private ComportamientoAdd comportamiento_add;

    public ListaVinculada(ComportamientoAdd comportamiento_add) {
        this.comportamiento_add = comportamiento_add;
    }
    public ListaVinculada(Nodo nodo_raiz, ComportamientoAdd comportamiento_add) {
        this.nodo_raiz = nodo_raiz;
        this.comportamiento_add = comportamiento_add;
    }

    //Funcionalidades
    @Override
    public Iterator<Nodo> iterator() {
        return new IteradorNodos();
    }

    public void removeNodoPorValor(Comparable objeto_comparable) {
        Nodo siguiente_nodo_raiz = this.nodo_raiz.getSiguienteNodo(); //Obtiene el siguiente nodo de la raiz
        if (this.nodo_raiz.getObjetoComparable().compareTo(objeto_comparable) == 0) { //Si el valor del nodo raiz es igual al pasado por parametro...
            if (siguiente_nodo_raiz != null) { //Si la raiz tiene un nodo siguiente, el siguiente se setea como el nodo raiz y el anterior del nuevo nodo raiz se setea como null. Despues se vuelve a llamar al removeNodoPorValor para verificar si el valor de la nueva raiz coincide con el valor a borrar
                this.setNodoRaiz(siguiente_nodo_raiz);
                this.nodo_raiz.setAnteriorNodo(null);
                this.removeNodoPorValor(objeto_comparable);
            } else { //Si el valor del nodo raiz es igual al pasado por parametro y la raiz no tiene un nodo siguiente, se setea como null la raiz
                this.setNodoRaiz(null);
            }
        } else if (siguiente_nodo_raiz != null) { //Si los valores son distintos y la raiz tiene un nodo siguiente se llama al removeNodoPorValor de su siguiente
            siguiente_nodo_raiz.removeNodoPorValor(objeto_comparable);
        }
    }

    public void removeNodoPorPosicion(int posicion) { //Se pasa una posicion por parametro
        int posicion_nodo = 0; //Se setea una posicion local que se inicializa en 0
        Nodo siguiente_nodo_raiz = this.nodo_raiz.getSiguienteNodo();
        if (posicion_nodo == posicion) { //Si el parametro y la posicion local son iguales...
            if (siguiente_nodo_raiz != null) { //Si el siguiente del nodo raiz no es null...
                this.setNodoRaiz(siguiente_nodo_raiz); //El siguiente del nodo raiz se setea como el nuevo nodo raiz
                this.nodo_raiz.setAnteriorNodo(null); //El nodo anterior del nuevo nodo raiz se setea como null
            } else { //Si el nodo raiz no tiene siguiente se setea como null al nodo raiz de la lista
                this.setNodoRaiz(null);
            }
        } else if (siguiente_nodo_raiz != null) { //Si las posiciones no son iguales y el nodo raiz tiene un nodo siguiente...
            posicion_nodo++; //Se incrementa la posicion local
            siguiente_nodo_raiz.removeNodoPorPosicion(posicion_nodo, posicion); //Se llama al remove de su siguiente nodo pasando por parametro la posicion local y la pasada por parametro
        }
    }

    public void addNodo(Comparable objeto_comparable) {
        Nodo nodo_nuevo = new Nodo(objeto_comparable); //Se crea un nodo con el valor pasado por parametro
        if (this.nodo_raiz != null) { //Si la raiz no es null...
            boolean seAgregaComoSiguiente = this.comportamiento_add.add(this.nodo_raiz, nodo_nuevo); //Es true si el nodo nuevo se setea como nodo posterior al actual. Es false si el nodo nuevo se setea como nodo anterior al actual
            if (!seAgregaComoSiguiente) { //Si un nodo se agrega como anterior del nodo raiz, ese nodo se vuelve el nodo raiz
                this.setNodoRaiz(this.nodo_raiz.getAnteriorNodo());
            }
        } else { //Si el nodo raiz de la lista es null, se setea como nodo raiz el nodo creado
            this.setNodoRaiz(nodo_nuevo);
        }
    }

    //Getters
    public Nodo getNodoPorPosicion(int posicion_param) {
        int posicion = 0;
        if (this.getPosicionNodo(this.nodo_raiz.getObjetoComparable()) == posicion_param) { //Si la posicion de la raiz es igual a la pasada por parametro se devuelve el nodo raiz
            return this.nodo_raiz;
        }
        posicion++;
        Nodo siguiente_nodo = this.nodo_raiz.getSiguienteNodo();
        if (siguiente_nodo != null) {
            return siguiente_nodo.getNodoPorPosicion(posicion_param, posicion);
        }
        return null; //Se devuelve null si no hay ocurrencias
    }

    public int getCantidadNodos() {
        int contador = 0;
        if (this.nodo_raiz != null) { //Si el nodo raiz no es null...
            contador++;
            Nodo siguiente_nodo = this.nodo_raiz.getSiguienteNodo();
            if (siguiente_nodo != null) {
                contador += siguiente_nodo.getCantidadNodos();
            }
        }
        return contador;
    }

    public int getPosicionNodo(Comparable objeto_comparable) {

        int posicion_nodo = 0; //Se inicializa una posicion local en 0
        if (this.nodo_raiz.getObjetoComparable().compareTo(objeto_comparable) == 0) { //Si el valor del nodo raiz es igual al pasado por parametro se devuelve la posicion local
            return posicion_nodo;
        }
        posicion_nodo++;
        Nodo siguiente_nodo = this.nodo_raiz.getSiguienteNodo();
        if (siguiente_nodo != null) { //Si el siguiente nodo no es null se llama a su getPosicion
            return siguiente_nodo.getPosicionNodo(objeto_comparable, posicion_nodo);
        }
        return -1; //Retorna -1 si no hay ocurrencias
    }

    public Nodo getNodoRaiz() {
        return this.nodo_raiz;
    }

    public ComportamientoAdd getComportamientoAdd() {
        return this.comportamiento_add;
    }

    //Setters
    public void setComportamientoAdd(ComportamientoAdd comportamiento_add) { //Se invierte la lista al cambiar el comportamiento_add
        this.comportamiento_add = comportamiento_add;
        this.invertirLista();
    }

    private void invertirLista() {
        int cantidad_nodos = this.getCantidadNodos();
        int posicion_final = cantidad_nodos - 1;
        Nodo ultimo_nodo = null;
        if (cantidad_nodos > 0) { //Si hay nodos en la lista, se guarda el ultimo nodo en una variable
            ultimo_nodo = this.getNodoPorPosicion(posicion_final);
        }
        while (posicion_final >= 0) {
            Nodo nodo_actual = this.getNodoPorPosicion(posicion_final);
            nodo_actual.invertirSiguienteAnterior();
            posicion_final--;
        }
        if (ultimo_nodo != null) { //El ultimo nodo se convierte en el nodo raiz si no es null
            this.setNodoRaiz(ultimo_nodo);
        }
    }

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