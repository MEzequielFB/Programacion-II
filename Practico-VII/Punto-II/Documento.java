import java.util.ArrayList;

public class Documento {
 
    private String titulo;
    private String contenido_textual;
    private ArrayList<String> autores;
    private ArrayList<String> palabras_clave;

    public Documento(String titulo, String contenido_textual) {

        this.titulo = titulo;
        this.contenido_textual = contenido_textual;
        this.autores = new ArrayList<>();
        this.palabras_clave = new ArrayList<>();
    }

    //Funcionalidades
    public void addPalabraClave(String palabra_clave) {

        if (!this.palabras_clave.contains(palabra_clave)) {
            this.palabras_clave.add(palabra_clave);
        }
    }

    public void addAutor(String autor) {

        if (!this.autores.contains(autor)) {
            this.autores.add(autor);
        }
    }

    //Getters
    public String getTitulo() {
        return this.titulo;
    }

    public String getContenidoTextual() {
        return this.contenido_textual;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Documento otroDocumento = (Documento) o;
            return this.getTitulo().equalsIgnoreCase(otroDocumento.getTitulo()) && this.contenido_textual.equalsIgnoreCase(otroDocumento.getContenidoTextual());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Documento [titulo=" + titulo + "]";
    }
}