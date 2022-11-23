import java.util.ArrayList;

public class SeguroSimple extends Seguro {
    
    private int numero_poliza;
    private double monto_asegurado;
    private String descripcion;

    private CalculadorCostoPoliza calculador_costo_poliza;

    public SeguroSimple(int numero_poliza, String dni_duenio, double monto_asegurado, String descripcion, CalculadorCostoPoliza calculador_costo_poliza) {
        super(dni_duenio);
        this.numero_poliza = numero_poliza;
        this.monto_asegurado = monto_asegurado;
        this.descripcion = descripcion;
        this.calculador_costo_poliza = calculador_costo_poliza;
    }

    //Funcionalidades
    @Override
    public ArrayList<Seguro> buscarSeguros(Filtro filtro) {
        ArrayList<Seguro> seguros_filtrados = new ArrayList<>();
        if (filtro.cumple(this)) {
            seguros_filtrados.add(this);
        }
        return seguros_filtrados;
    }

    //Getters
    @Override
    public double getCostoPoliza() {
        return this.calculador_costo_poliza.calcularCostoPoliza(this);
    }

    @Override
    public int getNumeroPoliza() {
        return this.numero_poliza;
    }

    @Override
    public double getMontoAsegurado() {
        return this.monto_asegurado;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    public CalculadorCostoPoliza getCalculadorCostoPoliza() {
        return this.calculador_costo_poliza;
    }

    //Setters
    public void setCalculadorCostoPoliza(CalculadorCostoPoliza calculador_costo_poliza) {
        this.calculador_costo_poliza = calculador_costo_poliza;
    }
}