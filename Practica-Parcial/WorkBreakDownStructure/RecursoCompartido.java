import java.util.ArrayList;

public class RecursoCompartido extends Recurso {

    private ArrayList<TareaTerminal> tareas_asignadas;

    public RecursoCompartido(String nombre) {
        super(nombre);
        this.tareas_asignadas = new ArrayList<>();
    }

    //Funcionalidades
    @Override
    public boolean sePuedeAsignar(TareaTerminal tarea) {
        return !this.tareas_asignadas.contains(tarea);
    }

    @Override
    public boolean addTarea(TareaTerminal tarea) {
        if (this.sePuedeAsignar(tarea)) {
            this.tareas_asignadas.add(tarea);
            return true;
        }
        return false;
    }
}