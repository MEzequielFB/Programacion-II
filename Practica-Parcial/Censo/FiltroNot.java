public class FiltroNot extends Filtro {
    
    private Filtro filtro;

    public FiltroNot(Filtro filtro) {
        this.filtro = filtro;
    }

    @Override
    public boolean cumple(Comarca comarca) {
        return !this.filtro.cumple(comarca);
    }
}