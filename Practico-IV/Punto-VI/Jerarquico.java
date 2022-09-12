import java.util.ArrayList;

public class Jerarquico extends Empleado {
    
    private ArrayList<Empleado> empleados_a_cargo;

    public Jerarquico(String nombre, String apellido, int edad, double sueldo) {

        super(nombre, apellido, edad, sueldo);
        this.empleados_a_cargo = new ArrayList<>();
    }

    //Funcionalidades
    public void addEmpleado(Empleado e, Empresa empresa) {

        if (!this.empleados_a_cargo.contains(e) && empresa.trabajaEnLaEmpesa(e) && empresa.trabajaEnLaEmpesa(this)) {
            this.empleados_a_cargo.add(e);
        }
    }
}