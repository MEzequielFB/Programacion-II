public class Votante {
    
    private String nombre;
    private String dni;
    private Mesa mesa_asignada;

    public Votante(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.mesa_asignada = null;
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public Mesa getMesaAsignada() {
        return this.mesa_asignada;
    }

    //Setters
    public void setMesaAsignada(Mesa mesa_asignada) {
        this.mesa_asignada = mesa_asignada;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Votante otroVotante = (Votante) o;
            return this.getDni().equalsIgnoreCase(otroVotante.getDni());
        }
        catch(Exception exc) {
            return false;
        }
    }
}