import java.time.LocalDate;

public class FiltroPorFechaModificacionPosterior extends Filtro {

    private LocalDate fecha_modificacion_minima;

    public FiltroPorFechaModificacionPosterior(LocalDate fecha_modificacion_minima) {
        this.fecha_modificacion_minima = fecha_modificacion_minima;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getFechaModificacion().isAfter(this.fecha_modificacion_minima);
    }
}