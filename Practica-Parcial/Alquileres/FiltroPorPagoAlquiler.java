public class FiltroPorPagoAlquiler extends Filtro {

    private double pago_minimo;

    public FiltroPorPagoAlquiler(double pago_minimo) {
        this.pago_minimo = pago_minimo;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.getMayorPagoPorAlquiler() > this.pago_minimo;
    }
}