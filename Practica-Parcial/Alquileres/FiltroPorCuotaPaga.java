public class FiltroPorCuotaPaga extends Filtro {

    @Override
    public boolean cumple(Socio socio) {
        return socio.tieneUltimaCuotaPaga();
    }
}