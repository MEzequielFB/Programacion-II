public class FiltroPorNombre extends Filtro {
    
    private String nombre_buscado;

    public FiltroPorNombre(String nombre_buscado) {
        this.nombre_buscado = nombre_buscado;
    }

    @Override
    public boolean cumple(Comarca comarca) {
        return comarca.getNombre().equalsIgnoreCase(this.nombre_buscado);
    }
}