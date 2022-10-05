public class FiltroPorAnioInferior implements Filtro {

    private int anio;

    public FiltroPorAnioInferior(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getAnioEstreno() < anio;
    }
}
