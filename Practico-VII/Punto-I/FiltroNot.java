public class FiltroNot implements Filtro {

    private Filtro filtro;

    public FiltroNot(Filtro filtro) {
        this.filtro = filtro;
    }

    @Override
    public boolean cumple(ProductoQuimico producto_quimico) {
        return !filtro.cumple(producto_quimico);
    }
}
