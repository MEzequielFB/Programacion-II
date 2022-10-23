import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Gasto {
    
    private String descripcion;
    private LocalDate fecha;
    private String calidad;

    public Gasto(String descripcion, LocalDate fecha, String calidad) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.calidad = calidad;
    }

    //Metodos abstractos
    public abstract String getRubro();
    public abstract int getMonto();
    public abstract int getMontoTotalPorFiltro(Filtro filtro);
    public abstract ArrayList<Gasto> getListaGastosPorFiltro(Filtro filtro);

    /* public abstract int getMontoTotalPorFecha(LocalDate fecha);

    public abstract int getMontoTotalPorRubro(String rubro); */

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