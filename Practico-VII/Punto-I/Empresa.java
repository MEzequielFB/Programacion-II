import java.util.ArrayList;

public class Empresa {
    
    private String nombre;
    private ArrayList<ProductoQuimico> productos_quimicos;

    public Empresa(String nombre) {

        this.nombre = nombre;
        this.productos_quimicos = new ArrayList<>();
    }

    //Funcionalidades
    public ArrayList<ProductoQuimico> filtrarProductos(Filtro filtro/* Enfermedad enfermedad */) {

        ArrayList<ProductoQuimico> productos_que_cumplen = new ArrayList<>();
        for (ProductoQuimico producto_quimico : this.productos_quimicos) {

            /* if (producto_quimico.trataEnfermedad(enfermedad)) {
                productos_que_cumplen.add(producto_quimico);
            } */
            if (filtro.cumple(producto_quimico)) {
                productos_que_cumplen.add(producto_quimico);
            }
        }
        return productos_que_cumplen;
    }

    public void addProductoQuimico(ProductoQuimico producto_quimico) {

        if (!this.productos_quimicos.contains(producto_quimico)) {
            this.productos_quimicos.add(producto_quimico);
        }
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", productos_quimicos=" + productos_quimicos + "]";
    }
}