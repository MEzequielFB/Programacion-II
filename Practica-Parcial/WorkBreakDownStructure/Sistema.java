import java.util.ArrayList;

public class Sistema {
    
    private ArrayList<TareaTerminal> tareas;

    public Sistema() {
        this.tareas = new ArrayList<>();
    }

    //Funcionalidades
    public void addTarea(TareaTerminal tarea) {
        if (!this.tareas.contains(tarea)) {
            this.tareas.add(tarea);
        }
    }

    //Getters
    public boolean sePuedeAsignarRecurso(TareaTerminal tarea, Recurso recurso) {
        return recurso.sePuedeAsignar(tarea);
    }

    public String getDuracionEstimadaTarea(TareaTerminal tarea) {
        return tarea.getDuracionEstimada();
    }

    public ArrayList<Recurso> getListaRecursosPorTarea(TareaTerminal tarea) {
        ArrayList<Recurso> recursos_involucrados = new ArrayList<>();
        for (TareaTerminal tarea_terminal : this.tareas) {
            for (Recurso recurso : tarea_terminal.getListaRecursosPorTarea(tarea)) {
                if (!recursos_involucrados.contains(recurso)) {
                    recursos_involucrados.add(recurso);
                }
            }
        }
        return recursos_involucrados;
    }

    public ArrayList<TareaTerminal> getListaTareasPorRecurso(Recurso recurso) {
        ArrayList<TareaTerminal> tareas = new ArrayList<>();
        for (TareaTerminal tarea : this.tareas) {
            tareas.addAll(tarea.getListaTareasPorRecurso(recurso));
        }
        return tareas;
    }

    public ArrayList<TareaSimple> getListaTareasAtrasadas(){
        ArrayList<TareaSimple> tareas_atrasadas = new ArrayList<>();
        for (TareaTerminal tarea : this.tareas) {
            tareas_atrasadas.addAll(tarea.getListaTareasAtrasadas());
        }
        return tareas_atrasadas;
    }
}