import java.util.Comparator;

public class ComparadorPorDni implements Comparator<Seguro> {

    @Override
    public int compare(Seguro seguro1, Seguro seguro2) {
        return seguro1.getDniDuenio().compareToIgnoreCase(seguro2.getDniDuenio());
    }
}