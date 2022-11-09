public abstract class ElementoEstudiantil {
    
    private String nombre;

    public ElementoEstudiantil(String nombre) {
        this.nombre = nombre;
    }

    //Metodos abstractos
    public abstract int getCantidadAlumnos();

    //Getters
    public String getNombre() {
        return this.nombre;
    }
}