import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Elemento {
    
    private String nombre;
    private LocalDate fecha_creacion;
    private LocalDate fecha_modificacion;

    public Elemento(String nombre, LocalDate fecha_creacion, LocalDate fecha_modificacion) {
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public LocalDate getFechaCreacion() {
        return this.fecha_creacion;
    }

    public LocalDate getFechaModificacion() {
        return this.fecha_modificacion;
    }

    public abstract int getTamanio();

    public abstract ArrayList<Elemento> getElementosFiltrados(Filtro filtro);

    @Override
    public String toString() {
        return this.nombre + "";
    }
}