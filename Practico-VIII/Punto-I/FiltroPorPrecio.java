public class FiltroPorPrecio implements Filtro {

    private double precio_minimo;

    public FiltroPorPrecio(double precio_minimo) {
        this.precio_minimo = precio_minimo;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.pagoMinimoPrecioPorAlquiler(precio_minimo);
    }
}