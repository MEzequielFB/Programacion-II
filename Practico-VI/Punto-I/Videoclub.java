import java.time.LocalDateTime;
import java.util.ArrayList;

public class Videoclub {
    
    private String nombre;
    private ArrayList<Producto> productos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Alquiler> alquileres;

    public Videoclub(String nombre) {

        this.setNombre(nombre);
        this.productos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.alquileres = new ArrayList<>();
    }

    //Funcionalidades
    public ArrayList<Cliente> getClientesAlquilerVencido() {

        ArrayList<Cliente> clientes = new ArrayList<>();
        for (Alquiler alquiler : this.alquileres) {

            if (alquiler.getFechaLimite().isBefore(LocalDateTime.now()) && !clientes.contains(alquiler.getCliente())) {

                clientes.add(alquiler.getCliente());
            }
        }
        return clientes;
    }

    public int getCantidadAlquileres() {
        return this.alquileres.size();
    }

    public Alquiler alquilar(Cliente cliente, Producto producto, LocalDateTime fecha_limite) {

        if (producto.sePuedeAlquilar() /* && fecha_limite.isAfter(LocalDateTime.now()) */) {

            producto.setCantidadAlquilados(producto.getCantidadAlquilados() + 1);

            Alquiler alquiler = new Alquiler(cliente, producto, fecha_limite);
            this.addAlquiler(alquiler);
            return alquiler;
        }
        return null;
    }

    public void addAlquiler(Alquiler alquiler) {

        if (!this.alquileres.contains(alquiler) && !alquiler.equals(null)/*  != null */) {
            this.alquileres.add(alquiler);
        }
    }

    public void addCliente(Cliente cliente) {

        if (!this.clientes.contains(cliente)) {
            this.clientes.add(cliente);
        }
    }

    public void addProducto(Producto producto) {

        if (!this.productos.contains(producto)) {
            this.productos.add(producto);
        }
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}