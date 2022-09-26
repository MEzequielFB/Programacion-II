import java.time.LocalDateTime;

public class Alquiler {
    
    private static int contador;

    private int id;
    private Cliente cliente;
    private Producto producto;
    private LocalDateTime fecha_limite;

    public Alquiler(Cliente cliente, Producto producto, LocalDateTime fecha_limite) {

        this.id = contador;
        this.setCliente(cliente);
        this.setProducto(producto);
        this.setFechaLimite(fecha_limite);

        contador++;
    }

    //Getters
    public int getId() {
        return this.id;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public LocalDateTime getFechaLimite() {
        return this.fecha_limite;
    }

    //Setters
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setFechaLimite(LocalDateTime fecha_limite) {
        this.fecha_limite = fecha_limite;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Alquiler otroAlquiler = (Alquiler) o;
            return this.getId() == otroAlquiler.getId();
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Alquiler [cliente=" + cliente + ", fecha_limite=" + fecha_limite + ", id=" + id + ", producto="
                + producto + "]";
    }
}