import java.util.ArrayList;

public class Grupo extends Comunicado {

    private Limitacion limitacion;
    private ArrayList<Comunicado> comunicados;

    public Grupo(String nombre, Limitacion limitacion) {
        super(nombre);
        this.limitacion = limitacion;
        this.comunicados = new ArrayList<>();
    }

    //Funcionalidades
    @Override
    public void addNotificacion(Mensaje notificacion) {
        
        if (this.limitacion.cumple(notificacion)) {
            for (Comunicado comunicado : this.comunicados) {
                comunicado.addNotificacion(notificacion);
            }
        }
    }

    public void addComunicado(Comunicado comunicado) {
        if (!this.comunicados.contains(comunicado)) {
            this.comunicados.add(comunicado);
        }
    }

    //Getters
    public int getCantidadMensajes() {
        
        int cantidad_total = 0;
        for (Comunicado comunicado : this.comunicados) {
            cantidad_total += comunicado.getCantidadMensajes();
        }
        return cantidad_total;
    }

    @Override
    public ArrayList<Empleado> getListadoEmpleados(Limitacion filtro) {
        ArrayList<Empleado> empleados_filtrados = new ArrayList<>();
        for (Comunicado comunicado : this.comunicados) {
            for (Empleado empleado : comunicado.getListadoEmpleados(filtro)) {
                if (!empleados_filtrados.contains(empleado)) {
                    empleados_filtrados.add(empleado);
                }
            }
        }
        return empleados_filtrados;
    }

    public ArrayList<Empleado> getListadoEmpleados() {
        ArrayList<Empleado> empleados = new ArrayList<>();
        for (Comunicado comunicado : this.comunicados) {
            for (Empleado empleado : comunicado.getListadoEmpleados()) {
                if (!empleados.contains(empleado)) {
                    empleados.add(empleado);
                }
            }
        }
        return empleados;
    }

    @Override
    public int getCantidadEmpleados() {

        int cantidad_total = 0;
        for (Comunicado comunicado : this.comunicados) {
            cantidad_total += comunicado.getCantidadEmpleados();
        }
        return cantidad_total;
    }

    public Limitacion getLimitacion() {
        return this.limitacion;
    }

    //Setters
    public void setLimitacion(Limitacion limitacion) {
        this.limitacion = limitacion;
    }

    @Override
    public String toString() {
        return "Grupo [comunicados=" + comunicados + "]";
    }
}