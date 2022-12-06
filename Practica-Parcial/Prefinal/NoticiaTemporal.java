import java.time.LocalDate;

public class NoticiaTemporal extends Noticia {

    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;

    public NoticiaTemporal(String titulo, String editor, String contenido, String categoria, LocalDate fecha_inicio, LocalDate fecha_fin) {
        super(titulo, editor, contenido, categoria);
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    //Funcionalidades
    public boolean tieneFechaVigente() {
        LocalDate fecha_actual = LocalDate.now();
        int valor_comparacion_valido = 0;
        return fecha_actual.compareTo(this.fecha_inicio) >= valor_comparacion_valido && fecha_actual.compareTo(this.fecha_fin) <= valor_comparacion_valido;
    }

    //Getters
    @Override
    public int getCantidadElementosPorCaracteristica(Filtro filtro) {
        if(this.tieneFechaVigente()) {
            super.getCantidadElementosPorCaracteristica(filtro);
        }
        return 0;
    }

    public LocalDate getFechaInicio() {
        return this.fecha_inicio;
    }

    public LocalDate getFechaFin() {
        return this.fecha_fin;
    }
}