import java.time.LocalDate;

public class SeccionCaducidad extends Seccion {

    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;

    public SeccionCaducidad(String titulo, String editor, int posicion_categoria, CalculadorPalabraClave calculador_palabra_clave, LocalDate fecha_inicio, LocalDate fecha_fin) {
        super(titulo, editor, posicion_categoria, calculador_palabra_clave);
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    //Funcionalidades
    @Override
    public void addElemento(ElementoNoticia elemento) {
        if (this.tieneFechaVigente()) {
            super.addElemento(elemento);
        }
    }

    public boolean tieneFechaVigente() {
        LocalDate fecha_actual = LocalDate.now();
        int valor_comparacion_valido = 0;
        return fecha_actual.compareTo(this.fecha_inicio) >= valor_comparacion_valido && fecha_actual.compareTo(this.fecha_fin) <= valor_comparacion_valido;
    }

    //Getters
    public LocalDate getFechaInicio() {
        return this.fecha_inicio;
    }

    public LocalDate getFechaFin() {
        return this.fecha_fin;
    }
}