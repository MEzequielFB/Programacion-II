import java.time.LocalDate;
import java.util.ArrayList;

public abstract class TareaTerminal {
    
    private String titulo;

    public TareaTerminal(String titulo) {
        this.titulo = titulo;
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
        return this.getClass().getName() + "[" + this.titulo;
    }
}