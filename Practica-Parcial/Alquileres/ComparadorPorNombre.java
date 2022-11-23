import java.util.Comparator;

public class ComparadorPorNombre implements Comparator<Socio> {

    @Override
    public int compare(Socio socio1, Socio socio2) {
        return socio1.getNombre().compareToIgnoreCase(socio2.getNombre());
    }
}