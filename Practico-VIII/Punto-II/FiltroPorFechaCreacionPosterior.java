import java.time.LocalDate;

public class FiltroPorFechaCreacionPosterior extends Filtro {

    private LocalDate fecha_creacion_minima;

    public FiltroPorFechaCreacionPosterior(LocalDate fecha_creacion_minima) {
        this.fecha_creacion_minima = fecha_creacion_minima;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getFechaCreacion().isAfter(this.fecha_creacion_minima);
    }
}