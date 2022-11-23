public class FiltroPorDensidad extends Filtro {
    
    private double densidad_minima;

    public FiltroPorDensidad(double densidad_minima) {
        this.densidad_minima = densidad_minima;
    }

    @Override
    public boolean cumple(Comarca comarca) {
        return comarca.getDensidadPoblacion() > this.densidad_minima;
    }
}