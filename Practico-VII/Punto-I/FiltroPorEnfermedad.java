public class FiltroPorEnfermedad implements Filtro {

    private Enfermedad enfermedad;

    public FiltroPorEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    @Override
    public boolean cumple(ProductoQuimico producto_quimico) {
        return producto_quimico.trataEnfermedad(enfermedad);
    }
}