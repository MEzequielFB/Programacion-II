public class FiltroPorActor implements Filtro {

    private String actor;

    public FiltroPorActor(String actor) {
        this.actor = actor;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.contieneActor(actor);
    }
}
