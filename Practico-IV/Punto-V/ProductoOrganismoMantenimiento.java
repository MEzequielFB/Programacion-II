import java.time.LocalDate;

public class ProductoOrganismoMantenimiento extends Producto {
    
    private static int contCodigo;

    private int codigo_organismo;
    private double temperatura_mantenimiento;

    public ProductoOrganismoMantenimiento(String nombre, LocalDate fecha_vencimiento, LocalDate fecha_envasado, String granja_origen, double temperatura_mantenimiento) {

        super(nombre, fecha_vencimiento, fecha_envasado, granja_origen);
        this.codigo_organismo = contCodigo;
        this.temperatura_mantenimiento = temperatura_mantenimiento;
        contCodigo++;
    }

    //Getters
    public int getCodigo_organismo() {
        return codigo_organismo;
    }

    public double getTemperatura_mantenimiento() {
        return temperatura_mantenimiento;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[nombre=" + this.getNombre() + ", nro_lote=" + this.getNroLote() + ", fecha_envasado=" + this.getFechaEnvasado() + ", fecha_vencimiento=" + this.getFechaVencimiento() + ", granja_origen=" + this.getGranjaOrigen() + ", codigo_organismo=" + this.codigo_organismo + ", temperatura_mantenimiento=" + this.temperatura_mantenimiento + "]";
    }
}
