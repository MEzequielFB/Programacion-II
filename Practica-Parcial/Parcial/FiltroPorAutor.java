public class FiltroPorAutor extends Filtro {

    private String autor_buscado;

    public FiltroPorAutor(String autor_buscado) {
        this.autor_buscado = autor_buscado;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getAutor().equalsIgnoreCase(this.autor_buscado);
    }
}