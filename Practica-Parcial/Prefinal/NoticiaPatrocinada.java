public class NoticiaPatrocinada extends Noticia {

    public NoticiaPatrocinada(String titulo, String editor, String contenido, String categoria) {
        super(titulo, editor, contenido, categoria);
    }

    //Getters
    @Override
    public int getCantidadElementosPorCaracteristica(Filtro filtro) {
        return 1;
    }
}