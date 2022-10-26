public class LimitacionPorEmpleado extends Limitacion {

    private Empleado empleado_emisor;

    public LimitacionPorEmpleado(Empleado empleado_emisor) {
        this.empleado_emisor = empleado_emisor;
    }

    @Override
    public boolean cumple(Mensaje notificacion) {
        return notificacion.getEmpleadoEmisor().equals(this.empleado_emisor);
    }
}