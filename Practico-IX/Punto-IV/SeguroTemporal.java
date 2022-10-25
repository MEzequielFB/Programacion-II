import java.time.LocalDate;

public class SeguroTemporal extends Seguro {

    private Seguro seguro;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;

    public SeguroTemporal(String nombre, String dni_duenio, String descripcion, Seguro seguro, LocalDate fecha_inicio, LocalDate fecha_fin) {
        super(nombre, dni_duenio, descripcion);
        this.seguro = seguro;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    //Funcionalidades
    public boolean esFechaValida(){
        LocalDate fecha_actual = LocalDate.now();
        return fecha_actual.isAfter(this.fecha_inicio) && fecha_actual.isBefore(this.fecha_fin);
    }

    //Getters
    @Override
    public int getCostoPoliza() {
        if (this.esFechaValida()) {
            return this.seguro.getCostoPoliza();
        }
        return 0;
    }

    public Seguro getSeguro() {
        return this.seguro;
    }

    public LocalDate getFechaInicio() {
        return this.fecha_inicio;
    }

    public LocalDate getFechaFin() {
        return this.fecha_fin;
    }

    @Override
    public int getMontoAsegurado() {
        if (this.esFechaValida()) {
            return this.seguro.getMontoAsegurado();
        }
        return -1;
    }

    @Override
    public int getNumero() {
        return this.seguro.getNumero();
    }
}