import java.util.ArrayList;

public class Noticia extends ElementoPortal {

    private String contenido;
    private String autor;
    private ArrayList<String> palabras_clave;

    public Noticia(String titulo, String categoria, String contenido, String autor) {
        super(titulo, categoria);
        this.contenido = contenido;
        this.autor = autor;
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
    public ElementoPortal getCopiaEstructura(Filtro filtro) {
        if (filtro.cumple(this)) {
            return new Noticia(this.getTitulo(), this.getCategoria(), this.getContenido(), this.getAutor());
        }
        return null;
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(this.palabras_clave);
    }

    public String getContenido() {
        return this.contenido;
    }

    public String getAutor() {
        return this.autor;
    }

    //Setters
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}