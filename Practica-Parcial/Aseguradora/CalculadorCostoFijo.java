public class CalculadorCostoFijo extends CalculadorCostoPoliza {

    private double monto;

    public CalculadorCostoFijo(double monto) {
        this.monto = monto;
    }

    @Override
    public double calcularCostoPoliza(Seguro seguro) {
        return this.monto;
    }
}