public class Usuario {
    //Socios tienen descuento del 10%
    //Para ser socio tiene que haber hecho 4 turnos dentro de 2 meses
    //Historial de turnos?

    private String nombre;
    private boolean esSocio;

    public Usuario(String nombre) {

        this.nombre = nombre;
        this.esSocio = false;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public boolean isEsSocio() {
        return esSocio;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEsSocio(boolean esSocio) {
        this.esSocio = esSocio;
    }
}