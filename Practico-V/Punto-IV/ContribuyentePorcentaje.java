public class ContribuyentePorcentaje extends Contribuyente {
    
    private static double porcentaje_monto;
    private static double porcentaje_facturado;

    private double monto_facturado;

    public ContribuyentePorcentaje(String nombre, double monto_fijo, double monto_facturado,double porcentaje_monto, double porcentaje_facturado) {

        super(nombre, monto_fijo);

        this.setMontoFacturado(monto_facturado);

        setPorcentajeMonto(porcentaje_monto);
        setPorcentajeFacturado(porcentaje_facturado);
    }

    //Getters
    @Override
    public double getMontoFijo() {
        return super.getMontoFijo() * (getPorcentajeMonto() / 100) + this.getMontoFacturado() * (getPorcentajeFacturado() / 100);
    }

    public double getMontoFacturado() {
        return this.monto_facturado;
    }

    public static double getPorcentajeMonto() {
        return porcentaje_monto;
    }

    public static double getPorcentajeFacturado() {
        return porcentaje_facturado;
    }

    //Setters
    public void setMontoFacturado(double monto_facturado) {
        
        if (monto_facturado > 0) {
            this.monto_facturado = monto_facturado;
        }
    }

    public static void setPorcentajeMonto(double porcentaje) {

        if (porcentaje > 0) {
            porcentaje_monto = porcentaje;
        }
    }

    public static void setPorcentajeFacturado(double porcentaje) {

        if (porcentaje > 0) {
            porcentaje_facturado = porcentaje;
        }
    }
}
