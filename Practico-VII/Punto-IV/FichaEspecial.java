public class FichaEspecial extends Ficha {

    public FichaEspecial(String nombre, int fortaleza, int tamanio) {
        super(nombre, fortaleza, tamanio);
    }

    @Override
    public int getPoderDestruccion() {
        return this.getFortaleza() / this.getTamanio();
    }
}