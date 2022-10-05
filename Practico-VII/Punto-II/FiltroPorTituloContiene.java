public class FiltroPorTituloContiene implements Filtro {

    private String titulo;

    public FiltroPorTituloContiene(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getTitulo().contains(this.titulo);
    }
}
