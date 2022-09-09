import java.time.LocalDate;

public class ProductoCongeladoPorNitrogeno extends ProductoCongelado {
 
    private String metodo_congelacion;
    private double tiempo_exposicion;

    public ProductoCongeladoPorNitrogeno(String nombre, LocalDate fecha_vencimiento, LocalDate fecha_envasado, String granja_origen, double temperatura_mantenimiento, String metodo_congelacion, double tiempo_exposicion) {

        super(nombre, fecha_vencimiento, fecha_envasado, granja_origen, temperatura_mantenimiento);
        this.metodo_congelacion = metodo_congelacion;
        this.tiempo_exposicion = tiempo_exposicion;
    }

    public String getMetodo_congelacion() {
        return metodo_congelacion;
    }

    public double getTiempo_exposicion() {
        return tiempo_exposicion;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[nombre=" + this.getNombre() + ", nro_lote=" + this.getNroLote() + ", fecha_envasado=" + this.getFechaEnvasado() + ", fecha_vencimiento=" + this.getFechaVencimiento() + ", granja_origen=" + this.getGranjaOrigen() + ", codigo_organismo=" + this.getCodigo_organismo() + ", temperatura_mantenimiento=" + this.getTemperatura_mantenimiento() + ", metodo_congelacion=" + this.metodo_congelacion + ", tiempo_exposicion=" + this.tiempo_exposicion + "]";
    }
}