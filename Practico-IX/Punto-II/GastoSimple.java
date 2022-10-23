import java.time.LocalDate;
import java.util.ArrayList;

public class GastoSimple extends Gasto {
    
    private int monto;
    private String rubro;

    public GastoSimple(String descripcion, LocalDate fecha, String calidad, int monto, String rubro) {
        super(descripcion, fecha, calidad);
        this.monto = monto;
        this.rubro = rubro;
    }

    //Getters
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
            return this.monto;
        }
        return 0;
    }

    public String getRubro() {
        return this.rubro;
    }

    public int getMonto() {
        return this.monto;
    }

    @Override
    public String toString() {
        return "GastoSimple ["+this.getDescripcion()+"]";
    }
}