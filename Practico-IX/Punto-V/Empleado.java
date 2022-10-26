import java.util.ArrayList;

public class Empleado extends Comunicado {
    
    private String apellido;
    private int numero_legajo;
    private int edad;
    private ArrayList<Mensaje> notificaciones;

    public Empleado(String nombre, String apellido, int numero_legajo, int edad) {
        super(nombre);
        this.apellido = apellido;
        this.numero_legajo = numero_legajo;
        this.edad = edad;
        this.notificaciones = new ArrayList<>();
    }

    //Funcionalidades
    @Override
    public void addNotificacion(Mensaje notificacion) {
        if (!this.notificaciones.contains(notificacion) && !notificacion.getEmpleadoEmisor().equals(this)) {
            this.notificaciones.add(notificacion);
        }
    }

    //Getters
    public ArrayList<Empleado> getListadoEmpleados(Limitacion filtro) {
        ArrayList<Empleado> empleados_filtrados = new ArrayList<>();
        for (Mensaje notificacion : this.notificaciones) {
            if (filtro.cumple(notificacion) && !empleados_filtrados.contains(this)) {
                empleados_filtrados.add(this);
            }
        }
        return empleados_filtrados;
    }

    public int getCantidadMensajes() {
        return this.notificaciones.size();
    }

    public ArrayList<Empleado> getListadoEmpleados() {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(this);
        return empleados;
    }

    @Override
    public int getCantidadEmpleados() {
        return 1;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getNumeroLegajo() {
        return this.numero_legajo;
    }

    public int getEdad() {
        return this.edad;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Empleado otroEmpleado = (Empleado) o;
            return this.getNombre().equalsIgnoreCase(otroEmpleado.getNombre()) && this.getNumeroLegajo() == otroEmpleado.getNumeroLegajo();
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + this.getNombre() + ", notificaciones=" + notificaciones + "]";
    }
}