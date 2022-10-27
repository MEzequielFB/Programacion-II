public class CalcularCostoAnd extends CalcularCosto {

    private CalcularCosto calculador1;
    private CalcularCosto calculador2;

    public CalcularCostoAnd(CalcularCosto calculador1, CalcularCosto calculador2) {
        this.calculador1 = calculador1;
        this.calculador2 = calculador2;
    }

    @Override
    public int getCostoPoliza(int monto_asegurado) {
        return this.calculador1.getCostoPoliza(monto_asegurado) + this.calculador2.getCostoPoliza(monto_asegurado);
    }
}