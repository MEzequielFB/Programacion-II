public class Cliente {
    
    private String nombre;
    private String dni;

    public Cliente(String nombre, String dni) {

        this.setNombre(nombre);
        this.dni = dni;
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public String getDni() {
        return this.dni;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Cliente otroCliente = (Cliente) o;
            return this.getDni().equals(otroCliente.getDni());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cliente [dni=" + dni + ", nombre=" + nombre + "]";
    }
}