import java.time.LocalDate;
import java.util.ArrayList;

public abstract class TareaTerminal {
    
    private String titulo;
    private ArrayList<Recurso> recursos;

    public TareaTerminal(String titulo) {
        this.titulo = titulo;
        this.recursos = new ArrayList<>();
    }

    //Metodos abstractos
    public abstract LocalDate getFechaInicioEstimada();
    public abstract LocalDate getFechaFinalizacionEstimada();
    public abstract LocalDate getFechaInicioReal();
    public abstract LocalDate getFechaFinalizacionReal();
    public abstract String getEstado();

    //Funcionalidades
    //Si el recurso agrego la tarea a su lista, el recurso se agrega a la lista de recursos de la tarea
    public void addRecurso(Recurso recurso) {
        if (!this.recursos.contains(recurso) && recurso.addTareaAsignada(this)) {
            this.recursos.add(recurso);
        }
    }

    //Getters
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public boolean equals(Object o) {

        try {
            TareaTerminal otraTarea = (TareaTerminal) o;
            return this.getTitulo().equalsIgnoreCase(otraTarea.getTitulo());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[" + this.titulo + ", " + this.recursos;
    }
}