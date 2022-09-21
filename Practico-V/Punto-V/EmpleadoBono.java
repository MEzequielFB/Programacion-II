public class EmpleadoBono extends Empleado {

    private int cant_ventas;
    private int cant_ventas_para_bono;
    private double monto_por_bono;

    public EmpleadoBono(String nombre, String apellido, String dni, double sueldo_mensual, int cant_ventas_para_bono, double monto_por_bono) {

        super(nombre, apellido, dni, sueldo_mensual);
        this.setCantVentas(0);
        this.setCantVentasParaBono(cant_ventas_para_bono);
        this.setMontoPorBono(monto_por_bono);
    }

    //Funcionalidades
    private boolean obtieneBono() {
        return this.cant_ventas >= this.cant_ventas_para_bono;
    }

    //Getters
    @Override
    public double getSueldoMensual() {
        return super.getSueldoMensual() + (this.obtieneBono() ? this.monto_por_bono : 0);
    }

    public int getCantVentas() {
        return cant_ventas;
    }

    public int getCantVentasParaBono() {
        return cant_ventas_para_bono;
    }

    public double getMontoPorBono() {
        return monto_por_bono;
    }

    //Setters
    public void setCantVentas(int cant_ventas) {

        if (cant_ventas >= 0) {
            this.cant_ventas = cant_ventas;
        }
    }

    public void setCantVentasParaBono(int cant_ventas_para_bono) {

        if (cant_ventas_para_bono > 0) {
            this.cant_ventas_para_bono = cant_ventas_para_bono;
        }
    }

    public void setMontoPorBono(double monto_por_bono) {

        if (monto_por_bono > 0) {
            this.monto_por_bono = monto_por_bono;
        }
    }
}