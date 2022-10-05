public class FiltroNot implements Filtro {

    private Filtro filtro;

    public FiltroNot(Filtro filtro) {
        this.filtro = filtro;
    }

    @Override
    public boolean cumple(Planta planta) {
        return !this.filtro.cumple(planta);
    }
}
