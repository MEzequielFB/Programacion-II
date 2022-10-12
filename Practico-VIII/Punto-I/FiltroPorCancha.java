public class FiltroPorCancha implements Filtro {

    private Cancha cancha_buscada;

    public FiltroPorCancha(Cancha cancha_buscada) {
        this.cancha_buscada = cancha_buscada;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.alquiloCancha(cancha_buscada);
    }
}