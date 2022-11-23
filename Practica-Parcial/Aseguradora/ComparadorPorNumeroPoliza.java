import java.util.Comparator;

public class ComparadorPorNumeroPoliza implements Comparator<Seguro> {

    @Override
    public int compare(Seguro seguro1, Seguro seguro2) {
        return seguro1.getNumeroPoliza() - seguro2.getNumeroPoliza();
    }
}