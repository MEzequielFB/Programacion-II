import java.util.Comparator;

public class ComparadorPorNombre implements Comparator<Elemento> {

    @Override
    public int compare(Elemento elemento1, Elemento elemento2) {
        return elemento1.getNombre().compareTo(elemento2.getNombre());
    }
}