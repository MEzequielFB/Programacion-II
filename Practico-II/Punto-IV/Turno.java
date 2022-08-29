import java.time.LocalDate;

public class Turno {
    
    private Usuario usuario; 
    private Cancha canchaReservada;
    private LocalDate fecha;
    private double horario_inicio;
    private double horario_fin;

    public Turno(Usuario usuario, Cancha canchaReservada, LocalDate fecha, double horario_inicio, double horario_fin) {

        this.usuario = usuario;
        this.canchaReservada = canchaReservada;
        this.fecha = fecha;
        this.horario_inicio = horario_inicio;
        this.horario_fin = horario_fin;
    }
    
    //Getters
    public String getNombreUsuario() {
        return usuario.getNombre();
    }

    public Usuario getUsuario() {
        return usuario;
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
    public void setNombreUsuario(Usuario usuario) {
        this.usuario = usuario;
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

    @Override
    public String toString() {
        return "Turno [canchaReservada=" + canchaReservada + ", fecha=" + fecha + ", horario_fin=" + horario_fin
                + ", horario_inicio=" + horario_inicio + ", usuario=" + usuario + "]";
    }
}