public class FiltroPorAnioSuperior implements Filtro {

    private int anio;

    public FiltroPorAnioSuperior(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getAnioEstreno() > this.anio;
    }
}