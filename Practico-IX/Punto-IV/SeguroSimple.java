import java.util.ArrayList;

public class SeguroSimple extends Seguro {
    
    private int numero;
    private int monto_asegurado;

    private CalcularCosto calculador_costo;

    public SeguroSimple(String nombre, String dni_duenio, String descripcion, int numero, int monto_asegurado, CalcularCosto calculador_costo) {
        super(nombre, dni_duenio, descripcion);
        this.numero = numero;
        this.monto_asegurado = monto_asegurado;

        this.calculador_costo= calculador_costo;
    }

    //Funcionalidades
    @Override
    public ArrayList<Seguro> buscarSeguros(Filtro filtro) {
        ArrayList<Seguro> seguros_filtrados = new ArrayList<>();
        if (filtro.cumple(this)) {
            seguros_filtrados.add(this);
        }
        return seguros_filtrados;
    }

    //Getters
    @Override
    public int getCostoPoliza() {
        return this.calculador_costo.getCostoPoliza(getMontoAsegurado());
    }

    @Override
    public int getNumero(){
        return this.numero;
    }

    @Override
    public int getMontoAsegurado() {
        return this.monto_asegurado;
    }
    
    public CalcularCosto getCalculadorCosto() {
        return this.calculador_costo;
    }

    //Setters
    public void setCalculadorCosto(CalcularCosto calculador_costo) {
        this.calculador_costo = calculador_costo;
    }
}