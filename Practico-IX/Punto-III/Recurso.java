import java.util.ArrayList;

public class Recurso {
    
    private String titulo;
    private boolean es_compartido;
    private ArrayList<TareaSimple> tareas_asignadas;
    
    public Recurso(String titulo, boolean es_compartido) {
        this.titulo = titulo;
        this.es_compartido = es_compartido;
        this.tareas_asignadas = new ArrayList<>();
    }

    //Funcionalidades
    //Agrega siempre si es compartido. Si no es compartido, solo agrega cuando la lista esta vacia
    //Devuelve un boolean para que la TareaSimple controle si agregar el recurso a su lista
    public boolean addTareaAsignada(TareaSimple tarea) {

        if (!this.tareas_asignadas.contains(tarea) && (this.es_compartido || (!this.es_compartido && this.tareas_asignadas.isEmpty()))) {
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

    public boolean esCompartido() {
        return this.es_compartido;
    }

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
}