public class FiltroPorAutor implements Filtro {

    private String autor;

    public FiltroPorAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.contieneAutor(this.autor);
    }
}
