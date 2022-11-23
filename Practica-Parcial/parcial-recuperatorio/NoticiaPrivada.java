public class NoticiaPrivada extends Noticia {

    public NoticiaPrivada(String titulo, String categoria, String contenido, String autor) {
        super(titulo, categoria, contenido, autor);
    }

    @Override
    public ElementoPortal getCopiaEstructura(Filtro filtro) {
        return null;
    }
}