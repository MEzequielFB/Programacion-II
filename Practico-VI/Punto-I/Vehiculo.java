public class Vehiculo extends Producto {
 
    private String marca;
    private double kilometros;
    private String patente;
    private String tipo;

    public Vehiculo(double precio, String marca, double kilometros, String patente, String tipo) {

        super(precio, 1);
        this.setMarca(marca);
        this.setKilometros(kilometros);
        this.patente = patente;
        this.setTipo(tipo);
    }

    //Funcionalidades

    //Getters
    public String getMarca() {
        return this.marca;
    }

    public double getKilomentros() {
        return this.kilometros;
    }

    public String getPatente() {
        return this.patente;
    }

    public String getTipo() {
        return this.tipo;
    }

    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setKilometros(double kilometros) {

        if (kilometros > 0) {
            this.kilometros = kilometros;
        }
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Vehiculo otroVehiculo = (Vehiculo) o;
            return this.getPatente().equalsIgnoreCase(otroVehiculo.getPatente());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", patente=" + patente + ", tipo=" + tipo + "]";
    }
}