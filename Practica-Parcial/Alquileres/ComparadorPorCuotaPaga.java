import java.util.Comparator;

public class ComparadorPorCuotaPaga implements Comparator<Socio> {

    @Override
    public int compare(Socio socio1, Socio socio2) {
        if (socio1.tieneUltimaCuotaPaga() && !socio2.tieneUltimaCuotaPaga()) {
            return 1;
        } else if ((socio1.tieneUltimaCuotaPaga() && socio2.tieneUltimaCuotaPaga()) || (!socio1.tieneUltimaCuotaPaga() && !socio2.tieneUltimaCuotaPaga())) {
            return 0;
        }
        return -1;
    }
}