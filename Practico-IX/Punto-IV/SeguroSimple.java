public class SeguroSimple extends Seguro {
    
    private int numero;
    private int monto_asegurado;

    private CalcularCosto calculador_costo;

    public SeguroSimple(String nombre, String dni_duenio, String descripcion, int numero, int monto_asegurado, CalcularCosto calculador_costo) {
        super(dni_duenio, descripcion, nombre);
        this.numero = numero;
        this.monto_asegurado = monto_asegurado;

        this.calculador_costo= calculador_costo;
    }

    //Getters
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