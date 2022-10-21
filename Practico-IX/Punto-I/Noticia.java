import java.util.ArrayList;

public class Noticia extends Contenido {
    
    private String titulo;
    private String introduccion;
    private String texto;
    private String autor;
    private String link;
    private ArrayList<String> palabras_clave;

    public Noticia(String titulo, String introduccion, String texto, String autor, String link) {

        this.titulo = titulo;
        this.introduccion = introduccion;
        this.texto = texto;
        this.autor = autor;
        this.link = link;
        this.palabras_clave = new ArrayList<>();
    }

    //Funcionalidades
    @Override
    public ArrayList<Noticia> buscarNoticias(Filtro filtro) {
        
        ArrayList<Noticia> noticias_filtradas = new ArrayList<>();
        if (filtro.cumple(this)) {
            noticias_filtradas.add(this);
        }
        return noticias_filtradas;
    }

    public boolean contienePalabra(String palabra_clave) {
        return this.palabras_clave.contains(palabra_clave);
    }

    public void addPalabraClave(String palabra_clave) {
        this.palabras_clave.add(palabra_clave);
    }

    //Getters
    @Override
    public String getMapa() {

        String mapa = "";
        mapa = this.link;
        
        if (this.getReferenciaPadre() != null) {
            mapa = this.getReferenciaPadre().getMapa() + "/" + mapa;
        }
        return mapa;
    }

    @Override
    public Contenido getCopiaPorPalabraClave(String palabra_clave) {

        if (this.palabras_clave.contains(palabra_clave)) {
            return new Noticia(this.titulo, this.introduccion, this.texto, this.autor, this.link);
        }
        return null;
    }

    @Override
    public int getCantidadNoticias() {
        return 1;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getIntroduccion() {
        return this.introduccion;
    }

    public String getTexto() {
        return this.texto;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getLink() {
        return this.link;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Noticia otraNoticia = (Noticia) o;
            return this.getTitulo().equalsIgnoreCase(otraNoticia.getTitulo()) && this.getAutor().equalsIgnoreCase(otraNoticia.getAutor());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Noticia [titulo=" + titulo + "]";
    }
}