public class FiltroPorTituloContiene implements Filtro {

    private String titulo;

    public FiltroPorTituloContiene(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getTitulo().contains(this.titulo);
    }
}
