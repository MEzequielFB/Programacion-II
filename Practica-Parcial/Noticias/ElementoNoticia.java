import java.util.ArrayList;

public abstract class ElementoNoticia {

    private String titulo;

    public ElementoNoticia(String titulo) {
        this.titulo = titulo;
    }

    //Metodos abstractos
    public abstract int getCantidadNoticias();
    public abstract ElementoNoticia getCopia(String palabra_clave);
    public abstract ArrayList<String> getMapa(ElementoNoticia elemento_noticia);

    //Getters
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public boolean equals(Object o) {

        try {
            ElementoNoticia otroElemento = (ElementoNoticia) o;
            return this.getTitulo().equalsIgnoreCase(otroElemento.getTitulo());
        }
        catch(Exception exc) {
            return false;
        }
    }
}