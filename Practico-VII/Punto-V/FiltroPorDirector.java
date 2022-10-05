public class FiltroPorDirector implements Filtro {

    private String director;

    public FiltroPorDirector(String director) {
        this.director = director;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getDirector().equalsIgnoreCase(this.director);
    }
}
