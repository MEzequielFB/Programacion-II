import java.time.LocalDateTime;

public class Turno {
    
    private Cliente cliente;
    private Peluquero peluquero;
   /*  private LocalDate fecha;
    private LocalTime horario_inicio;
    private LocalTime horario_fin; */
    private LocalDateTime fecha_inicio;
    private LocalDateTime fecha_fin;
    private double precio;

    public Turno(Cliente cliente, Peluquero peluquero, LocalDateTime fecha_inicio, LocalDateTime fecha_fin) {

        this.cliente = cliente;
        this.peluquero = peluquero;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.precio = 500;
    }

    //Getters
    public Cliente getCliente() {
        return cliente;
    }

    public Peluquero getPeluquero() {
        return peluquero;
    }

    public LocalDateTime getFechaInicio() {
        return fecha_inicio;
    }

    public LocalDateTime getFechaFin() {
        return fecha_fin;
    }

    public double getPrecio() {
        return precio;
    }

    //Setters
    public void setPeluquero(Peluquero peluquero) {
        this.peluquero = peluquero;
    }

    public void setFechaInicio(LocalDateTime Fecha_inicio) {
        this.fecha_inicio = Fecha_inicio;
    }

    public void setFechaFin(LocalDateTime Fecha_fin) {
        this.fecha_fin = Fecha_fin;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Turno [cliente=" + cliente + ", peluquero=" + peluquero + ", fecha_fin=" + fecha_fin + ", fecha_inicio=" + fecha_inicio + "]";
    }
}