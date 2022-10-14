import java.util.Comparator;

public class ComparadorPorTamanio implements Comparator<Elemento> {

    @Override
    public int compare(Elemento elemento1, Elemento elemento2) {
        return elemento1.getTamanio() - elemento2.getTamanio();
    }
}