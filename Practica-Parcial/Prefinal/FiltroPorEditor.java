public class FiltroPorEditor extends Filtro {

    private String editor_buscado;

    public FiltroPorEditor(String editor_buscado) {
        this.editor_buscado = editor_buscado;
    }

    @Override
    public boolean cumple(ElementoNoticia elemento) {
        return elemento.getEditor().equalsIgnoreCase(this.editor_buscado);
    }
}