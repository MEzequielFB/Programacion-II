import java.util.ArrayList;

public class Alumno {

    private static int contId;

    private String nombre;
    private int id;
    private ArrayList<String> cualidades;
    private ArrayList<Alumno> familiares;

    public Alumno(String nombre) {

        this.nombre = nombre;
        this.id = contId;
        this.cualidades = new ArrayList<>();
        this.familiares = new ArrayList<>();

        id++;
    }
    //Funcionalidades
    protected boolean tieneCualidadesNecesarias(Casa c) {

        int cont = 0;
        for (String cualidad : this.cualidades) {

            if (c.contieneCualidad(cualidad)) {
                cont++;
            }
        }
        return c.getCantCualidades() == cont;
    }

    public boolean contieneCualidad(String c) {
        return this.cualidades.contains(c);
    }

    public boolean tieneFamiliarEnCasa(Casa c) {

        for (Alumno familiar : this.familiares) {

            if (c.contieneAlumno(familiar)) {
                return true;
            }
        }
        return false;
    }

    public boolean tieneCasaAsignada(Hogwarts h) {

        ArrayList<Casa> copiaCasas = h.getCasas();
        for (Casa casa : copiaCasas) {

            if (casa.contieneAlumno(this)) {
                return true;
            }
        }
        return false;
    }

    public void addFamiliar(Alumno a) { //Se agrega el familiar en la lista de ambos alumnos si se cumplen las condiciones

        if (!this.familiares.contains(a) && !a.equals(this)) {

            this.familiares.add(a);
            a.addFamiliar(this);
        }
    }

    public void addCualidad(String c) {

        if (!this.cualidades.contains(c)) {
            this.cualidades.add(c);
        }
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Alumno otroAlumno = (Alumno) o;
            return this.getNombre().equalsIgnoreCase(otroAlumno.getNombre()) && this.getId() == otroAlumno.getId();
        }
        catch(Exception error) {
            return false;
        }
    }
    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", cualidades=" + cualidades +  "]";
    }
}