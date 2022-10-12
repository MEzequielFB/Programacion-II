import java.util.Comparator;

public class ComparadorAnd implements Comparator<Socio> {

    private Comparator<Socio> comparador1;
    private Comparator<Socio> comparador2;

    public ComparadorAnd(Comparator<Socio> comparador1, Comparator<Socio> comparador2) {
        this.comparador1 = comparador1;
        this.comparador2 = comparador2;
    }

    @Override
    public int compare(Socio socio1, Socio socio2) {

        int resultado = this.comparador1.compare(socio1, socio2);
        if (resultado == 0) {
            resultado = this.comparador2.compare(socio1, socio2);
        }
        return resultado;
    }
}
