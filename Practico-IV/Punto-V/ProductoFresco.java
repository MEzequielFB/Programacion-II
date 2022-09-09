import java.time.LocalDate;

public class ProductoFresco extends Producto {

    public ProductoFresco(String nombre, LocalDate fecha_vencimiento, LocalDate fecha_envasado, String granja_origen) {

        super(nombre, fecha_vencimiento, fecha_envasado, granja_origen);
    }
}