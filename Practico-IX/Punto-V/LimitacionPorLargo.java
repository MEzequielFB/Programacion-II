public class LimitacionPorLargo extends Limitacion {

    private int cantidad_palabras_maxima;

    public LimitacionPorLargo(int cantidad_palabras_maxima) {
        this.cantidad_palabras_maxima = cantidad_palabras_maxima;
    }

    @Override
    public boolean cumple(Mensaje notificacion) {
        return notificacion.getCantidadPalabras() < this.cantidad_palabras_maxima;
    }
}