import java.util.ArrayList;

public class Tablero {
    
    private int puntaje_minimo;
    private ArrayList<Ficha> fichas;
    
    public Tablero(int puntaje_minimo) {

        this.puntaje_minimo = puntaje_minimo;
        this.fichas = new ArrayList<>();
    }

    //Funcinalidades
    public ArrayList<Ficha> buscarFichas(Filtro filtro) {

        ArrayList<Ficha> fichas_filtradas = new ArrayList<>();
        for (Ficha ficha : this.fichas) {

            if (filtro.cumple(ficha)) {
                fichas_filtradas.add(ficha);
            }
        }
        return fichas_filtradas;
    }

    public void addFicha(Ficha ficha) {

        if (!this.fichas.contains(ficha)) {
            this.fichas.add(ficha);
        }
    }

    //Getters
    public int getPuntajeMinimo() {
        return this.puntaje_minimo;
    }

    public int getDificultad() {

        int suma_fortaleza = 0, suma_poder = 0;
        for (Ficha ficha : this.fichas) {
            suma_fortaleza += ficha.getFortaleza();
            suma_poder += ficha.getPoderDestruccion();
        }
        return suma_fortaleza / suma_poder;
    }

    @Override
    public String toString() {
        return "Tablero [puntaje_minimo=" + puntaje_minimo + ", fichas=" + fichas + "]";
    }
}