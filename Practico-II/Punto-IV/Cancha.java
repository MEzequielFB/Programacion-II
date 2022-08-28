public class Cancha {
    
    private String tipoCancha;
    private double precio;

    public Cancha(String tipoCancha, double precio) {

        this.tipoCancha = tipoCancha;
        this.precio = precio;
    }

    //Getters
    public String getTipoCancha() {
        return tipoCancha;
    }

    public double getPrecio() {
        return precio;
    }

    //Setters
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}