import java.time.LocalDate;

public class ProductoCongeladoPorAgua extends ProductoCongelado {
    
    private double salinidad;

    public ProductoCongeladoPorAgua(String nombre, LocalDate fecha_vencimiento, LocalDate fecha_envasado, String granja_origen, double temperatura_mantenimiento, double salinidad) {

        super(nombre, fecha_vencimiento, fecha_envasado, granja_origen, temperatura_mantenimiento);
        this.salinidad = salinidad;
    }

    public double getSalinidad() {
        return salinidad;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[nombre=" + this.getNombre() + ", nro_lote=" + this.getNroLote() + ", fecha_envasado=" + this.getFechaEnvasado() + ", fecha_vencimiento=" + this.getFechaVencimiento() + ", granja_origen=" + this.getGranjaOrigen() + ", codigo_organismo=" + this.getCodigo_organismo() + ", temperatura_mantenimiento=" + this.getTemperatura_mantenimiento() + ", salinidad=" + this.salinidad + "]";
    }
}
