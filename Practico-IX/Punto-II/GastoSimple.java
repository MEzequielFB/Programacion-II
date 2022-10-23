import java.time.LocalDate;
import java.util.ArrayList;

public class GastoSimple extends Gasto {
    
    private int monto;
    private String rubro;
    private double porcentaje_por_dia_pendiente;

    public GastoSimple(String descripcion, LocalDate fecha, String calidad, int monto, String rubro, double porcentaje_por_dia_pendiente) {
        super(descripcion, fecha, calidad);
        this.monto = monto;
        this.rubro = rubro;
        this.porcentaje_por_dia_pendiente = porcentaje_por_dia_pendiente;
    }

    //Getters
    @Override
    public double getPorcentajePorDiaPendiente() {
        return this.porcentaje_por_dia_pendiente;
    }

    @Override
    public ArrayList<Gasto> getListaGastosPorFiltro(Filtro filtro) {
        
        ArrayList<Gasto> gastos_filtrados = new ArrayList<>();
        if (filtro.cumple(this)) {
            gastos_filtrados.add(this);
        }
        return gastos_filtrados;
    }

    @Override
    public int getMontoTotalPorFiltro(Filtro filtro) {
        if (filtro.cumple(this)) {
            return this.getMonto();
        }
        return 0;
    }

    public String getRubro() {
        return this.rubro;
    }

    public int getMonto() { //Si tiene dias pendiente se suma el porcentaje por dia pendiente
        int dias_pendientes = this.getDiasPendiente();
        if (dias_pendientes > 0) {

            double porcentaje = this.porcentaje_por_dia_pendiente / 100.0;
            int porcentaje_resultado = (int) (this.monto * porcentaje) * (dias_pendientes + 1);
            int resultado = this.monto + porcentaje_resultado;
            return resultado;
            /* return  (int) (this.monto + ((this.monto * (this.porcentaje_por_dia_pendiente / 100)) * (dias_pendientes + 1) ) ); */
        }
        return this.monto;
    }

    @Override
    public String toString() {
        return "GastoSimple ["+this.getDescripcion()+"]";
    }
}