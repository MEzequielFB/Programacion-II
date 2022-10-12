import java.util.Comparator;

public class ComparadorNot implements Comparator<Socio> {

    private Comparator<Socio> comparador;

    public ComparadorNot(Comparator<Socio> comparador) {
        this.comparador = comparador;
    }

    @Override
    public int compare(Socio socio1, Socio socio2) {
        return - comparador.compare(socio1, socio2);
    }
}