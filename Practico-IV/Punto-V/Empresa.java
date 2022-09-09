import java.util.ArrayList;

public class Empresa {
    
    private String nombre;
    private ArrayList<Producto> productos;

    public Empresa(String nombre) {

        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    //Funcionalidades
    public Producto getProducto(Producto p) {

        if (this.productos.contains(p)) {

            return p;
        }
        return null;
    }

    public void addProducto(Producto p) {

        if (!this.productos.contains(p)) {
            this.productos.add(p);
        }
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
}