public class FiltroPorPoderSuperior implements Filtro {

    private int poder_destruccion;

    public FiltroPorPoderSuperior(int poder_destruccion) {
        this.poder_destruccion = poder_destruccion;
    }

    @Override
    public boolean cumple(Ficha ficha) {
        return ficha.getPoderDestruccion() > this.poder_destruccion;
    }
}