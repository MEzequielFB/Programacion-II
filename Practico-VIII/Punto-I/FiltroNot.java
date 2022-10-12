public class FiltroNot implements Filtro {

    private Filtro filtro;

    public FiltroNot(Filtro filtro) {
        this.filtro = filtro;
    }

    @Override
    public boolean cumple(Socio socio) {
        return !filtro.cumple(socio);
    }
}