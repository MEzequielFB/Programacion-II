import java.util.ArrayList;

public abstract class Contenido {

    private Contenido referencia_padre;

    //Getters
    public Contenido getReferenciaPadre() {
        return this.referencia_padre;
    }

    //Setters
    public void setReferenciaPadre(Contenido referencia_padre) {
        this.referencia_padre = referencia_padre;
    }

    //Metodos abstractos
    public abstract int getCantidadNoticias();
    public abstract Contenido getCopiaPorPalabraClave(String palabra_clave);
    public abstract ArrayList<Noticia> buscarNoticias(Filtro filtro);
    public abstract String getMapa();
}