import java.util.Comparator;

public class ComparadorAnd implements Comparator<Seguro> {

    private Comparator<Seguro> comparador1;
    private Comparator<Seguro> comparador2;

    public ComparadorAnd(Comparator<Seguro> comparador1, Comparator<Seguro> comparador2) {
        this.comparador1 = comparador1;
        this.comparador2 = comparador2;
    }

    @Override
    public int compare(Seguro seguro1, Seguro seguro2) {

        int resultado = this.comparador1.compare(seguro1, seguro2);
        if (resultado == 0) {
            resultado = this.comparador2.compare(seguro1, seguro2);
        }
        return resultado;
    }
}