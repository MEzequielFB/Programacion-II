public class FiltroPorContenidoCantidadPalabras implements Filtro {

    private int cantidad_palabras;

    public FiltroPorContenidoCantidadPalabras(int cantidad_palabras) {
        this.cantidad_palabras = cantidad_palabras;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.tieneMinimaCantidadPalabras(this.cantidad_palabras);
    }
    
}
