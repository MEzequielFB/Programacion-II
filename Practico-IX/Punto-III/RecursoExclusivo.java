import java.time.LocalDate;

public class RecursoExclusivo extends Recurso {

    private LocalDate fecha_limite_uso;

    public RecursoExclusivo(String titulo, LocalDate fecha_limite_uso) {
        super(titulo);
        this.fecha_limite_uso = fecha_limite_uso;
    }

    //Funcionalidades
    //Si la fecha limit de uso del recurso esta despues de la fecha de inicio y finalizacion estimadas, se agrega. SI tambien cumple que tenga la lista vacia
    @Override
    public boolean sePuedeAsignarTarea(TareaSimple tarea) {
        return this.tareas_asignadas.isEmpty() && (this.fecha_limite_uso.isAfter(tarea.getFechaInicioEstimada()) && this.fecha_limite_uso.isAfter(tarea.getFechaFinalizacionEstimada()));
    }

    //Getters
    public LocalDate getFechaLimiteUso() {
        return this.fecha_limite_uso;
    }
}