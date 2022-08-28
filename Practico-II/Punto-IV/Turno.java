import java.time.LocalDate;
import java.time.LocalTime;

public class Turno {
    
    private String nombreUsuario;
    private Cancha canchaReservada;
    private LocalDate fecha;
    private double horario_inicio;
    private double horario_fin;

    public Turno(String nombreUsuario, Cancha canchaReservada, LocalDate fecha, double horario_inicio, double horario_fin) {

        this.nombreUsuario = nombreUsuario;
        this.canchaReservada = canchaReservada;
        this.fecha = fecha;
        this.horario_inicio = horario_inicio;
        this.horario_fin = horario_fin;
    }

    //Getters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public Cancha getCanchaReservada() {
        return canchaReservada;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getHorario_inicio() {
        return horario_inicio;
    }

    public double getHorario_fin() {
        return horario_fin;
    }

    //Setters
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setCanchaReservada(Cancha canchaReservada) {
        this.canchaReservada = canchaReservada;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHorario_inicio(double horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public void setHorario_fin(double horario_fin) {
        this.horario_fin = horario_fin;
    }
}