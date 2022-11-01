public class ComportamientoAddAscendente extends ComportamientoAdd {

    @Override
    public void add(Nodo nodo, Nodo nodo_nuevo) {
        int resultado = nodo.getObjetoComparable().compareTo(nodo_nuevo.getObjetoComparable());
        if (resultado < 0 || resultado == 0) {
            nodo.setSiguienteNodo(nodo_nuevo);
            nodo_nuevo.setAnteriorNodo(nodo);
        }
    }
}