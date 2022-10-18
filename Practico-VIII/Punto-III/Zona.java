import java.util.ArrayList;

public class Zona extends ElementoNavidad {
    
    private String nombre;
    private ArrayList<ElementoNavidad> elementos_navidad;

    public Zona(String nombre) {
        this.nombre = nombre;
        this.elementos_navidad = new ArrayList<>();
    }

    //Funcionalidades
    public void addElementoNavidad(ElementoNavidad elemento_navidad) {

        if (!this.elementos_navidad.contains(elemento_navidad)) {
            this.elementos_navidad.add(elemento_navidad);
        }
    }

    //Getters
    @Override
    public ArrayList<Carta> getCartasValidas() {

        ArrayList<Carta> cartas_validas = new ArrayList<>();
        for (ElementoNavidad elemento_navidad : this.elementos_navidad) {
            cartas_validas.addAll(elemento_navidad.getCartasValidas());
        }
        return cartas_validas;
    }

    @Override
    public int getCantidadCartasPorRegalo(String regalo) {
        
        int contador = 0;
        for (ElementoNavidad elemento_navidad : this.elementos_navidad) {
            contador += elemento_navidad.getCantidadCartasPorRegalo(regalo);
        }
        return contador;
    }

    @Override
    public double getPorcentajeCartasPorRegalo(String regalo) {
        return ((double) this.getCantidadCartasPorRegalo(regalo) / (double) this.getCantCartasRecibidas()) * 100.0;
    }

    @Override
    public int getCantidadNiniosMalos() {
        
        int cantidad_ninios_malos = 0;
        for (ElementoNavidad elemento_navidad : this.elementos_navidad) {
            cantidad_ninios_malos += elemento_navidad.getCantidadNiniosMalos();
        }
        return cantidad_ninios_malos;
    }

    @Override
    public int getCantCartasRecibidas() {

        int cantidad_cartas = 0;
        for (ElementoNavidad elemento_navidad : this.elementos_navidad) {
            cantidad_cartas += elemento_navidad.getCantCartasRecibidas();
        }
        return cantidad_cartas;
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Zona otraZona = (Zona) o;
            return this.getNombre().equalsIgnoreCase(otraZona.getNombre());
        }
        catch(Exception exc) {
            return false;
        }
    }
}