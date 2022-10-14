import java.util.Comparator;

public class ComparadorNot implements Comparator<Elemento> {

    private Comparator<Elemento> comparador;

    public ComparadorNot(Comparator<Elemento> comparador) {
        this.comparador = comparador;
    }

    @Override
    public int compare(Elemento elemento1, Elemento elemento2) {
        return - this.comparador.compare(elemento1, elemento2);
    }
}