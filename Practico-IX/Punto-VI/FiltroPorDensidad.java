public class FiltroPorDensidad extends Filtro {

    private int densidad_minima;

    public FiltroPorDensidad(int densidad_minima) {
        this.densidad_minima = densidad_minima;
    }

    @Override
    public boolean cumple(Comarca comarca) {
        return comarca.getDensidad() > this.densidad_minima;
    }
}