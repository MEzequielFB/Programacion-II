import java.util.ArrayList;

public class Hogwarts {
    
    private ArrayList<Casa> casas;
    private ArrayList<Alumno> alumnos;

    public Hogwarts() {

        this.casas = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }

    //Funcionalidades
    public boolean contieneAlumno(Alumno a) {
        return this.alumnos.contains(a);
    }

    public void addAlumno(Alumno a) { //Si la lista no contiene al alumno lo agrega

        if (!this.alumnos.contains(a)) {

            this.alumnos.add(a);
        }
    }

    public void addCasa(Casa c) {

        if (!this.casas.contains(c)) {
            this.casas.add(c);
        }
    }

    //Getters
    public ArrayList<Casa> getCasas() {
        return new ArrayList<>(this.casas);
    }
}