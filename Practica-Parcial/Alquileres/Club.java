import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Club {
    
    private ArrayList<Socio> socios;
    private ArrayList<Cancha> canchas;
    private ArrayList<Alquiler> alquileres;

    public Club() {
        this.socios = new ArrayList<>();
        this.canchas = new ArrayList<>();
        this.alquileres = new ArrayList<>();
    }

    //Funcionalidades
    public ArrayList<Socio> buscarSocios(Filtro filtro, Comparator<Socio> comparador) {
        ArrayList<Socio> socios_filtrados = new ArrayList<>();
        for (Socio socio : this.socios) {
            if (filtro.cumple(socio)) {
                socios_filtrados.add(socio);
            }
        }
        Collections.sort(socios_filtrados, comparador);
        return socios_filtrados;
    }

    public void addSocio(Socio socio) {
        if (!this.socios.contains(socio)) {
            this.socios.add(socio);
        }
    }

    public void addCancha(Cancha cancha) {
        if (!this.canchas.contains(cancha)) {
            this.canchas.add(cancha);
        }
    }

    public void addAlquiler(Alquiler alquiler) {
        if (!this.alquileres.contains(alquiler)) {
            this.alquileres.add(alquiler);
        }
    }
}