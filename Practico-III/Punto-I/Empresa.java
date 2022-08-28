import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private ArrayList<Encuesta> encuestas;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre) {

        this.nombre = nombre;
        this.encuestas = new ArrayList<Encuesta>();
        this.empleados = new ArrayList<Empleado>();
    }

    //Funcionalidades
    public void addEncuesta(Encuesta e) { //Agrega la encuesta si es distinta de las ya existentes

        if (!existeEncuestaEnLista(e)) {
            encuestas.add(e);
        }
    }

    public void addEmpleado(Empleado e) {

        if (!existeEmpleadoEnLista(e)) {
            empleados.add(e);
        }
    }

    private boolean existeEncuestaEnLista(Encuesta e) {

        for (int i = 0; i < encuestas.size(); i++) {

            if (e.equals(encuestas.get(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean existeEmpleadoEnLista(Empleado e) {

        for (int i = 0; i < empleados.size(); i++) {

            if (e.equals(empleados.get(i))) {
                return true;
            }
        }
        return false;
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