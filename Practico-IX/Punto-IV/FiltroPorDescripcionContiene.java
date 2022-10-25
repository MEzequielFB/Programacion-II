public class FiltroPorDescripcionContiene extends Filtro {

    private String string_buscado;

    public FiltroPorDescripcionContiene(String string_buscado) {
        this.string_buscado = string_buscado;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return seguro.getDescripcion().contains(this.string_buscado);
    }
}