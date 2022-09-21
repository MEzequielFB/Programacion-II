import java.util.ArrayList;

public class Empresa {
    
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre) {

        this.setNombre(nombre);
        this.empleados = new ArrayList<>();
    }

    //Funcionalidades
    public double pagarSueldo(Empleado empleado) {

        if (this.empleados.contains(empleado)) {
            return empleado.getSueldoMensual();
        }
        return -1;
    }

    public double getGastosEnSueldos() {

        double gastos = 0;
        for (Empleado empleado : this.empleados) {

            gastos += empleado.getSueldoMensual();
        }
        return gastos;
    }

    public void addEmpleado(Empleado empleado) {

        if (!this.empleados.contains(empleado)) {
            this.empleados.add(empleado);
        }
    }

    //Getters
    public String getnombre() {
        return this.nombre;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}