public class FiltroNot extends Filtro {

    private Filtro filtro;

    public FiltroNot(Filtro filtro) {
        this.filtro = filtro;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return !this.filtro.cumple(noticia);
    }
}