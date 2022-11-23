import java.util.Comparator;

public class ComparadorPorEdad implements Comparator<Socio> {

    @Override
    public int compare(Socio socio1, Socio socio2) {
        return socio1.getEdad() - socio2.getEdad();
    }
}