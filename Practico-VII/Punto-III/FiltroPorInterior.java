public class FiltroPorInterior implements Filtro {

    @Override
    public boolean cumple(Planta planta) {
        return planta.esDeInterior();
    }
}