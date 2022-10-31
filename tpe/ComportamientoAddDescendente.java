public class ComportamientoAddDescendente extends ComportamientoAdd {

    @Override
    public void add(Nodo nodo, Comparable objeto_comparable) {
        int resultado = nodo.getObjetoComparable().compareTo(objeto_comparable);
        if (resultado > 0) {
            Nodo nodo_nuevo = new Nodo(objeto_comparable);
            nodo.setSiguienteNodo(nodo_nuevo);
            nodo_nuevo.setAnteriorNodo(nodo);
        }
    }
}