public class FiltroPorEdad extends Filtro {

    private int edad_maxima;

    public FiltroPorEdad(int edad_maxima) {
        this.edad_maxima = edad_maxima;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.getEdad() <= this.edad_maxima;
    }
}