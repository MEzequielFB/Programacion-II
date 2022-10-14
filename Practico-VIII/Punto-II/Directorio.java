import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio extends Elemento {
    
    protected ArrayList<Elemento> elementos;

    public Directorio(String nombre, LocalDate fecha_creacion, LocalDate fecha_modificacion) {
        super(nombre, fecha_creacion, fecha_modificacion);
        this.elementos = new ArrayList<>();
    }

    //Funcionalidades
    public void addElemento(Elemento elemento) {

        if (!this.elementos.contains(elemento)) {
            this.elementos.add(elemento);
        }
    }

    //Getters
    @Override
    public ArrayList<Elemento> getElementosFiltrados(Filtro filtro) {

        ArrayList<Elemento> elementos_filtrados = new ArrayList<>();
        for (Elemento elemento : this.elementos) {

            elementos_filtrados.addAll(elemento.getElementosFiltrados(filtro));
            /* if (filtro.cumple(elemento)) {
                elementos_filtrados.add(elemento);
            } */
        }
        return elementos_filtrados;
    }

    @Override
    public int getTamanio() {
        
        int tamanio_total = 0;
        for (Elemento elemento : this.elementos) {
            tamanio_total += elemento.getTamanio();
        }
        return tamanio_total;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Directorio otroDirectorio = (Directorio) o;
            return this.getNombre().equalsIgnoreCase(otroDirectorio.getNombre());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ": " + this.elementos;
    }
}