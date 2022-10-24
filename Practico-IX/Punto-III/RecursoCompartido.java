public class RecursoCompartido extends Recurso {

    public RecursoCompartido(String titulo) {
        super(titulo);
    }

    @Override
    public boolean sePuedeAsignarTarea(TareaSimple tarea) {
        return !this.tareas_asignadas.contains(tarea);
    }
}