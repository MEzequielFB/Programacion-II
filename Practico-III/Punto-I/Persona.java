public class Persona {
    
    private String nombre;
    private String dni;

    public Persona(String nombre, String dni) {

        setNombre(nombre);
        this.dni = dni;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
    }
    
}