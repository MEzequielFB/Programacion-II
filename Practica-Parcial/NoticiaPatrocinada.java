import java.util.ArrayList;

public class NoticiaPatrocinada extends Noticia {

    public NoticiaPatrocinada(String titulo, String contenido, String autor, String categoria) {
        super(titulo, contenido, autor, categoria);
    }

    //Funcionalidades
    @Override
    public ArrayList<Noticia> buscarNoticias(Filtro filtro) {
        ArrayList<Noticia> noticias_filtradas = new ArrayList<>();
        noticias_filtradas.add(this);
        return noticias_filtradas;
    }
}