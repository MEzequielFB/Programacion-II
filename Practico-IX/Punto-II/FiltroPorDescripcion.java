public class FiltroPorDescripcion extends Filtro {

    private String descripcion_buscada;

    public FiltroPorDescripcion(String descripcion_buscada) {
        this.descripcion_buscada = descripcion_buscada;
    }

    @Override
    public boolean cumple(Gasto gasto) {
        return gasto.getDescripcion().equalsIgnoreCase(this.descripcion_buscada);
    }
}