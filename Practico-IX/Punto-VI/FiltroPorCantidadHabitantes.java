public class FiltroPorCantidadHabitantes extends Filtro {

    private int cantidad_habitantes_minima;

    public FiltroPorCantidadHabitantes(int cantidad_habitantes_minima) {
        this.cantidad_habitantes_minima = cantidad_habitantes_minima;
    }

    @Override
    public boolean cumple(Comarca comarca) {
        return comarca.getCantidadHabitantes() > this.cantidad_habitantes_minima;
    }
}