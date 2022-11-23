import java.time.LocalDate;
import java.util.ArrayList;

public class SeguroTemporal extends Seguro {

    private Seguro seguro_contenido;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;

    public SeguroTemporal(String dni_duenio, LocalDate fecha_inicio, LocalDate fecha_fin, Seguro seguro_contenido) {
        super(dni_duenio);
        this.seguro_contenido = seguro_contenido;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    //Funcionalidades
    @Override
    public ArrayList<Seguro> buscarSeguros(Filtro filtro) {
        ArrayList<Seguro> seguros_filtrados = new ArrayList<>();
        if (this.enFechaVigente()) {
            seguros_filtrados.addAll(this.seguro_contenido.buscarSeguros(filtro));
        }
        return seguros_filtrados;
    }

    public boolean enFechaVigente() {
        LocalDate fecha_actual = LocalDate.now();
        return fecha_actual.isAfter(this.fecha_inicio) && fecha_actual.isBefore(this.fecha_fin);
    }

    //Getters
    @Override
    public double getCostoPoliza() {
        if (this.enFechaVigente()) {
            return this.seguro_contenido.getCostoPoliza();
        }
        return 0;
    }

    public Seguro getSeguroContenido() {
        return this.seguro_contenido;
    }

    public LocalDate getFechaInicio(){
        return this.fecha_inicio;
    }

    public LocalDate getFechaFin() {
        return this.fecha_fin;
    }

    @Override
    public int getNumeroPoliza() {
        return this.seguro_contenido.getNumeroPoliza();
    }

    @Override
    public double getMontoAsegurado() {
        
        if (this.enFechaVigente()) {
            return this.seguro_contenido.getMontoAsegurado();
        }
        return -1; //Devuelve -1 si la fecha actual no está entre la fecha inicio y fin
    }

    @Override
    public String getDescripcion() {
        return this.seguro_contenido.getDescripcion();
    }
}