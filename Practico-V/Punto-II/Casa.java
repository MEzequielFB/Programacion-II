import java.util.ArrayList;

public class Casa {
    
    private String nombre;
    private int maximo_alumnos;
    protected ArrayList<String> cualidades;
    protected ArrayList<Alumno> alumnos;

    public Casa(String nombre, int maximo_alumnos) {

        this.nombre = nombre;
        this.maximo_alumnos = maximo_alumnos;
        this.cualidades = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }
    //Funcionalidades
    public boolean contieneCualidad(String c) {
        return this.cualidades.contains(c);
    }

    public boolean contieneAlumno(Alumno a) {
        return this.alumnos.contains(a);
    }

    /* protected boolean tieneCualidadesNecesarias(Alumno a) {

        int cont = 0;
        for (String cualidad : this.cualidades) {

            if (a.contieneCualidad(cualidad)) {
                cont++;
            }
        }
        return this.cualidades.size() == cont;
    } */

    public void addAlumno(Alumno a, Hogwarts h) {//Agrega si no existe en la lista de alumnos de la casa, el tamanio de la lista es menor o igual al máximo, si el alumno tiene las cualidades necesarias, si no tiene otra casa asignada y si es estudiante de Hogwarts

        if (!this.alumnos.contains(a) && this.alumnos.size() <= this.maximo_alumnos && a.tieneCualidadesNecesarias(this) && !a.tieneCasaAsignada(h) && h.contieneAlumno(a)) {

            this.alumnos.add(a);
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

    public int getMaximoAlumnos() {
        return this.maximo_alumnos;
    }

    public int getCantCualidades() {
        return this.cualidades.size();
    }

    @Override
    public boolean equals(Object o) {

        try {
            Casa otraCasa = (Casa) o;
            return this.getNombre().equalsIgnoreCase(otraCasa.getNombre());
        }
        catch(Exception exc) {
            return false;
        }
    }
    @Override
    public String toString() {
        return this.getClass().getName() + " [nombre=" + nombre + ", cualidades=" + cualidades + ", maximo_alumnos=" + maximo_alumnos + ", alumnos=" + alumnos + "]";
    }
}