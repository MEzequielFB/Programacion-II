import java.time.LocalDate;

public class Link extends Elemento {

    private Elemento referencia;

    public Link(String nombre, LocalDate fecha_creacion, LocalDate fecha_ultima_modificacion, Elemento referencia) {

        super(nombre, fecha_creacion, fecha_ultima_modificacion);
        this.referencia = referencia;
    }

    //Getters
    public Elemento getReferencia() {
        return this.referencia;
    }

    @Override
    public int getCantidadElementos() {
        return 1;
    }

    @Override
    public int getTamanio() {
        return 1;
    }
}