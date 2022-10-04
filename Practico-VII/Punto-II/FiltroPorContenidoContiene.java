public class FiltroPorContenidoContiene implements Filtro {

    private String contenido;

    public FiltroPorContenidoContiene(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getContenidoTextual().contains(this.contenido);
    }
}
