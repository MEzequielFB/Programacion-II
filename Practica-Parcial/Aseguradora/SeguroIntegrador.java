import java.util.ArrayList;

public class SeguroIntegrador extends Seguro {

    private ArrayList<Seguro> seguros;

    public SeguroIntegrador(String dni_duenio) {
        super(dni_duenio);
        this.seguros = new ArrayList<>();
    }

    //Funcionalidades
    @Override
    public ArrayList<Seguro> buscarSeguros(Filtro filtro) {
        ArrayList<Seguro> seguros_filtrados = new ArrayList<>();
        for (Seguro seguro : this.seguros) {
            seguros_filtrados.addAll(seguro.buscarSeguros(filtro));
        }
        return seguros_filtrados;
    }

    public void addSeguro(Seguro seguro) {
        if (!this.seguros.contains(seguro)) {
            this.seguros.add(seguro);
        }
    }

    //Getters
    @Override
    public double getCostoPoliza() {
        double costo_poliza_total = 0;
        for (Seguro seguro : this.seguros) {
            costo_poliza_total += seguro.getCostoPoliza();
        }
        return costo_poliza_total;
    }

    @Override
    public int getNumeroPoliza() {
        int numero_poliza = -1; //Devuelve -1 si no contiene seguros
        for (Seguro seguro : this.seguros) {
            int numero_poliza_seguro = seguro.getNumeroPoliza();
            if (numero_poliza_seguro > numero_poliza) {
                numero_poliza = numero_poliza_seguro;
            }
        }
        return numero_poliza;
    }

    @Override
    public double getMontoAsegurado() {
        double monto_asegurado_total = 0;
        for (Seguro seguro : this.seguros) {
            monto_asegurado_total += seguro.getMontoAsegurado();
        }
        return monto_asegurado_total;
    }

    @Override
    public String getDescripcion() {
        if (!this.seguros.isEmpty()) {
            return this.seguros.get(0).getDescripcion();
        }
        return null;
    }
}