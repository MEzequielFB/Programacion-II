public class SeguroSimple extends Seguro {
    
    private int numero;
    private int monto;

    public SeguroSimple(String nombre, String dni_duenio, String descripcion, int numero, int monto) {
        super(dni_duenio, descripcion, nombre);
        this.numero = numero;
        this.monto = monto;
    }

    //Getters
    @Override
    public int getNumero(){
        return this.numero;
    }

    @Override
    public int getMonto() {
        return this.monto;
    }
}