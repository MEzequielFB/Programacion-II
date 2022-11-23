import java.time.LocalDate;
import java.util.ArrayList;

public class TareaCompuesta extends TareaTerminal {

    private ArrayList<TareaTerminal> tareas;

    public TareaCompuesta(String titulo) {
        super(titulo);
        this.tareas = new ArrayList<>();
    }

    //Funcionalidades
    public void addTarea(TareaTerminal tarea) {
        if (!this.tareas.contains(tarea)) {
            this.tareas.add(tarea);
        }
    }

    //Getters
    @Override
    public ArrayList<Recurso> getListaRecursosPorTarea(TareaTerminal tarea) {
        ArrayList<Recurso> recursos_involucrados = new ArrayList<>();
        for (TareaTerminal tarea_terminal : this.tareas) {
            recursos_involucrados.addAll(tarea_terminal.getListaRecursosPorTarea(tarea));
        }
        return recursos_involucrados;
    }

    @Override
    public ArrayList<TareaTerminal> getListaTareasPorRecurso(Recurso recurso) {
        ArrayList<TareaTerminal> tareas = new ArrayList<>();
        for (TareaTerminal tarea : this.tareas) {
            tareas.addAll(tarea.getListaTareasPorRecurso(recurso));
        }
        if (this.contieneRecurso(recurso)) {
            tareas.add(this);
        }
        return tareas;
    }

    @Override
    public ArrayList<TareaSimple> getListaTareasAtrasadas() {
        ArrayList<TareaSimple> tareas_atrasadas = new ArrayList<>();
        for (TareaTerminal tarea : this.tareas) {
            tareas_atrasadas.addAll(tarea.getListaTareasAtrasadas());
        }
        return tareas_atrasadas;
    }

    @Override
    public LocalDate getFechaInicioEstimada() {
        LocalDate fecha_inicio_estimada = null;
        for (TareaTerminal tarea : this.tareas) {
            LocalDate fecha_tarea = tarea.getFechaInicioEstimada();
            if (fecha_inicio_estimada == null) {
                fecha_inicio_estimada = fecha_tarea;
            } else if (fecha_tarea.isBefore(fecha_inicio_estimada)) {
                fecha_inicio_estimada = fecha_tarea;
            }
        }
        return fecha_inicio_estimada;
    }

    @Override
    public LocalDate getFechaFinEstimada() {
        LocalDate fecha_fin_estimada = null;
        for (TareaTerminal tarea : this.tareas) {
            LocalDate fecha_tarea = tarea.getFechaFinEstimada();
            if (fecha_fin_estimada == null) {
                fecha_fin_estimada = fecha_tarea;
            } else if (fecha_tarea.isAfter(fecha_fin_estimada)) {
                fecha_fin_estimada = fecha_tarea;
            }
        }
        return fecha_fin_estimada;
    }

    @Override
    public LocalDate getFechaInicio() {
        LocalDate fecha_inicio = null;
        for (TareaTerminal tarea : this.tareas) {
            LocalDate fecha_tarea = tarea.getFechaInicio();
            if (fecha_inicio == null) {
                fecha_inicio = fecha_tarea;
            } else if (fecha_tarea.isBefore(fecha_inicio)) {
                fecha_inicio = fecha_tarea;
            }
        }
        return fecha_inicio;
    }

    @Override
    public LocalDate getFechaFin() {
        LocalDate fecha_fin = null;
        for (TareaTerminal tarea : this.tareas) {
            LocalDate fecha_tarea = tarea.getFechaFin();
            if (fecha_fin == null) {
                fecha_fin = fecha_tarea;
            } else if (fecha_tarea.isAfter(fecha_fin)) {
                fecha_fin = fecha_tarea;
            }
        }
        return fecha_fin;
    }

    @Override
    public String getEstado() {
        String estado = "en espera";
        int contador_completadas = 0;
        for (TareaTerminal tarea : this.tareas) {
            String estado_tarea = tarea.getEstado();
            if (estado_tarea.equalsIgnoreCase("completada")) {
                contador_completadas++;
            } else if (estado_tarea.equalsIgnoreCase("en procesamiento")) {
                estado = "en procesamiento";
            }
        }
        if (contador_completadas == this.tareas.size()) {
            estado = "completada";
        }
        return estado;
    }
}