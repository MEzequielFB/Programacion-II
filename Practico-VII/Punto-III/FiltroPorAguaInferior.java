public class FiltroPorAguaInferior implements Filtro {

    private int requerimiento_agua;

    public FiltroPorAguaInferior(int requerimiento_agua) {
        this.requerimiento_agua = requerimiento_agua;
    }

    @Override
    public boolean cumple(Planta planta) {
        return planta.getRequerimientoAgua() < this.requerimiento_agua;
    }
}