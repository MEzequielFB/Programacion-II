import java.util.Comparator;

public class ComparadorAnd implements Comparator<Elemento> {

    private Comparator<Elemento> comparador1;
    private Comparator<Elemento> comparador2;

    public ComparadorAnd(Comparator<Elemento> comparador1, Comparator<Elemento> comparador2) {
        this.comparador1 = comparador1;
        this.comparador2 = comparador2;
    }

    @Override
    public int compare(Elemento elemento1, Elemento elemento2) {
        
        int resultado = comparador1.compare(elemento1, elemento2);
        if (resultado == 0) {
            resultado = comparador2.compare(elemento1, elemento2);
        }
        return resultado;
    }
    
}