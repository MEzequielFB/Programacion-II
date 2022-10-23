public class FiltroAnd extends Filtro {

    private Filtro filtro1;
    private Filtro filtro2;

    public FiltroAnd(Filtro filtro1, Filtro filtro2) {
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
    }

    @Override
    public boolean cumple(Gasto gasto) {
        return this.filtro1.cumple(gasto) && this.filtro2.cumple(gasto);
    }
}