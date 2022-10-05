public class FiltroPorSolSuperior implements Filtro {

    private int requerimiento_sol;

    public FiltroPorSolSuperior(int requerimiento_sol) {
        this.requerimiento_sol = requerimiento_sol;
    }

    @Override
    public boolean cumple(Planta planta) {
        return planta.getRequerimientoSol() > this.requerimiento_sol;
    }
}
