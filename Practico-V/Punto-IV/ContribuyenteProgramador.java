public class ContribuyenteProgramador extends ContribuyentePorcentaje {
    
    public ContribuyenteProgramador(String nombre, double monto_fijo, double monto_facturado) {

        this(nombre, monto_fijo, monto_facturado, 20, 2);
    }

    public ContribuyenteProgramador(String nombre, double monto_fijo, double monto_facturado, double porcentaje_monto, double porcentaje_facturado) {

        super(nombre, monto_fijo, monto_facturado, porcentaje_monto, porcentaje_facturado);
    }
}