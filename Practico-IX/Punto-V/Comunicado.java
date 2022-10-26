import java.util.ArrayList;

public abstract class Comunicado {
    
    private String nombre;

    public Comunicado(String nombre) {
        this.nombre = nombre;
    }

    //Metodos abstractos
    public abstract void addNotificacion(Mensaje notificacion);
    public abstract int getCantidadEmpleados();
    public abstract ArrayList<Empleado> getListadoEmpleados();
    public abstract ArrayList<Empleado> getListadoEmpleados(Limitacion filtro);
    public abstract int getCantidadMensajes();

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Comunicado otroComunicado = (Comunicado) o;
            return this.getNombre().equalsIgnoreCase(otroComunicado.getNombre());
        }
        catch(Exception exc) {
            return false;
        }
    }
}