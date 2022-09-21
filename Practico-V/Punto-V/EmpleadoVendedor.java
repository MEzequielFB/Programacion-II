public class EmpleadoVendedor extends Empleado {
    
    private int cant_ventas;
    private double monto_por_venta;
    private double porcentaje_extra;

    public EmpleadoVendedor(String nombre, String apellido, String dni, double sueldo_mensual, double monto_por_venta, double porcentaje_extra) {

        super(nombre, apellido, dni, sueldo_mensual);
        this.setCantVentas(0);
        this.setMontoPorVenta(monto_por_venta);
        this.setPorcentajeExtra(porcentaje_extra);
    }

    //Getters
    @Override
    public double getSueldoMensual() {
        return super.getSueldoMensual() + ((this.cant_ventas * this.monto_por_venta) * (this.porcentaje_extra / 100));
    }

    public int getCantVentas() {
        return this.cant_ventas;
    }

    public double getMontoPorVenta() {
        return this.monto_por_venta;
    }

    public double getPorcentajeExtra() {
        return this.porcentaje_extra;
    }

    //Setters
    public void setCantVentas(int cant_ventas) {

        if (cant_ventas >= 0) {
            this.cant_ventas = cant_ventas;
        }
    }

    public void setMontoPorVenta(double monto_por_venta) {

        if (monto_por_venta > 0) {
            this.monto_por_venta = monto_por_venta;
        }
    }

    public void setPorcentajeExtra(double porcentaje_extra) {

        if (porcentaje_extra > 0) {
            this.porcentaje_extra = porcentaje_extra;
        }
    }
}
