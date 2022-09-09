import java.time.LocalDate;

public class ProductoCongeladoPorAire extends ProductoCongelado {
    
    private double porcentaje_nitrogeno;
    private double porcentaje_oxigeno;
    private double porcentaje_dioxido_de_carbono;
    private double porcentaje_vapor_de_agua;

    public ProductoCongeladoPorAire(String nombre, LocalDate fecha_vencimiento, LocalDate fecha_envasado, String granja_origen, double temperatura_mantenimiento, double porcentaje_nitrogeno, double porcentaje_oxigeno, double porcentaje_dioxido_de_carbono, double porcentaje_vapor_de_agua) {

        super(nombre, fecha_vencimiento, fecha_envasado, granja_origen, temperatura_mantenimiento);
        this.porcentaje_nitrogeno = porcentaje_nitrogeno;
        this.porcentaje_oxigeno = porcentaje_oxigeno;
        this.porcentaje_dioxido_de_carbono = porcentaje_dioxido_de_carbono;
        this.porcentaje_vapor_de_agua = porcentaje_vapor_de_agua;
    }

    //Getters
    public double getPorcentaje_nitrogeno() {
        return porcentaje_nitrogeno;
    }

    public double getPorcentaje_oxigeno() {
        return porcentaje_oxigeno;
    }

    public double getPorcentaje_dioxido_de_carbono() {
        return porcentaje_dioxido_de_carbono;
    }

    public double getPorcentaje_vapor_de_agua() {
        return porcentaje_vapor_de_agua;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[nombre=" + this.getNombre() + ", nro_lote=" + this.getNroLote() + ", fecha_envasado=" + this.getFechaEnvasado() + ", fecha_vencimiento=" + this.getFechaVencimiento() + ", granja_origen=" + this.getGranjaOrigen() + ", codigo_organismo=" + this.getCodigo_organismo() + ", temperatura_mantenimiento=" + this.getTemperatura_mantenimiento() + ", porcentaje_nitrogeno=" + this.porcentaje_nitrogeno + ", porcentaje_oxigeno=" + this.porcentaje_oxigeno + ", porcentaje_dioxido_de_carbono=" + this.porcentaje_dioxido_de_carbono + ", porcentaje_vapor_de_agua=" + this.porcentaje_vapor_de_agua + "]";
    }
}