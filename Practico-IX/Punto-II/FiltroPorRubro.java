public class FiltroPorRubro extends Filtro {

    private String rubro_buscado;

    public FiltroPorRubro(String rubro_buscado) {
        this.rubro_buscado = rubro_buscado;
    }

    @Override
    public boolean cumple(Gasto gasto) {
        return gasto.getRubro().equalsIgnoreCase(this.rubro_buscado);
    }
}