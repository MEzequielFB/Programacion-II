import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Gasto {
    
    private String descripcion;
    private LocalDate fecha;
    private String calidad;

    private int dias_pendiente;
    /* private double porcentaje_anual; */
    /* private double porcentaje_por_dia_pendiente; */

    public Gasto(String descripcion, LocalDate fecha, String calidad/* , double porcentaje_anual *//* , double porcentaje_por_dia_pendiente */) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.calidad = calidad;
        this.dias_pendiente = 0;
        /* this.porcentaje_anual = porcentaje_anual; */
        /* this.porcentaje_por_dia_pendiente = porcentaje_por_dia_pendiente; */
    }

    //Funcionalidades
    public boolean estaPendiente() {
        return this.getDiasPendiente() > 0;
    }

    //Metodos abstractos
    public abstract String getRubro();
    public abstract int getMonto();
    public abstract int getMontoTotalPorFiltro(Filtro filtro);
    public abstract ArrayList<Gasto> getListaGastosPorFiltro(Filtro filtro);
    public abstract double getPorcentajePorDiaPendiente();

    //Getters
    public String getDescripcion() {
        return this.descripcion;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public String getCalidad() {
        return this.calidad;
    }

    public int getDiasPendiente() {
        return this.dias_pendiente;
    }

    /* public double getPorcentajeAnual() {
        return porcentaje_anual;
    } */

    /* public double getPorcentajePorDiaPendiente() {
        return this.porcentaje_por_dia_pendiente;
    } */

    //Setters
    public void setDiasPendiente(int dias_pendiente) {
        if (dias_pendiente >= 0) {
            this.dias_pendiente = dias_pendiente;
        }
    }

    @Override
    public boolean equals(Object o) {

        try {
            Gasto otroGasto = (Gasto) o;
            return this.getDescripcion().equalsIgnoreCase(otroGasto.getDescripcion());
        }
        catch(Exception exc) {
            return false;
        }
    }
}