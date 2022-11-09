import java.util.ArrayList;

public class Alumno implements Comparable<Alumno> {
    
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private ArrayList<String> intereses;

    public Alumno(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.intereses = new ArrayList<>();
    }

    //Funcionalidades
    public void addInteres(String interes) {
        if (!this.intereses.contains(interes)) {
            this.intereses.add(interes);
        }
    }

    @Override
    public int compareTo(Alumno otroAlumno) {
        int resultado = this.getApellido().compareToIgnoreCase(otroAlumno.getApellido());
        if (resultado == 0) {
            resultado = this.getNombre().compareToIgnoreCase(otroAlumno.getNombre());
        }
        if (resultado == 0) {
            resultado = this.getDni().compareToIgnoreCase(otroAlumno.getDni());
        }
        return resultado;
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getDni() {
        return this.dni;
    }

    public int getEdad() {
        return this.edad;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Alumno otroAlumno = (Alumno) o;
            return this.getNombre().equalsIgnoreCase(otroAlumno.getNombre()) && this.getApellido().equalsIgnoreCase(otroAlumno.getApellido());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", apellido=" + apellido + "]";
    }
}