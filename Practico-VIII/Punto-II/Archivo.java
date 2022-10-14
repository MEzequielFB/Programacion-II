import java.time.LocalDate;
import java.util.ArrayList;

public class Archivo extends Elemento {
    
    private int tamanio;

    public Archivo(String nombre, LocalDate fecha_creacion, LocalDate fecha_modificacion, int tamanio) {
        super(nombre, fecha_creacion, fecha_modificacion);
        this.tamanio = tamanio;
    }

    //Getters
    @Override
    public ArrayList<Elemento> getElementosFiltrados(Filtro filtro) {

        ArrayList<Elemento> elementos_filtrados = new ArrayList<>();
        if (filtro.cumple(this)) {
            elementos_filtrados.add(this);
        }
        return elementos_filtrados;
    }

    public int getTamanio() {
        return this.tamanio;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Archivo otroArchivo = (Archivo) o;
            return this.getNombre().equalsIgnoreCase(otroArchivo.getNombre());
        }
        catch(Exception exc) {
            return false;
        }
    }
}