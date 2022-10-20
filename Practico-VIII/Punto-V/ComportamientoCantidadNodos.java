public class ComportamientoCantidadNodos implements AccionEjecutable {

    private int cantidad_nodos;

    public ComportamientoCantidadNodos() {
        this.cantidad_nodos = 0;
    }

    @Override
    public void ejecutarNodo(Nodo nodo) {
        cantidad_nodos++;
    }

    public int getCantidadNodos() {
        return this.cantidad_nodos;
    }
}