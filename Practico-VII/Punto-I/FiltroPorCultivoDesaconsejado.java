public class FiltroPorCultivoDesaconsejado implements Filtro {

    private Cultivo cultivo;

    public FiltroPorCultivoDesaconsejado(Cultivo cultivo) {
        this.cultivo = cultivo;
    }

    @Override
    public boolean cumple(ProductoQuimico producto_quimico) {
        return producto_quimico.desaconsejaCultivo(cultivo);
    }
}
