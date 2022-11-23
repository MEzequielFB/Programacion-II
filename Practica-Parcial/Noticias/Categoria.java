import java.util.ArrayList;

public class Categoria extends ElementoNoticia {

    private String descripcion;
    private String imagen;
    private ArrayList<ElementoNoticia> elementos;

    public Categoria(String titulo, String descripcion, String imagen) {
        super(titulo);
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.elementos = new ArrayList<>();
    }

    //Funcionalidades
    public void addElemento(ElementoNoticia elemento_noticia) {
        if (!this.elementos.contains(elemento_noticia)) {
            this.elementos.add(elemento_noticia);
        }
    }

    //Getters
    @Override
    public ArrayList<String> getMapa(ElementoNoticia elemento_noticia) {
        ArrayList<String> mapa_sitio = new ArrayList<>();
        for (ElementoNoticia elemento : this.elementos) {
            mapa_sitio.addAll(elemento.getMapa(elemento_noticia));
        }
        if (!mapa_sitio.isEmpty() || this.equals(elemento_noticia)) {
            mapa_sitio.add(0, this.getTitulo());
        }
        return mapa_sitio;
    }

    @Override
    public ElementoNoticia getCopia(String palabra_clave) {
        Categoria this_copia = new Categoria(this.getTitulo(), this.getDescripcion(), this.getImagen());
        for (ElementoNoticia elemento : this.elementos) {
            ElementoNoticia elemento_copia = elemento.getCopia(palabra_clave);
            if (elemento_copia != null) {
                this_copia.addElemento(elemento_copia);
            }
        }
        return this_copia;
    }

    @Override
    public int getCantidadNoticias() {
        int cantidad_noticias = 0;
        for (ElementoNoticia elemento : this.elementos) {
            cantidad_noticias += elemento.getCantidadNoticias();
        }
        return cantidad_noticias;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getImagen() {
        return this.imagen;
    }
}