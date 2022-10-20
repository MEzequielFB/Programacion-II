import java.util.ArrayList;

public class ContenedorNoticias extends Contenido {

    private String descripcion;
    private String imagen;
    private ArrayList<Contenido> contenidos;

    public ContenedorNoticias(String descripcion, String imagen) {
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.contenidos = new ArrayList<>();
    }

    //Funcionalidades
    public void addContenido(Contenido contenido) {

        if (!this.contenidos.contains(contenido)) {
            this.contenidos.add(contenido);
        }
    }

    //Getters
    @Override
    public Contenido getCopiaPorPalabraClave(String palabra_clave) {

        ContenedorNoticias contenedor_copia = new ContenedorNoticias(this.descripcion, this.imagen);
        for (Contenido contenido : this.contenidos) {

            Contenido copia_hijo = contenido.getCopiaPorPalabraClave(palabra_clave);
            if (copia_hijo != null) {
                contenedor_copia.addContenido(copia_hijo);
            }
        }
        return contenedor_copia;
    }

    @Override
    public int getCantidadNoticias() {
        
        int cantidad_noticias = 0;
        for (Contenido contenido : this.contenidos) {
            cantidad_noticias += contenido.getCantidadNoticias();
        }
        return cantidad_noticias;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getImagen() {
        return this.imagen;
    }

    @Override
    public boolean equals(Object o) {

        try {
            ContenedorNoticias otroContenedor = (ContenedorNoticias) o;
            return this.getDescripcion().equalsIgnoreCase(otroContenedor.getDescripcion()) && this.getImagen().equalsIgnoreCase(otroContenedor.getImagen());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "ContenedorNoticias [descripcion=" + descripcion + ", contenidos=" + contenidos + "]";
    }
}