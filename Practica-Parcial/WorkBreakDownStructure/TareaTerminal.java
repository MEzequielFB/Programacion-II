import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public abstract class TareaTerminal {
    
    private String titulo;
    protected ArrayList<Recurso> recursos;

    public TareaTerminal(String titulo) {
        this.titulo = titulo;
        this.recursos = new ArrayList<>();
    }

    //Metodos abstractos
    public abstract ArrayList<TareaSimple> getListaTareasAtrasadas();
    public abstract ArrayList<TareaTerminal> getListaTareasPorRecurso(Recurso recurso);
    public abstract ArrayList<Recurso> getListaRecursosPorTarea(TareaTerminal tarea);
    public abstract LocalDate getFechaInicioEstimada();
    public abstract LocalDate getFechaFinEstimada();
    public abstract LocalDate getFechaInicio();
    public abstract LocalDate getFechaFin();
    public abstract String getEstado();

    //Funcionalidades
    public boolean contieneRecurso(Recurso recurso) {
        return this.recursos.contains(recurso);
    }

    public boolean estaAtrasada() {
        return this.getFechaFinEstimada().isBefore(LocalDate.now()) && this.getEstado().equals("en espera");
    }

    public void addRecurso(Recurso recurso) {
        if (!this.recursos.contains(recurso) && recurso.addTarea(this)) {
            this.recursos.add(recurso);
        }
    }

    //Getters
    public String getDuracionEstimada() {
        return Math.abs(Period.between(this.getFechaInicioEstimada(), this.getFechaFinEstimada()).getDays()) + " dias";
    }

    public String getTitulo() {
        return this.titulo;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
}