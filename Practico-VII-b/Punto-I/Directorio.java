import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio extends Elemento {

    private ArrayList<Elemento> elementos;

    public Directorio(String nombre, LocalDate fecha_creacion, LocalDate fecha_ultima_modificacion) {

        super(nombre, fecha_creacion, fecha_ultima_modificacion);
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
    public int getCantidadElementos() {
        
        int cantidad_total = 0;
        for (Elemento elemento : this.elementos) {
            cantidad_total += elemento.getCantidadElementos();
        }
        return cantidad_total;
    }

    @Override
    public int getTamanio() {
        
        int tamanio_total = 0;
        for (Elemento elemento : this.elementos) {
            tamanio_total += elemento.getTamanio();
        }
        return tamanio_total;
    }
}