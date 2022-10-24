import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class TareaSimple extends TareaTerminal {

    private String estado; //completada, en espera, en procesamiento
    private LocalDate fecha_inicio_estimada;
    private LocalDate fecha_finalizacion_estimada;
    private LocalDate fecha_inicio_real;
    private LocalDate fecha_finalizacion_real;
    private ArrayList<Recurso> recursos;

    public TareaSimple(String titulo, LocalDate fecha_inicio_estimada, LocalDate fecha_finalizacion_estimada) {
        super(titulo);
        this.estado = "en espera";
        this.fecha_inicio_estimada = fecha_inicio_estimada;
        this.fecha_finalizacion_estimada = fecha_finalizacion_estimada;
        this.fecha_inicio_real = null;
        this.fecha_finalizacion_real = null;
        this.recursos = new ArrayList<>();
    }

    //Funcionalidades
    public boolean sePuedeAgregarRecurso(Recurso recurso) {
        return !this.recursos.contains(recurso) && recurso.sePuedeAsignarTarea(this);
    }

    //Si el recurso agrego la tarea a su lista, el recurso se agrega a la lista de recursos de la tarea
    public void addRecurso(Recurso recurso) {
        if (!this.recursos.contains(recurso) && recurso.addTareaAsignada(this)) {
            this.recursos.add(recurso);
        }
    }

    //Getters
    @Override
    public int getDuracionEstimada() {
        return Math.abs(Period.between(this.fecha_inicio_estimada, this.fecha_finalizacion_estimada).getDays());
    }

    public ArrayList<Recurso> getRecursos() {
        return new ArrayList<>(this.recursos);
    }

    @Override
    public ArrayList<TareaTerminal> getTareasAtrasadas() {

        ArrayList<TareaTerminal> tareas_atrasadas = new ArrayList<>();
        if (this.estado.equalsIgnoreCase("en espera") && this.fecha_finalizacion_estimada.isBefore(LocalDate.now())) {
            tareas_atrasadas.add(this);
        }
        return tareas_atrasadas;
    }

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