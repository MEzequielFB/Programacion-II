public class LimitacionPorPalabra extends Limitacion {

    private String palabra_requerida;

    public LimitacionPorPalabra(String palabra_requerida) {
        this.palabra_requerida = palabra_requerida;
    }

    @Override
    public boolean cumple(Mensaje notificacion) {
        return notificacion.contienePalabra(this.palabra_requerida);
    }
}