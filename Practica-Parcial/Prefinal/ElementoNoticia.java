import java.util.ArrayList;

public abstract class ElementoNoticia {

    private String titulo;
    private String editor;

    public ElementoNoticia(String titulo, String editor) {
        this.titulo = titulo;
        this.editor = editor;
    }

    //Metodos abstractos
    public abstract String getCategoria();
    public abstract ArrayList<String> getPalabrasClave();
    public abstract String getContenido();
    public abstract int getCantidadElementosPorCaracteristica(Filtro filtro);

    //Getters
    public String getTitulo() {
        return this.titulo;
    }

    public String getEditor() {
        return this.editor;
    }

    @Override
    public boolean equals(Object o) {
        try {
            ElementoNoticia otroElemento = (ElementoNoticia) o;
            return this.getTitulo().equalsIgnoreCase(otroElemento.getTitulo()) && this.getEditor().equalsIgnoreCase(otroElemento.getEditor());
        }
        catch(Exception exc) {
            return false;
        }
    }
}