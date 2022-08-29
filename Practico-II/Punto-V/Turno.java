import java.time.LocalDate;
import java.time.LocalTime;

public class Turno {
    
    private Cliente cliente;
    private Peluquero peluquero;
    private LocalDate fecha;
    private LocalTime horario_inicio;
    private LocalTime horario_fin;
    private double precio;

    public Turno(Cliente cliente, Peluquero peluquero, LocalDate fecha, LocalTime horario_inicio, LocalTime horario_fin) {

        this.cliente = cliente;
        this.peluquero = peluquero;
        this.fecha = fecha;
        this.horario_inicio = horario_inicio;
        this.horario_fin = horario_fin;
    }

    //Getters
    public Cliente getCliente() {
        return cliente;
    }

    public Peluquero getPeluquero() {
        return peluquero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHorario_inicio() {
        return horario_inicio;
    }

    public LocalTime getHorario_fin() {
        return horario_fin;
    }

    public double getPrecio() {
        return precio;
    }

    //Setters
    public void setPeluquero(Peluquero peluquero) {
        this.peluquero = peluquero;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHorario_inicio(LocalTime horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public void setHorario_fin(LocalTime horario_fin) {
        this.horario_fin = horario_fin;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}