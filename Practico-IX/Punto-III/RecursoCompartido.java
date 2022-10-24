public class RecursoCompartido extends Recurso {

    public RecursoCompartido(String titulo) {
        super(titulo);
    }

    @Override
    public boolean sePuedeAsignarTarea(TareaTerminal tarea) {
        return !this.tareas_asignadas.contains(tarea);
    }
}