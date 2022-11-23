public class FiltroPorDescripcion extends Filtro {

    private String palabra_buscada;

    public FiltroPorDescripcion(String palabra_buscada) {
        this.palabra_buscada = palabra_buscada;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return seguro.getDescripcion().contains(this.palabra_buscada);
    }
}