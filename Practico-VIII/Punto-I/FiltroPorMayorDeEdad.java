public class FiltroPorMayorDeEdad implements Filtro {

    @Override
    public boolean cumple(Socio socio) {
        return socio.esMayor();
    }
}