import java.util.Comparator;

public class ComparadorPorNumero implements Comparator<Seguro> {

    @Override
    public int compare(Seguro seguro1, Seguro seguro2) {
        return seguro1.getNumero() - seguro2.getNumero();
    }
}