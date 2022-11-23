import java.time.LocalDate;

public class RecursoExclusivo extends Recurso {

    private TareaTerminal tarea_asignada;
    private LocalDate fecha_inicio_disponible;
    private LocalDate fecha_fin_disponible;

    public RecursoExclusivo(String nombre, LocalDate fecha_inicio_disponible, LocalDate fecha_fin_disponible) {
        super(nombre);
        this.fecha_inicio_disponible = fecha_inicio_disponible;
        this.fecha_fin_disponible = fecha_fin_disponible;
    }

    //Funcionalidades
    public boolean sePuedeAsignar(TareaTerminal tarea) {
        return this.tarea_asignada == null && this.estaDisponible();
    }

    private boolean estaDisponible() {
        return LocalDate.now().isAfter(this.fecha_inicio_disponible) && LocalDate.now().isBefore(this.fecha_fin_disponible);
    }

    @Override
    public boolean addTarea(TareaTerminal tarea) {
        if (this.sePuedeAsignar(tarea)) {
            this.setTareaAsignada(tarea);
            return true;
        }
        return false;
    }

    //Getters
    public LocalDate getFechaInicioDisponible() {
        return this.fecha_inicio_disponible;
    }

    public LocalDate getFechaFinDisponible() {
        return this.fecha_fin_disponible;
    }

    //Setters
    public void setTareaAsignada(TareaTerminal tarea) {
        this.tarea_asignada = tarea;
    }
}