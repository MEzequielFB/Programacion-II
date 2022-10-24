import java.time.LocalDate;
import java.time.Period;
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
    public int getDuracionEstimada() {
        return Math.abs(Period.between(this.getFechaInicioEstimada(), this.getFechaFinalizacionEstimada()).getDays());
    }

    @Override
    public ArrayList<Recurso> getRecursos() {

        ArrayList<Recurso> recursos = new ArrayList<>();
        for (TareaTerminal tarea : this.tareas) {
            /* recursos.addAll(tarea.getRecursos()); */

            for (Recurso recurso : tarea.getRecursos()) {
                if (!recursos.contains(recurso)) {
                    recursos.add(recurso);
                }
            }
        }
        for (Recurso recurso : this.recursos) {
            if (!recursos.contains(recurso)) {
                recursos.add(recurso);
            }
        }
        return recursos;
    }

    @Override
    public ArrayList<TareaTerminal> getTareasAtrasadas() { //Se puede agregar a si mismo

        ArrayList<TareaTerminal> tareas_atrasadas = new ArrayList<>();
        for (TareaTerminal tarea : this.tareas) {
            tareas_atrasadas.addAll(tarea.getTareasAtrasadas());
        }
        if (this.getEstado().equalsIgnoreCase("en espera") && this.getFechaFinalizacionEstimada().isBefore(LocalDate.now())) {
            tareas_atrasadas.add(this);
        }
        return tareas_atrasadas;
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
                estado = estado_tarea;
            }
        }
        if (contador_completadas == this.tareas.size()) {
            return "completada";
        }
        return estado;
    }

    @Override
    public LocalDate getFechaInicioEstimada() {
        
        LocalDate fecha_inicio_estimada = null;
        for (TareaTerminal tarea : this.tareas) {

            LocalDate fecha_tarea = tarea.getFechaInicioEstimada();
            if (fecha_inicio_estimada != null) {

                if (fecha_tarea.isBefore(fecha_inicio_estimada)) {
                    fecha_inicio_estimada = fecha_tarea;
                }
            } else {
                fecha_inicio_estimada = fecha_tarea;
            }
        }
        return fecha_inicio_estimada;
    }

    @Override
    public LocalDate getFechaFinalizacionEstimada() {
        
        LocalDate fecha_finalizacion_estimada = null;
        for (TareaTerminal tarea : this.tareas) {

            LocalDate fecha_tarea = tarea.getFechaFinalizacionEstimada();
            if (fecha_finalizacion_estimada != null) {
                
                if (fecha_tarea.isAfter(fecha_finalizacion_estimada)) {
                    fecha_finalizacion_estimada = fecha_tarea;
                }
            } else {
                fecha_finalizacion_estimada = fecha_tarea;
            }
        }
        return fecha_finalizacion_estimada;
    }

    @Override
    public LocalDate getFechaInicioReal() {
        
        LocalDate fecha_inicio_real = null;
        for (TareaTerminal tarea : this.tareas) {

            LocalDate fecha_tarea = tarea.getFechaInicioReal();
            if (fecha_inicio_real != null && fecha_tarea != null) {

                if (fecha_tarea.isBefore(fecha_inicio_real)) {
                    fecha_inicio_real = fecha_tarea;
                }
            }
            else if (fecha_inicio_real == null) {
                fecha_inicio_real = fecha_tarea;
            }
        }
        return fecha_inicio_real;
    }

    @Override
    public LocalDate getFechaFinalizacionReal() {
        
        LocalDate fecha_finalizacion_real = null;
        for (TareaTerminal tarea : this.tareas) {

            LocalDate fecha_tarea = tarea.getFechaFinalizacionReal();
            if (fecha_finalizacion_real != null && fecha_tarea != null) {

                if (fecha_tarea.isAfter(fecha_finalizacion_real)) {
                    fecha_finalizacion_real = fecha_tarea;
                }
            }
            else if (fecha_finalizacion_real == null) {
                fecha_finalizacion_real = fecha_tarea;
            }
        }
        return fecha_finalizacion_real;
    }

    /* @Override
    public String toString() {
        return super.toString() + ", " + this.tareas + "]";
    } */
}