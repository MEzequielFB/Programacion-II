import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Aseguradora {

    private ArrayList<Seguro> seguros;

    public Aseguradora() {
        this.seguros = new ArrayList<>();
    }

    //Funcionalidades
    public ArrayList<Seguro> buscarSeguros(Filtro filtro, Comparator<Seguro> comparador) {
        ArrayList<Seguro> seguros_filtrados = new ArrayList<>();
        for (Seguro seguro : this.seguros) {
            seguros_filtrados.addAll(seguro.buscarSeguros(filtro));
        }
        Collections.sort(seguros_filtrados, comparador);
        return seguros_filtrados;
    }

    public void addSeguro(Seguro seguro) {
        if (!this.seguros.contains(seguro)) {
            this.seguros.add(seguro);
        }
    }
}