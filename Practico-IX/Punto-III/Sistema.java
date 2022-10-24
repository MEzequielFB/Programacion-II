import java.util.ArrayList;

public class Sistema {
    
    private ArrayList<TareaTerminal> tareas;
    
    public Sistema() {
        this.tareas = new ArrayList<>();
    }

    //Funcionalidades
    public boolean sePuedeAgregarRecurso(Recurso recurso, TareaSimple tarea) {
        return tarea.sePuedeAgregarRecurso(recurso);
    }

    public int getDuracionEstimadaPorTarea(TareaTerminal tarea) {
        return tarea.getDuracionEstimada();
    }

    public ArrayList<Recurso> getRecursosPorTarea(TareaTerminal tarea) {
        return tarea.getRecursos();
    }

    public ArrayList<TareaTerminal> getTareasPorRecurso(Recurso recurso) {
        return recurso.getTareasAsignadas();
    }

    public ArrayList<TareaTerminal> getTareasAtrasadas() {
        
        ArrayList<TareaTerminal> tareas_atrasadas = new ArrayList<>();
        for (TareaTerminal tarea : this.tareas) {

            tareas_atrasadas.addAll(tarea.getTareasAtrasadas());

            /* if (tarea.getEstado().equalsIgnoreCase("en espera") && tarea.getFechaFinalizacionEstimada().isBefore(LocalDate.now())) {
                tareas_atrasadas.add(tarea);
            } */
        }
        return tareas_atrasadas;
    }

    public void addTarea(TareaTerminal tarea) {
        if (!this.tareas.contains(tarea)) {
            this.tareas.add(tarea);
        }
    }
}