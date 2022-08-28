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
    public void addPregunta(String p) {

        if (!existePreguntaEnLista(p)) {

            preguntas.add(p);
        }
    }

    private boolean existePreguntaEnLista(String p) {

        for (int i = 0; i < preguntas.size(); i++) {

            if (p.equals(preguntas.get(i))) {
                return true;
            }
        }
        return false;
    }

    public void addPersona(Persona p) {

        if (!existePersonaEnLista(p)) {

            personas.add(p);
            this.empleado.IncrementCantEncuestasRealizadas();
        }
    }

    private boolean existePersonaEnLista(Persona p) {

        for (int i = 0; i < personas.size(); i++) {

            if (p.equals(personas.get(i))) {
                return true;
            }
        }
        return false;
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