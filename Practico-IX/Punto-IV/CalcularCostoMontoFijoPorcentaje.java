public class CalcularCostoMontoFijoPorcentaje extends CalcularCosto {

    private int monto_fijo;
    private double porcentaje;

    public CalcularCostoMontoFijoPorcentaje(int monto_fijo, double porcentaje) {
        this.monto_fijo = monto_fijo;
        this.porcentaje = porcentaje;
    }

    @Override
    public int getCostoPoliza(int monto_asegurado) {
        return (int) ((monto_asegurado * (this.porcentaje / 100)) + this.monto_fijo) ;
    }
}