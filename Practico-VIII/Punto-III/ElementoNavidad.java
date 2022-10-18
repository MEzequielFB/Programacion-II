import java.util.ArrayList;

public abstract class ElementoNavidad {
    
    public abstract ArrayList<Carta> getCartasValidas();

    public abstract int getCantidadCartasPorRegalo(String regalo);

    public abstract double getPorcentajeCartasPorRegalo(String regalo);

    public abstract int getCantidadNiniosMalos();

    public abstract int getCantCartasRecibidas();
}