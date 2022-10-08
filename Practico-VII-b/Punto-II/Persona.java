public class Persona {
    
    private String nombre;
    private String ciudad;
    private String direccion;

    public Persona(String nombre, String ciudad ,String direccion) {

        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + "]";
    }
}