import java.util.Comparator;

public class ComparadorPorCuotaPaga implements Comparator<Socio> {

    @Override
    public int compare(Socio socio1, Socio socio2) {
        if (socio1.getUltimaCuotaPaga() && !socio2.getUltimaCuotaPaga()) {
            return 1;
        } else if ((socio1.getUltimaCuotaPaga() && socio2.getUltimaCuotaPaga()) || (!socio1.getUltimaCuotaPaga() && !socio2.getUltimaCuotaPaga())) {
            return 0;
        }
        return -1;
    }
}