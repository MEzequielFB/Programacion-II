public class FiltroPorCategoria extends Filtro {

    private String categoria_buscada;

    public FiltroPorCategoria(String categoria_buscada) {
        this.categoria_buscada = categoria_buscada;
    }

    @Override
    public boolean cumple(ElementoNoticia elemento) {
        return elemento.getCategoria().equalsIgnoreCase(this.categoria_buscada);
    }
}