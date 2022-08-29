public class Peluquero {
 
    private String nombre;

    public Peluquero(String nombre) {

        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Peluquero [nombre=" + nombre + "]";
    }
}