public class FiltroPorClasificacion implements Filtro {

    private String clasificacion;

    public FiltroPorClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public boolean cumple(Planta planta) {
        return planta.getClasificacion().equalsIgnoreCase(this.clasificacion);
    }
}
