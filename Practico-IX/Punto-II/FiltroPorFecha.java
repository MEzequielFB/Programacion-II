import java.time.LocalDate;

public class FiltroPorFecha extends Filtro {

    private LocalDate fecha_buscada;

    public FiltroPorFecha(LocalDate fecha_buscada) {
        this.fecha_buscada = fecha_buscada;
    }

    @Override
    public boolean cumple(Gasto gasto) {
        return gasto.getFecha().isEqual(this.fecha_buscada);
    }
}