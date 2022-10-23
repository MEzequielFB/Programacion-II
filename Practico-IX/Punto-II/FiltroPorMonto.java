public class FiltroPorMonto extends Filtro {

    private int monto_minimo;

    public FiltroPorMonto(int monto_minimo) {
        this.monto_minimo = monto_minimo;
    }

    @Override
    public boolean cumple(Gasto gasto) {
        return gasto.getMonto() > this.monto_minimo;
    }
}