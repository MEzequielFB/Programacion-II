import java.time.LocalDate;

public class Archivo extends Elemento {

    private int tamanio;

    public Archivo(String nombre, LocalDate fecha_creacion, LocalDate fecha_ultima_modificacion, int tamanio) {

        super(nombre, fecha_creacion, fecha_ultima_modificacion);
        this.tamanio = tamanio;
    }

    //Getters
    @Override
    public int getCantidadElementos() {
        return 1;
    }

    @Override
    public int getTamanio() {
        return this.tamanio;
    }
}