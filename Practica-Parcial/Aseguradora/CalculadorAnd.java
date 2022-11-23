public class CalculadorAnd extends CalculadorCostoPoliza {
    
    private CalculadorCostoPoliza calculador1;
    private CalculadorCostoPoliza calculador2;

    public CalculadorAnd(CalculadorCostoPoliza calculador1, CalculadorCostoPoliza calculador2) {
        this.calculador1 = calculador1;
        this.calculador2 = calculador2;
    }

    @Override
    public double calcularCostoPoliza(Seguro seguro) {
        return calculador1.calcularCostoPoliza(seguro) + calculador2.calcularCostoPoliza(seguro);
    }
}