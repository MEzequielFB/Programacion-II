public class ComportamientoAddDescendente extends ComportamientoAdd {

    @Override
    public void add(Nodo nodo, Comparable objeto_comparable) {
        int resultado = nodo.getObjetoComparable().compareTo(objeto_comparable);
        if (resultado > 0 || resultado == 0) {
            Nodo nodo_nuevo = new Nodo(objeto_comparable);
            nodo.setSiguienteNodo(nodo_nuevo);
            nodo_nuevo.setAnteriorNodo(nodo);
        }/*  else {
            nodo_nuevo.setSiguienteNodo(nodo);
            nodo_nuevo.setAnteriorNodo(nodo.getAnteriorNodo());
            nodo_nuevo.getAnteriorNodo().setSiguienteNodo(nodo_nuevo);
            nodo.setAnteriorNodo(nodo_nuevo);
        } */
    }
}