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
}