public class FiltroPorTamanioSuperior implements Filtro {

    private int tamanio;

    public FiltroPorTamanioSuperior(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public boolean cumple(Ficha ficha) {
        return ficha.getTamanio() > this.tamanio;
    }
}
