public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad/* , String cargo */) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\n"
                + "Apellido: " + this.apellido + "\n"
                + "Edad: " + this.edad + "\n"
                + "Cargo: " + this.getClass().getName() + "\n";
    }

    @Override
    public boolean equals(Object o) {

        Persona otraPersona = (Persona) o;
        return this.nombre.equals(otraPersona.getNombre()) && this.apellido.equals(otraPersona.getApellido()) && this.edad == otraPersona.getEdad();
    }
}