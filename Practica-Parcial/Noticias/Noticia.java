import java.util.ArrayList;

public class Noticia extends ElementoNoticia {
    
    private String introduccion;
    private String texto;
    private String autor;
    private String link;
    private ArrayList<String> palabras_clave;
    
    public Noticia(String titulo, String introduccion, String texto, String autor, String link) {
        super(titulo);
        this.introduccion = introduccion;
        this.texto = texto;
        this.autor = autor;
        this.link = link;
        this.palabras_clave = new ArrayList<>();
    }

    //Funcionalidades
    public boolean contienePalabraClave(String palabra_clave) {
        return this.palabras_clave.contains(palabra_clave);
    }

    public void addPalabraClave(String palabra_clave) {
        if (!this.palabras_clave.contains(palabra_clave)) {
            this.palabras_clave.add(palabra_clave);
        }
    }

    //Getters
    @Override
    public ArrayList<String> getMapa(ElementoNoticia elemento_noticia) {
        ArrayList<String> mapa_sitio = new ArrayList<>();
        if (this.equals(elemento_noticia)) {
            mapa_sitio.add(this.getLink());
        }
        return mapa_sitio;
    }

    @Override
    public ElementoNoticia getCopia(String palabra_clave) {
        if (this.contienePalabraClave(palabra_clave)) {
            return new Noticia(this.getTitulo(), this.getIntroduccion(), this.getTexto(), this.getAutor(), this.getLink());
        }
        return null;
    }

    @Override
    public int getCantidadNoticias() {
        return 1;
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
}