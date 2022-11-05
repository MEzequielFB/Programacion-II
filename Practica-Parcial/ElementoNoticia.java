import java.util.ArrayList;

public abstract class ElementoNoticia {
    
    public ElementoNoticia() {

    }

    public abstract String getCategoria();
    public abstract ArrayList<String> getPalabrasClave();
    public abstract ArrayList<Noticia> buscarNoticias(Filtro filtro);
}