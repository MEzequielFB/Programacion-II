import java.time.LocalDate;
import java.util.ArrayList;

public class SeguroTemporal extends Seguro {

    private Seguro seguro;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;

    public SeguroTemporal(String nombre, String descripcion, Seguro seguro, LocalDate fecha_inicio, LocalDate fecha_fin) {
        super(nombre, seguro.getDniDuenio(), descripcion);
        this.seguro = seguro;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    //Funcionalidades
    @Override
    public ArrayList<Seguro> buscarSeguros(Filtro filtro) {
        ArrayList<Seguro> seguros_filtrados = new ArrayList<>();
        if (esFechaValida()) {
            seguros_filtrados.addAll(this.seguro.buscarSeguros(filtro));
        }
        return seguros_filtrados;
    }

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