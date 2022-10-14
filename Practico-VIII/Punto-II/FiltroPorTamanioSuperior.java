public class FiltroPorTamanioSuperior extends Filtro {

    private int tamanio_minimo;

    public FiltroPorTamanioSuperior(int tamanio_minimo) {
        this.tamanio_minimo = tamanio_minimo;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getTamanio() > this.tamanio_minimo;
    }
}