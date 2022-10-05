public class FiltroNot implements Filtro {

    private Filtro filtro;

    public FiltroNot(Filtro filtro) {
        this.filtro = filtro;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return !this.filtro.cumple(pelicula);
    }
}