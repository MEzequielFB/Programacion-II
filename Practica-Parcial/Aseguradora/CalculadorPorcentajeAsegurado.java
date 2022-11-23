public class CalculadorPorcentajeAsegurado extends CalculadorCostoPoliza {

    private double porcentaje;

    public CalculadorPorcentajeAsegurado(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularCostoPoliza(Seguro seguro) {
        return seguro.getMontoAsegurado() * (this.porcentaje / 100);
    }
}