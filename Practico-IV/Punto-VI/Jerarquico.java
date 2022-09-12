import java.util.ArrayList;

public class Jerarquico extends Empleado {
    
    private ArrayList<Empleado> empleados_a_cargo;

    public Jerarquico(String nombre, String apellido, int edad, double sueldo) {

        super(nombre, apellido, edad, sueldo);
        this.empleados_a_cargo = new ArrayList<>();
    }
}