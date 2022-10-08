import java.time.LocalDate;

public class ArchivoComprimido extends Directorio {

    private double tasa_compresion;
    
    public ArchivoComprimido(String nombre, LocalDate fecha_creacion, LocalDate fecha_ultima_modificacion, double tasa_compresion) {

        super(nombre, fecha_creacion, fecha_ultima_modificacion);
        this.tasa_compresion = tasa_compresion;
    }

    //Getters
    public double getTasaCompresion() {
        return this.tasa_compresion;
    }

    @Override
    public int getTamanio() {
        return (int) (super.getTamanio() * (1 - (this.tasa_compresion / 100)));
    }
}