public class CalcularCostoPorcentaje extends CalcularCosto {

    private double porcentaje;

    public CalcularCostoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public int getCostoPoliza(int monto_asegurado) {
        return (int) (monto_asegurado * (this.porcentaje / 100));
    }
}