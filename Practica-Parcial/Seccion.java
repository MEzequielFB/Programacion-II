import java.util.ArrayList;

public class Seccion extends ElementoNoticia {
    
    private static String _mensaje_sin_categoria = "sin definir";
    private int posicion_categoria;
    private ArrayList<ElementoNoticia> elementos;

    public Seccion(int posicion_categoria) {
        this.posicion_categoria = posicion_categoria;
        this.elementos = new ArrayList<>();
    }

    //Funcionalidades
    @Override
    public ArrayList<Noticia> buscarNoticias(Filtro filtro) {
        ArrayList<Noticia> noticias_filtradas = new ArrayList<>();
        for (ElementoNoticia elemento : this.elementos) {
            noticias_filtradas.addAll(elemento.buscarNoticias(filtro));
        }
        return noticias_filtradas;
    }

    public void addElemento(ElementoNoticia elemento) {
        if (!this.elementos.contains(elemento)) {
            this.elementos.add(elemento);
        }
    }

    //Getters
    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> palabras_clave = new ArrayList<>();
        for (ElementoNoticia elemento : this.elementos) {
            for (String palabra_clave : elemento.getPalabrasClave()) {
                if (!palabras_clave.contains(palabra_clave)) {
                    palabras_clave.add(palabra_clave);
                }
            }
        }
        return palabras_clave;
    }

    public static String getMensajeSinCategoria() {
        return _mensaje_sin_categoria;
    }

    public int getPosicionCategoria() {
        return this.posicion_categoria;
    }

    @Override
    public String getCategoria() {
        if (this.elementos.size() >= this.posicion_categoria) {
            return this.elementos.get(this.posicion_categoria).getCategoria();
        }
        return _mensaje_sin_categoria;
    }

    //Setters
    public static void setMensajeSinCategoria(String mensaje) {
        _mensaje_sin_categoria = mensaje;
    }

    public void setPosicionCategoria(int posicion_categoria) {
        this.posicion_categoria = posicion_categoria;
    }
}