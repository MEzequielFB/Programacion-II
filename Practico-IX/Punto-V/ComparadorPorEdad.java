import java.util.Comparator;

public class ComparadorPorEdad implements Comparator<Empleado> {

    @Override
    public int compare(Empleado empleado1, Empleado empleado2) {
        return empleado1.getEdad() - empleado2.getEdad();
    }
}