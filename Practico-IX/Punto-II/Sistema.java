import java.util.ArrayList;

public class Sistema {
    
    private ArrayList<Gasto> gastos;

    public Sistema() {
        this.gastos = new ArrayList<>();
    }

    //Funcionalidades
    public ArrayList<Gasto> getListaGastosPorFiltro(Filtro filtro) {

        ArrayList<Gasto> gastos_filtrados = new ArrayList<>();
        for (Gasto gasto : this.gastos) {
            gastos_filtrados.addAll(gasto.getListaGastosPorFiltro(filtro));
        }
        return gastos_filtrados;
    }

    public int getMontoTotalPorFiltro(Filtro filtro) {

        int monto_total = 0;
        for (Gasto gasto : this.gastos) {
            monto_total += gasto.getMontoTotalPorFiltro(filtro);
        }
        return monto_total;
    }

    public void addGasto(Gasto gasto) {
        if (!this.gastos.contains(gasto)) {
            this.gastos.add(gasto);
        }
    }

    @Override
    public String toString() {
        return "Sistema [gastos=" + gastos + "]";
    }
}