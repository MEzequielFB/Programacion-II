import java.time.LocalDate;

public class Alquiler {
    
    private Socio socio;
    private Cancha cancha;
    private LocalDate fecha;
    private double precio;

    public Alquiler(Socio socio, Cancha cancha, LocalDate fecha, double precio) {

        this.socio = socio;
        this.cancha = cancha;
        this.fecha = fecha;
        this.precio = precio;
    }

    //Getters
    public Socio getSocio() {
        return this.socio;
    }

    public Cancha getCancha() {
        return this.cancha;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public double getPrecio() {
        return this.precio;
    }

    @Override
    public boolean equals(Object o) {

        try {

            Alquiler otroAlquiler = (Alquiler) o;
            return this.getSocio().equals(otroAlquiler.getSocio()) && this.getCancha().equals(otroAlquiler.getCancha()) && this.getFecha().isEqual(otroAlquiler.getFecha());
        }
        catch(Exception exc) {
            return false;
        }
    }
}