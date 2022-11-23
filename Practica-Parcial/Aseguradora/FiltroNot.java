public class FiltroNot extends Filtro {

    private Filtro filtro;

    public FiltroNot(Filtro filtro) {
        this.filtro = filtro;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return !this.filtro.cumple(seguro);
    }
}