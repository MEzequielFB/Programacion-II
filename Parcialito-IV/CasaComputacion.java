import java.util.ArrayList;

public class CasaComputacion {

    private ArrayList<Producto> productos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Proveedor> proveedores;
    private ArrayList<Empleado> empleados;

    public CasaComputacion() {
        this.productos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.proveedores = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    //Funcionalidades
    public ArrayList<Cliente> buscarClientes(Filtro filtro) {

        ArrayList<Cliente> clientes_filtrados = new ArrayList<>();
        for (Cliente cliente : this.clientes) {

            if (filtro.cumple(cliente)) {
                clientes_filtrados.add(cliente);
            }
        }
        return clientes_filtrados;
    }

    public void addProducto(Producto producto) {
        this.productos.addProducto(producto);
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void addProveedor(Proveedor proveedor) {
        this.proveedores.add(proveedor);
    }

    public void addEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }
}