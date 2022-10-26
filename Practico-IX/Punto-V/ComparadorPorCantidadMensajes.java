import java.util.Comparator;

public class ComparadorPorCantidadMensajes implements Comparator<Empleado> {

    @Override
    public int compare(Empleado empleado1, Empleado empleado2) {
        return empleado1.getCantidadMensajes() - empleado2.getCantidadMensajes();
    }
}