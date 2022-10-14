import java.util.Comparator;

public class ComparadorPorFechaCreacion implements Comparator<Elemento> {

    @Override
    public int compare(Elemento elemento1, Elemento elemento2) {
        if (elemento1.getFechaCreacion().isAfter(elemento2.getFechaCreacion())) {
            return 1;
        } else if (elemento1.getFechaCreacion().isBefore(elemento2.getFechaCreacion())) {
            return -1;
        }
        return 0;
    }
}