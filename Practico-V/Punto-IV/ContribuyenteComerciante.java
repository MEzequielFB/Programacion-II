public class ContribuyenteComerciante extends ContribuyentePorcentaje {

    public ContribuyenteComerciante(String nombre, double monto_fijo, double monto_facturado) {

        this(nombre, monto_fijo, monto_facturado, 50, 3.5);
    }

    public ContribuyenteComerciante(String nombre, double monto_fijo, double monto_facturado, double porcentaje_monto, double porcentaje_facturado) {

        super(nombre, monto_fijo, monto_facturado, porcentaje_monto, porcentaje_facturado);
    }
}
