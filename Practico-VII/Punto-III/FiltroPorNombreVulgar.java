public class FiltroPorNombreVulgar implements Filtro {

    private String nombre_vulgar;

    public FiltroPorNombreVulgar(String nombre_vulgar) {
        this.nombre_vulgar = nombre_vulgar;
    }

    @Override
    public boolean cumple(Planta planta) {
        return planta.contieneNombreVulgar(nombre_vulgar);
    }
}
