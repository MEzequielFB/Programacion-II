import java.util.ArrayList;

public class Noticia extends ElementoNoticia {

    private String contenido;
    private String categoria;
    private ArrayList<String> palabras_clave;

    public Noticia(String titulo, String editor, String contenido, String categoria) {
        super(titulo, editor);
        this.contenido = contenido;
        this.categoria = categoria;
        this.palabras_clave = new ArrayList<>();
    }

    //Funcionalidades
    public void addPalabraClave(String palabra_clave) {
        if (!this.palabras_clave.contains(palabra_clave)) {
            this.palabras_clave.add(palabra_clave);
        }
    }

    //Getters
    @Override
    public int getCantidadElementosPorCaracteristica(Filtro filtro) {
        if (filtro.cumple(this)) {
            return 1;
        }
        return 0;
    }

    @Override
    public String getContenido() {
        return this.contenido;
    }

    @Override
    public String getCategoria() {
        return this.categoria;
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(this.palabras_clave);
    }
}