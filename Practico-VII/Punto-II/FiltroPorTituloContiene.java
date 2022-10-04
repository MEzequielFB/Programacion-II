public class FiltroPorTituloContiene extends FiltroPorTitulo {
    
    public FiltroPorTituloContiene(String titulo) {
        super(titulo);
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getTitulo().contains(this.getTitulo());
    }
}
