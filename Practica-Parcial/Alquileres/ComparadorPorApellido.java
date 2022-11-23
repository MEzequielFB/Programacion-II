import java.util.Comparator;

public class ComparadorPorApellido implements Comparator<Socio> {

    @Override
    public int compare(Socio socio1, Socio socio2) {
        return socio1.getApellido().compareToIgnoreCase(socio2.getApellido());
    }
}