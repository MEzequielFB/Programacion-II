public class FiltroPorPalabraClave extends Filtro {

    private String palabra_clave_buscada;

    public FiltroPorPalabraClave(String palabra_clave_buscada) {
        this.palabra_clave_buscada = palabra_clave_buscada;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.contienePalabra(this.palabra_clave_buscada);
    }
}