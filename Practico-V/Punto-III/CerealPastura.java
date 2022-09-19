public class CerealPastura extends Cereal {
    
    public static final double MINIMO_HECTAREAS = 50;

    public CerealPastura(String nombre) {
        super(nombre);
    }

    //Funcionalidades
    @Override
    public boolean sePuedeSembrar(Lote lote) {
        return super.sePuedeSembrar(lote) && lote.getHectareas() >= MINIMO_HECTAREAS;
    }
}