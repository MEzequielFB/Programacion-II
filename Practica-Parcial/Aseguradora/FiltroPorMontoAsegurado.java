public class FiltroPorMontoAsegurado extends Filtro {

    private double monto_minimo;

    public FiltroPorMontoAsegurado(double monto_minimo) {
        this.monto_minimo = monto_minimo;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return seguro.getMontoAsegurado() > this.monto_minimo;
    }
}