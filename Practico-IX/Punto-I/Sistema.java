import java.util.ArrayList;

public class Sistema {
    
    private ArrayList<Contenido> contenidos;

    public Sistema() {
        this.contenidos = new ArrayList<>();
    }

    //Funcionalidades
    public ArrayList<Noticia> buscarNoticias(Filtro filtro) {

        ArrayList<Noticia> noticias_filtradas = new ArrayList<>();
        for (Contenido contenido : this.contenidos) {
            noticias_filtradas.addAll(contenido.buscarNoticias(filtro));
        }
        return noticias_filtradas;
    }

    public void addContenido(Contenido contenido) {

        if (!this.contenidos.contains(contenido)) {
            this.contenidos.add(contenido);
        }
    }

    //Getters
    public int getCantidadNoticiasPorContenido(Contenido contenido) {
        return contenido.getCantidadNoticias();
    }

    public Contenido getCopiaPorPalabraClave(Contenido contenido, String palabra_clave) {
        return contenido.getCopiaPorPalabraClave(palabra_clave);
    }
}