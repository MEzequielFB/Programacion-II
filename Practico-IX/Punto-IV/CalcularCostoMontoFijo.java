public class CalcularCostoMontoFijo extends CalcularCosto {

    private int monto_fijo;

    public CalcularCostoMontoFijo(int monto_fijo) {
        this.monto_fijo = monto_fijo;
    }

    @Override
    public int getCostoPoliza(int monto_asegurado) {
        return this.monto_fijo;
    }
}