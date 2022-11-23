public abstract class Recurso {
    
    private String nombre;

    public Recurso(String nombre) {
        this.nombre = nombre;
    }

    //Funcionalidades
    public abstract boolean sePuedeAsignar(TareaTerminal tarea);
    public abstract boolean addTarea(TareaTerminal tarea);

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Recurso otroRecurso = (Recurso) o;
            return this.getNombre().equalsIgnoreCase(otroRecurso.getNombre());
        }
        catch(Exception exc) {
            return false;
        }
    }
}