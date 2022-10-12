import java.util.Comparator;

public class ComparadorPorCantidadAlquileresCancha implements Comparator<Socio> {

    private Cancha cancha;

    public ComparadorPorCantidadAlquileresCancha(Cancha cancha) {
        this.cancha = cancha;
    }

    @Override
    public int compare(Socio socio1, Socio socio2) {
        return socio1.getCantVecesAlquiloCancha(cancha) - socio2.getCantVecesAlquiloCancha(cancha);
    }
}