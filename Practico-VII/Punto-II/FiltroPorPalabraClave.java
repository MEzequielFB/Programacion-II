public class FiltroPorPalabraClave implements Filtro {

    private String palabra_clave;

    public FiltroPorPalabraClave(String palabra_clave) {
        this.palabra_clave = palabra_clave;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.contienePalabraClave(this.palabra_clave);
    }
    
}
