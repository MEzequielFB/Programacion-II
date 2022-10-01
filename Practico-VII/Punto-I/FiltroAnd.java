public class FiltroAnd implements Filtro {

    private Filtro filtro1;
    private Filtro filtro2;

    public FiltroAnd(Filtro filtro1, Filtro filtro2) {

        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
    }

    @Override
    public boolean cumple(ProductoQuimico producto_quimico) {
        return filtro1.cumple(producto_quimico) && filtro2.cumple(producto_quimico);
    }
}
