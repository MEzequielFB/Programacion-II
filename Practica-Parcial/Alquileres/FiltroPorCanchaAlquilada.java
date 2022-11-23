public class FiltroPorCanchaAlquilada extends Filtro {

    private Cancha cancha_buscada;

    public FiltroPorCanchaAlquilada(Cancha cancha_buscada) {
        this.cancha_buscada = cancha_buscada;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.alquiloCancha(this.cancha_buscada);
    }
}