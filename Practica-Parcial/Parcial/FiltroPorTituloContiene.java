public class FiltroPorTituloContiene extends Filtro {
    
    private String palabra_buscada;

    public FiltroPorTituloContiene(String palabra_buscada) {
        this.palabra_buscada = palabra_buscada;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getTitulo().contains(this.palabra_buscada);
    }
}