import java.time.LocalDate;

public class ProductoCongelado extends ProductoOrganismoMantenimiento {
    
    public ProductoCongelado(String nombre, LocalDate fecha_vencimiento, LocalDate fecha_envasado, String granja_origen, double temperatura_mantenimiento) {
        
        super(nombre, fecha_vencimiento, fecha_envasado, granja_origen, temperatura_mantenimiento);
    }
}