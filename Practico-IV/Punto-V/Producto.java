import java.time.LocalDate;

public class Producto {
    
    private static int contLote;

    private String nombre;
    private LocalDate fecha_vencimiento;
    private int nro_lote;
    private LocalDate fecha_envasado;
    private String granja_origen;

    public Producto(String nombre, LocalDate fecha_vencimiento, LocalDate fecha_envasado, String granja_origen) {

        this.nombre = nombre;
        this.fecha_vencimiento = fecha_vencimiento;
        this.nro_lote = contLote;
        this.fecha_envasado = fecha_envasado;
        this.granja_origen = granja_origen;
        contLote++;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaVencimiento() {
        return fecha_vencimiento;
    }

    public int getNroLote() {
        return nro_lote;
    }

    public LocalDate getFechaEnvasado() {
        return fecha_envasado;
    }

    public String getGranjaOrigen() {
        return granja_origen;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[nombre=" + nombre + ", nro_lote=" + nro_lote + ", fecha_envasado=" + fecha_envasado + ", fecha_vencimiento=" + fecha_vencimiento + ", granja_origen=" + granja_origen + "]";
    }

    @Override
    public boolean equals(Object o) {

        Producto otroProducto = (Producto) o;
        return this.nombre.equalsIgnoreCase(otroProducto.getNombre()) /* && this.nro_lote == otroProducto.getNroLote() */;
    }
}