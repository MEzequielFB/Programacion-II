public class FiltroPorPalabraClave extends Filtro {

    private String palabra_clave;

    public FiltroPorPalabraClave(String palabra_clave) {
        this.palabra_clave = palabra_clave;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.contienePalabraClave(this.palabra_clave);
    }
}