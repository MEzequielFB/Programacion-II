import java.time.LocalDate;
import java.util.ArrayList;

public abstract class TareaTerminal {
    
    private String titulo;
    protected ArrayList<Recurso> recursos;

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
    public abstract ArrayList<TareaTerminal> getTareasAtrasadas();
    public abstract ArrayList<Recurso> getRecursos();
    public abstract int getDuracionEstimada();

    //Funcionalidades
    public boolean sePuedeAgregarRecurso(Recurso recurso) {
        return !this.recursos.contains(recurso) && recurso.sePuedeAsignarTarea(this);
    }

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
        return this.getClass().getName() + "[titulo=" + titulo + "]";
    }
}