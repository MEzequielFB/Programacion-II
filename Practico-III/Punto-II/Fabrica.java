import java.util.ArrayList;

public class Fabrica {
    
    private String nombre;
    private ArrayList<Producto> productos;

    public Fabrica(String nombre) {
        
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    //Funcionalidades
    public int getCantTipoProductoEnStock(String tipo) {

        int total = 0;
        for (Producto producto : productos) {

            if (producto.getTipo().equals(tipo) && producto.getStock() > 0) {
                total += producto.getStock();
            }
        }
        return total;
    }

    public double getGananciaVentas() { //Obtiene las ganancias de los productos vendidos

        double total = 0;

        for (Producto producto : productos) {

            if (producto.getCantVentas() > 0) {

                total += producto.getGanancia() * producto.getCantVentas();
            }
        }
        return total;
    }

    public void venderProducto(Producto p, int cantidad) { //Vender producto por cantidad, si no hay stock no se vende. Si hay stock lo disminuye

        if (hayStock(p, cantidad)) { //Si hay stock reduce el stock, aumenta la cantidad de productos vendidos y se agrega al producto a la lista de productos vendidos

            p.removeStock(cantidad);
            p.addVentas(cantidad);
            //productosVendidos.add(p);
        }
    }

    private boolean hayStock(Producto p, int cantidad) {

        for (Producto producto : productos) {

            if (producto.equals(p) && producto.getStock() >= cantidad) {
                return true;
            }
        }
        return false;
    }

    public double getGananciaTotalEstimada() { //Calcula la ganancia total suponiendo que se venden todos los productos en stock

        double total = 0;
        for (Producto producto : productos) {

            total += producto.getGanancia() * producto.getStock();
        }
        return total;
    }

    public double getCostoTotal() { //Calcula el costo total en base al costo de todos los productos (tanto en stock, como los que fueron vendidos) para mantener un registro de todos los productos fabricados

        double total = 0;
        for (Producto producto : productos) {

            total += producto.getCostoFabricacion() * (producto.getStock() + producto.getCantVentas());
        }
        return total;
    }

    public void addProducto(Producto p, int cantidad) { //Agrega una cantidad determinada de un producto

        if (!productos.contains(p)) { //El método contains usa el método equals
            productos.add(p);
            p.addStock(cantidad);
        }
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Fabrica [nombre=" + nombre + ", productos=" + productos + ")]";
    }
}