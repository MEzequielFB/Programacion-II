import java.util.ArrayList;

public abstract class Recurso {
    
    private String titulo;
    protected ArrayList<TareaTerminal> tareas_asignadas;
    
    public Recurso(String titulo) {
        this.titulo = titulo;
        this.tareas_asignadas = new ArrayList<>();
    }

    //Funcionalidades
    public abstract boolean sePuedeAsignarTarea(TareaTerminal tarea);

    //Agrega siempre si es compartido. Si no es compartido, solo agrega cuando la lista esta vacia
    //Devuelve un boolean para que la TareaTerminal controle si agregar el recurso a su lista
    public boolean addTareaAsignada(TareaTerminal tarea) { //Metodo template

        if (this.sePuedeAsignarTarea(tarea)) {
            this.tareas_asignadas.add(tarea);
            return true;
        }
        return false;
    }

    //Getters
    public ArrayList<TareaTerminal> getTareasAsignadas() {
        return new ArrayList<>(this.tareas_asignadas);
    }

    public String getTitulo() {
        return this.titulo;
    }

    /* public boolean esCompartido() {
        return this.es_compartido;
    } */

    @Override
    public boolean equals(Object o) {

        try {
            Recurso otroRecurso = (Recurso) o;
            return this.getTitulo().equalsIgnoreCase(otroRecurso.getTitulo());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Recurso [titulo=" + titulo + "]";
    }
}