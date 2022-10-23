import java.time.LocalDate;
import java.util.ArrayList;

public class GastoDetallado extends Gasto {
    
    private ArrayList<Gasto> detalles;

    public GastoDetallado(String descripcion, LocalDate fecha, String calidad) {
        super(descripcion, fecha, calidad);
        this.detalles = new ArrayList<>();
    }

    //Funcionalidades
    public void addDetalle(Gasto gasto) { //Agrega si no contiene el gasto. Si esta vacio lo agrega de una. Si no esta vacio, verifica que el gasto a agregar tenga el mismo rubro

        if (!this.detalles.contains(gasto)) {

            if (this.detalles.isEmpty()) {
                this.detalles.add(gasto);
                
            } else if(this.getRubro().equalsIgnoreCase(gasto.getRubro())) {
                this.detalles.add(gasto);
            }
        }
    }
    //Getters
    @Override
    public double getPorcentajePorDiaPendiente() {
        
        double porcentaje_total = 0;
        for (Gasto gasto : this.detalles) {
            porcentaje_total += gasto.getPorcentajePorDiaPendiente();
        }
        return porcentaje_total;
    }

    @Override
    public ArrayList<Gasto> getListaGastosPorFiltro(Filtro filtro) {
        
        ArrayList<Gasto> gastos_filtrados = new ArrayList<>();
        for (Gasto gasto : this.detalles) {
            gastos_filtrados.addAll(gasto.getListaGastosPorFiltro(filtro));
        }
        if (filtro.cumple(this)) {
            gastos_filtrados.add(this);
        }
        return gastos_filtrados;
    }

    @Override
    public int getMonto() {
        int monto_total = 0;
        for (Gasto gasto : this.detalles) {
            monto_total += gasto.getMonto();
        }
        int dias_pendientes = this.getDiasPendiente();
        if (dias_pendientes > 0) {
            return (int) (monto_total + ( (monto_total * (this.getDiasPendiente() / 100) ) * (dias_pendientes + 1) ));
        }
        return monto_total;
    }

    @Override
    public String getRubro() { //Su rubro es el rubro de su primer gasto en la lista
        if (!this.detalles.isEmpty()) {
            return this.detalles.get(0).getRubro();
        }
        return "";
    }

    @Override
    public int getMontoTotalPorFiltro(Filtro filtro) {
        int monto_total = 0;
        for (Gasto gasto : this.detalles) {
            monto_total += gasto.getMontoTotalPorFiltro(filtro);
        }
        return monto_total;
    }

    @Override
    public String toString() {
        return "GastoDetallado [detalles=" + detalles + "]";
    }
}