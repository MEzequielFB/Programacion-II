import java.util.ArrayList;

public class Sistema {
    
    private ArrayList<ElementoNavidad> elementos_navidad;
    private ArrayList<Carta> cartas_guardadas;

    public Sistema() { 
        this.elementos_navidad = new ArrayList<>();
        this.cartas_guardadas = new ArrayList<>();
    }

    //Funcionalidades
    public int getCantidadCartasPorRegalo(ElementoNavidad elemento_navidad, String regalo) {

        if (this.elementos_navidad.contains(elemento_navidad)) {
            return elemento_navidad.getCantidadCartasPorRegalo(regalo);
        }
        return -1;
    }

    public double getPorcentajeCartasPorRegalo(ElementoNavidad elemento_navidad, String regalo) {

        if (this.elementos_navidad.contains(elemento_navidad)) {
            return elemento_navidad.getPorcentajeCartasPorRegalo(regalo);
        }
        return -1;
    }

    public int getCantidadNiniosMalos(ElementoNavidad elemento_navidad) {

        if (this.elementos_navidad.contains(elemento_navidad)) {
            return elemento_navidad.getCantidadNiniosMalos();
        }
        return -1;
    }

    public int getCantCartasRecibidas(ElementoNavidad elemento_navidad) {

        if (this.elementos_navidad.contains(elemento_navidad)) {
            return elemento_navidad.getCantCartasRecibidas();
        }
        return -1;
    }

    public void guardarCartas() {

        for (ElementoNavidad elemento_navidad : this.elementos_navidad) {
            /* this.cartas_guardadas.addAll(elemento_navidad.getCartasValidas()); */
            for (Carta carta : elemento_navidad.getCartasValidas()) {

                if (!this.cartas_guardadas.contains(carta)) {
                    this.cartas_guardadas.add(carta);
                }
            }
        }
    }

    public void addElementoNavidad(ElementoNavidad elemento_navidad) {

        if (!this.elementos_navidad.contains(elemento_navidad)) {
            this.elementos_navidad.add(elemento_navidad);
        }
    }

    @Override
    public String toString() {
        return "Sistema: " + this.cartas_guardadas;
    }
}