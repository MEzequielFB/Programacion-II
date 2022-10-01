public class FiltroPorTitulo implements Filtro {
    
    private String titulo;

    public FiltroPorTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getTitulo().equalsIgnoreCase(this.titulo);
    }
}