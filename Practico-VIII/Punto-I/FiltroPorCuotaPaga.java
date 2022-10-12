public class FiltroPorCuotaPaga implements Filtro {

    @Override
    public boolean cumple(Socio socio) {
        return socio.getUltimaCuotaPaga();
    }    
}
