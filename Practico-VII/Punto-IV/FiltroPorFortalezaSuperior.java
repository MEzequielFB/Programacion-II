public class FiltroPorFortalezaSuperior implements Filtro {

    private int fortaleza;

    public FiltroPorFortalezaSuperior(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    @Override
    public boolean cumple(Ficha ficha) {
        return ficha.getFortaleza() > this.fortaleza;
    }
}