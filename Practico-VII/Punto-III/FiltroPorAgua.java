public class FiltroPorAgua implements Filtro {

    private int minimo_requerimiento_agua;

    public FiltroPorAgua(int minimo_requerimiento_agua) {
        this.minimo_requerimiento_agua = minimo_requerimiento_agua;
    }

    @Override
    public boolean cumple(Planta planta) {
        return planta.getRequerimientoAgua() > this.minimo_requerimiento_agua /* && planta.getRequerimientoAgua() != this.minimo_requerimiento_agua */;
    }
}
