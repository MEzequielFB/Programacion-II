import java.util.ArrayList;

public class Encuesta {
    
    private ArrayList<String> preguntas;
    private ArrayList<Persona> personas;
    private Empleado empleado;

    public Encuesta(Empleado empleado) {

        this.preguntas = new ArrayList<String>();
        this.personas = new ArrayList<Persona>();
        setEmpleado(empleado);
    }

    //Funcionalidades
    public void addPregunta(String p) { //Agrega una pregunta si no existe

        if (!preguntas.contains(p)) {

            preguntas.add(p);
        }
    }

    public void addPersona(Persona p) { //Agrega una persona si no hizo esta encuesta e incrementa la cantidad de encuestas realizadas del empleado que la hizo

        if (!personas.contains(p)) {

            personas.add(p);
            this.empleado.IncrementCantEncuestasRealizadas();
        }
    }

    //Getters
    public Empleado getEmpleado() {
        return empleado;
    }

    public ArrayList<String> getPreguntas() {
        return preguntas;
    }

    //Setters
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Encuesta [personas=" + personas + ", preguntas=" + preguntas + "]";
    }
}