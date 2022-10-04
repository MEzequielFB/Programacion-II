public class FiltroTienePalabrasClave implements Filtro {

    @Override
    public boolean cumple(Documento documento) {
        return documento.tienePalabrasClave();
    }
}
