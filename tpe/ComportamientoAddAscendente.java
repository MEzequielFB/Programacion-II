public class ComportamientoAddAscendente extends ComportamientoAdd {

    @Override
    public boolean add(Nodo nodo, Nodo nodo_nuevo) { //Devuelve true si el nodo nuevo se setea como nodo posterior al actual. Devuelve false si el nodo nuevo se setea como nodo anterior al actual
        int resultado = nodo.getObjetoComparable().compareTo(nodo_nuevo.getObjetoComparable());
        if (resultado < 0 || resultado == 0) { //Si el nodo nuevo es mayor o igual al nodo actual, se determina si se llama al add con el siguiente nodo o se agrega el nodo nuevo como siguiente del nodo actual
            Nodo siguiente_nodo = nodo.getSiguienteNodo();
            if (siguiente_nodo != null) {
                int resultado2 = siguiente_nodo.getObjetoComparable().compareTo(nodo_nuevo.getObjetoComparable());
                if (resultado2 < 0 || resultado == 0) { //Se llama al add con otros parametros, el siguiente nodo y el nodo nuevo. Si es que el siguiente nodo es menor o igual al nodo nuevo
                    this.add(siguiente_nodo, nodo_nuevo);
                    return true; //Se retorna para que no ejecute el codigo que sigue y no se agreguen nodos de mas
                }
            }
            nodo.setSiguienteNodo(nodo_nuevo); //Si el siguiente nodo es null o no cumplió las condiciones, el nodo nuevo se agrega como siguiente del nodo pasado como parametro
            nodo_nuevo.setAnteriorNodo(nodo);
            if (siguiente_nodo != null) {
                nodo_nuevo.setSiguienteNodo(siguiente_nodo);
            }
            return true;
            /* nodo.setSiguienteNodo(nodo_nuevo);
            return true; */
            /* nodo_nuevo.setAnteriorNodo(nodo); */
        } else { //El nodo nuevo se agrega como anterior del nodo
            nodo.setAnteriorNodo(nodo_nuevo);
            nodo_nuevo.setSiguienteNodo(nodo);
            return false;
        }
        /*  else {
            nodo_nuevo.setSiguienteNodo(nodo);
            nodo_nuevo.setAnteriorNodo(nodo.getAnteriorNodo());
            nodo_nuevo.getAnteriorNodo().setSiguienteNodo(nodo_nuevo);
            nodo.setAnteriorNodo(nodo_nuevo);
        } */
    }
}