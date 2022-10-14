public class FiltroPorNombreContiene extends Filtro {

    private String nombre_buscado;

    public FiltroPorNombreContiene(String nombre_buscado) {
        this.nombre_buscado = nombre_buscado;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getNombre().contains(this.nombre_buscado);
    }
}