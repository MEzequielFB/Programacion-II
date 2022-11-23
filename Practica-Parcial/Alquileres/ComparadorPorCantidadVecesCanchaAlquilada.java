import java.util.Comparator;

public class ComparadorPorCantidadVecesCanchaAlquilada implements Comparator<Socio> {

    private Cancha cancha;

    public ComparadorPorCantidadVecesCanchaAlquilada(Cancha cancha) {
        this.cancha = cancha;
    }

    @Override
    public int compare(Socio socio1, Socio socio2) {
        return socio1.getCantidadAlquiloCancha(this.cancha);
    }
}