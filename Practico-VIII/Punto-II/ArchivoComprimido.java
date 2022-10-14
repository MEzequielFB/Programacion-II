import java.time.LocalDate;
import java.util.ArrayList;

public class ArchivoComprimido extends Directorio {

    private double tasa_compresion;

    public ArchivoComprimido(String nombre, LocalDate fecha_creacion, LocalDate fecha_modificacion, double tasa_compresion) {
        super(nombre, fecha_creacion, fecha_modificacion);
        this.tasa_compresion = tasa_compresion;
    }

    //Getters
    @Override
    public ArrayList<Elemento> getElementosFiltrados(Filtro filtro) {

        ArrayList<Elemento> elementos_filtrados = new ArrayList<>();
        if (!super.getElementosFiltrados(filtro).isEmpty()) {
            elementos_filtrados.add(this);
        }
        return elementos_filtrados;
    }

    @Override
    public int getTamanio() {
        return (int) (super.getTamanio() * (1 - (tasa_compresion / 100)));
    }
}