import java.util.ArrayList;

public class Empresa {
    
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre) {

        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    //Funcionalidades
    public void pagarSueldos() {

        for (Empleado empleado : this.empleados) {

            empleado.cobrarSueldo();
        }
    }

    public double pagarSueldo(Empleado e) {

        if (this.empleados.contains(e)) {

            return e.getSueldo();
        }
        return -1;
    }

    public void addEmpleado(Empleado e) {
        
        if (!this.empleados.contains(e)) {
            this.empleados.add(e);
        }
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}