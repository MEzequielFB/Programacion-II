import java.util.ArrayList;

public class Noticia extends ElementoNoticia {

    private String titulo;
    private String contenido;
    private String autor;
    private String categoria;
    private ArrayList<String> palabras_clave;

    public Noticia(String titulo, String contenido) {
        this(titulo, contenido, "ernesto cherq", "deportes");
    }
    public Noticia(String titulo, String contenido, String autor, String categoria) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.autor = autor;
        this.categoria = categoria;
        this.palabras_clave = new ArrayList<>();
    }

    //Funcionalidades
    public boolean contienePalabraClave(String palabra_clave) {
        return this.palabras_clave.contains(palabra_clave);
    }

    @Override
    public ArrayList<Noticia> buscarNoticias(Filtro filtro) {
        ArrayList<Noticia> noticias_filtradas = new ArrayList<>();
        if (filtro.cumple(this)) {
            noticias_filtradas.add(this);
        }
        return noticias_filtradas;
    }

    public void addPalabraClave(String palabra_clave) {
        if (!this.palabras_clave.contains(palabra_clave)) {
            this.palabras_clave.add(palabra_clave);
        }
    }

    //Getters
    @Override
    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(this.palabras_clave);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getContenido() {
        return this.contenido;
    }

    public String getAutor() {
        return this.autor;
    }

    @Override
    public String getCategoria() {
        return this.categoria;
    }
    @Override
    public String toString() {
        return "Noticia [titulo=" + titulo + "]";
    }
}