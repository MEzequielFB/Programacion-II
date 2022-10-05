public class FiltroPorDuracionInferior implements Filtro {

    private int duracion;

    public FiltroPorDuracionInferior(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getDuracion() < this.duracion;
    }
}
