import java.util.ArrayList;

public class SeguroIntegrador extends Seguro {

    private ArrayList<Seguro> seguros;

    public SeguroIntegrador(String nombre, String dni_duenio, String descripcion) {
        super(nombre, dni_duenio, descripcion);
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
            seguro.setDniDuenio(this.getDniDuenio());
        }
    }

    //Getters
    @Override
    public int getCostoPoliza() {
        
        int costo_total = 0;
        for (Seguro seguro : this.seguros) {
            costo_total += seguro.getCostoPoliza();
        }
        return costo_total;
    }

    @Override
    public int getNumero() {

        int numero_resultante = 0;
        for (Seguro seguro : this.seguros) {

            int numero_seguro = seguro.getNumero();
            if (numero_seguro > numero_resultante) {
                numero_resultante = numero_seguro;
            }
        }
        return numero_resultante;
    }

    @Override
    public int getMontoAsegurado() {
        
        int monto_total = 0;
        for (Seguro seguro : this.seguros) {
            monto_total += seguro.getMontoAsegurado();
        }
        return monto_total;
    }
}