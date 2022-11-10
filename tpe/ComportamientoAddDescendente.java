public class ComportamientoAddDescendente extends ComportamientoAdd {

    @Override
    public boolean add(Nodo nodo, Nodo nodo_nuevo) {
        int resultado = nodo.getObjetoComparable().compareTo(nodo_nuevo.getObjetoComparable());
        if (resultado > 0 || resultado == 0) {
            Nodo siguiente_nodo = nodo.getSiguienteNodo();
            if (siguiente_nodo != null) {
                int resultado2 = siguiente_nodo.getObjetoComparable().compareTo(nodo_nuevo.getObjetoComparable());
                if (resultado2 > 0 || resultado2 == 0) { //Se llama al add con otros parametros, el siguiente nodo y el nodo nuevo
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
        } else { //El nodo nuevo se agrega como anterior del nodo
            nodo.setAnteriorNodo(nodo_nuevo);
            nodo_nuevo.setSiguienteNodo(nodo);
            return false;
        }

        /* Nodo nodo_nuevo = new Nodo(objeto_comparable);
        int resultado = nodo.getObjetoComparable().compareTo(objeto_comparable);

        if (resultado > 0 || resultado == 0) {
            nodo.setSiguienteNodo(nodo_nuevo);
            nodo_nuevo.setAnteriorNodo(nodo);
        } else {
            nodo_nuevo.setSiguienteNodo(nodo);
        } */
        /*  else {
            nodo_nuevo.setSiguienteNodo(nodo);
            nodo_nuevo.setAnteriorNodo(nodo.getAnteriorNodo());
            nodo_nuevo.getAnteriorNodo().setSiguienteNodo(nodo_nuevo);
            nodo.setAnteriorNodo(nodo_nuevo);
        } */
    }
}