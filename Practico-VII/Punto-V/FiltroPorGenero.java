public class FiltroPorGenero implements Filtro {

    private String genero;

    public FiltroPorGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.contieneGenero(this.genero);
    }
}
