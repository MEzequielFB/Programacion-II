import java.time.LocalDate;
import java.util.ArrayList;

public class TareaSimple extends TareaTerminal {
    
    private LocalDate fecha_inicio_estimada;
    private LocalDate fecha_fin_estimada;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private String estado;

    public TareaSimple(String titulo, LocalDate fecha_inicio_estimada, LocalDate fecha_fin_estimada) {
        super(titulo);
        this.fecha_inicio_estimada = fecha_inicio_estimada;
        this.fecha_fin_estimada = fecha_fin_estimada;
        this.estado = "en espera";
    }

    //Getters
    @Override
    public ArrayList<Recurso> getListaRecursosPorTarea(TareaTerminal tarea) {
        return new ArrayList<>(this.recursos);
    }

    @Override
    public ArrayList<TareaTerminal> getListaTareasPorRecurso(Recurso recurso) {
        ArrayList<TareaTerminal> tareas = new ArrayList<>();
        if (this.contieneRecurso(recurso)) {
            tareas.add(this);
        }
        return tareas;
    }

    @Override
    public ArrayList<TareaSimple> getListaTareasAtrasadas() {
        ArrayList<TareaSimple> tareas_atrasadas = new ArrayList<>();
        if (this.estaAtrasada()) {
            tareas_atrasadas.add(this);
        }
        return tareas_atrasadas;
    }

    @Override
    public LocalDate getFechaInicioEstimada() {
        return this.fecha_inicio_estimada;
    }

    @Override
    public LocalDate getFechaFinEstimada() {
        return this.fecha_fin_estimada;
    }

    @Override
    public LocalDate getFechaInicio() {
        return this.fecha_inicio;
    }

    @Override
    public LocalDate getFechaFin() {
        return this.fecha_fin;
    }

    @Override
    public String getEstado() {
        return this.estado;
    }

    //Setters
    public void setFechaInicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
        this.setEstado("en procesamiento");
    }

    public void setFechaFin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
        this.setEstado("completada");
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}