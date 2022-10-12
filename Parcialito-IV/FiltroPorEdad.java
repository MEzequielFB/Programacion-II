public class FiltroPorEdad extends Filtro {

    private int edad_minima;

    public FiltroPorEdad(int edad_minima) {
        this.edad_minima = edad_minima;
    }

    @Override
    public boolean cumple(Cliente cliente) {
        return cliente.getEdad() > this.edad_minima;
    }
}
