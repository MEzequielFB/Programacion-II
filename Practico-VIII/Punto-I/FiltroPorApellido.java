public class FiltroPorApellido implements Filtro {

    private String apellido_buscado;

    public FiltroPorApellido(String apellido_buscado) {
        this.apellido_buscado = apellido_buscado;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.getApellido().equalsIgnoreCase(this.apellido_buscado);
    }
}
