public class FiltroPorTitulo extends Filtro {

    private String titulo_buscado;

    public FiltroPorTitulo(String titulo_buscado) {
        this.titulo_buscado = titulo_buscado;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getTitulo().equalsIgnoreCase(this.titulo_buscado);
    }
}