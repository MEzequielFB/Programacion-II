public class FiltroPorLargoTexto extends Filtro {

    private int largo_minimo;

    public FiltroPorLargoTexto(int largo_minimo) {
        this.largo_minimo = largo_minimo;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getTexto().length() > largo_minimo;
    }
}