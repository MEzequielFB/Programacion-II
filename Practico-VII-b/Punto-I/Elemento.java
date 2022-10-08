import java.time.LocalDate;

public abstract class Elemento {
    
    private String nombre;
    private LocalDate fecha_creacion;
    private LocalDate fecha_ultima_modificacion;

    public Elemento(String nombre, LocalDate fecha_creacion, LocalDate fecha_ultima_modificacion) {
        
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.fecha_ultima_modificacion = fecha_ultima_modificacion;
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }
    
    public LocalDate getFechaCreacion() {
        return this.fecha_creacion;
    }

    public LocalDate getFechaUltimaModificacion() {
        return this.fecha_ultima_modificacion;
    }

    public abstract int getTamanio();

    public abstract int getCantidadElementos();

    @Override
    public boolean equals(Object o) {

        try {
            Elemento otroElemento = (Elemento) o;
            return this.getNombre().equalsIgnoreCase(otroElemento.getNombre());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Elemento [nombre=" + nombre + "]";
    }
}