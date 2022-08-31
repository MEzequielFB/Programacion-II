import java.util.ArrayList;

public class Empresa {

    public final double sueldoPlus = 100;

    private String nombre;
    private ArrayList<Encuesta> encuestas;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre) {

        this.nombre = nombre;
        this.encuestas = new ArrayList<Encuesta>();
        this.empleados = new ArrayList<Empleado>();
    }

    //Funcionalidades
    public double pagarSueldo(Empleado e) { //Calcula el sueldo de un empleado

        if (empleados.contains(e)) { //Si existe el empleado en la lista se calcula

            return e.getSueldo() + (sueldoPlus * e.getCantEncuestasRealizadas());
        }
        return -1;
    }

    public void addEncuesta(Encuesta e) { //Agrega la encuesta si es distinta de las ya existentes

        if (!encuestas.contains(e) && empleados.contains(e.getEmpleado())) { //Si el empleado que hace la encuesta no existe no se agrega la encuesta
            encuestas.add(e);
        }
    }

    public void addEmpleado(Empleado e) { //Agrega al empleado si no existe en la lista

        if (!empleados.contains(e)) {
            empleados.add(e);
        }
    }

    //Getters
    public String getnombre() {
        return nombre;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", empleados=" + empleados + ", encuestas=" + encuestas + "]";
    }
}