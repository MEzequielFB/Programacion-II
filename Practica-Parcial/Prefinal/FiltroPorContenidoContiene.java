public class FiltroPorContenidoContiene extends Filtro {

    private String frase_buscada;

    public FiltroPorContenidoContiene(String frase_buscada) {
        this.frase_buscada = frase_buscada;
    }

    @Override
    public boolean cumple(ElementoNoticia elemento) {
        return elemento.getContenido().contains(this.frase_buscada);
    }
}