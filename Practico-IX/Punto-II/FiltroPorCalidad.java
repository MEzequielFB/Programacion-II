public class FiltroPorCalidad extends Filtro {

    private String calidad_buscada;

    public FiltroPorCalidad(String calidad_buscada) {
        this.calidad_buscada = calidad_buscada;
    }

    @Override
    public boolean cumple(Gasto gasto) {
        return gasto.getCalidad().equalsIgnoreCase(this.calidad_buscada);
    }
}