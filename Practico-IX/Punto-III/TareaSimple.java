import java.time.LocalDate;

public class TareaSimple extends TareaTerminal {

    private String estado; //completada, en espera, en procesamiento
    private LocalDate fecha_inicio_estimada;
    private LocalDate fecha_finalizacion_estimada;
    private LocalDate fecha_inicio_real;
    private LocalDate fecha_finalizacion_real;

    public TareaSimple(String titulo, LocalDate fecha_inicio_estimada, LocalDate fecha_finalizacion_estimada) {
        super(titulo);
        this.estado = "en espera";
        this.fecha_inicio_estimada = fecha_inicio_estimada;
        this.fecha_finalizacion_estimada = fecha_finalizacion_estimada;
        this.fecha_inicio_real = null;
        this.fecha_finalizacion_real = null;
    }

    //Getters
    public String getEstado() {
        return this.estado;
    }

    public LocalDate getFechaInicioEstimada() {
        return this.fecha_inicio_estimada;
    }

    public LocalDate getFechaFinalizacionEstimada() {
        return this.fecha_finalizacion_estimada;
    }

    public LocalDate getFechaInicioReal() {
        return this.fecha_inicio_real;
    }

    public LocalDate getFechaFinalizacionReal() {
        return this.fecha_finalizacion_real;
    }

    //Setters
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaInicioReal(LocalDate fecha_inicio_real) {
        this.fecha_inicio_real = fecha_inicio_real;
        this.setEstado("en procesamiento");

    }

    public void setFechaFinalizacionReal(LocalDate fecha_finalizacion_real) {
        this.fecha_finalizacion_real = fecha_finalizacion_real;
        this.setEstado("completada");
    }
}