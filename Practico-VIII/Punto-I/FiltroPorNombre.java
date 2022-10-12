public class FiltroPorNombre implements Filtro {

    private String nombre_buscado;

    public FiltroPorNombre(String nombre_buscado) {
        this.nombre_buscado = nombre_buscado;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.getNombre().equalsIgnoreCase(this.nombre_buscado);
    }
}
