public class FiltroPorNombreCientifico implements Filtro {

    private String nombre_cientifico;

    public FiltroPorNombreCientifico(String nombre_cientifico) {
        this.nombre_cientifico = nombre_cientifico;
    }

    @Override
    public boolean cumple(Planta planta) {
        return planta.getNombreCientifico().contains(this.nombre_cientifico);
    }
}
