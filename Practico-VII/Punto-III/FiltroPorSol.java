public class FiltroPorSol implements Filtro {

    private int minimo_requerimiento_sol;

    public FiltroPorSol(int minimo_requerimiento_sol) {
        this.minimo_requerimiento_sol = minimo_requerimiento_sol;
    }

    @Override
    public boolean cumple(Planta planta) {
        return planta.getRequerimientoSol() > this.minimo_requerimiento_sol/*  && planta.getRequerimientoSol() != this.minimo_requerimiento_sol */;
    }
}
