public class FiltroPorLargoTexto extends Filtro {

    private int largo;

    public FiltroPorLargoTexto(int largo) {
        this.largo = largo;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getTexto().length() > this.largo;
    }
}