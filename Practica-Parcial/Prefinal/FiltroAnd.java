public class FiltroAnd extends Filtro {

    private Filtro filtro1;
    private Filtro filtro2;

    public FiltroAnd(Filtro filtro1, Filtro filtro2) {
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
    }

    @Override
    public boolean cumple(ElementoNoticia elemento) {
        return this.filtro1.cumple(elemento) && this.filtro2.cumple(elemento);
    }
}