public class Producto {
    
    private double precio;
    private int cantidad_alquilados;
    private int stock;

    public Producto(double precio, int stock) {

        this.setPrecio(precio);
        this.setCantidadAlquilados(0);
        this.setStock(stock);
    }

    //Funcionalidades
    public boolean sePuedeAlquilar() {
        return this.getStock() > this.getCantidadAlquilados();
    }

    //Getters
    public double getPrecio() {
        return this.precio;
    }

    public int getCantidadAlquilados() {
        return this.cantidad_alquilados;
    }

    public int getStock() {
        return this.stock;
    }

    //Setters
    public void setPrecio(double precio) {

        if (precio > 0) {
            this.precio = precio;
        }
    }

    public void setCantidadAlquilados(int cantidad_alquilados) {

        if (cantidad_alquilados >= 0) {
            this.cantidad_alquilados = cantidad_alquilados;
        }
    }

    public void setStock(int stock) {

        if (stock >= 0) {
            this.stock = stock;
        }
    }
}