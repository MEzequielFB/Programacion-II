import java.util.ArrayList;

public class Sistema {
    
    private ArrayList<ElementoNoticia> elementos;

    public Sistema() {
        this.elementos = new ArrayList<>();
    }

    //Funcionalidades
    public void completarNoticia(Noticia noticia, Filtro filtro, ArrayList<String> palabras_clave_para_completar) {
        if (filtro.cumple(noticia)) {
            for (String palabra_clave : palabras_clave_para_completar) {
                if (!noticia.contienePalabraClave(palabra_clave)) {
                    noticia.addPalabraClave(palabra_clave);
                }
            }
        }
    }

    public ArrayList<Noticia> buscarNoticias(Filtro filtro) {
        ArrayList<Noticia> noticias_filtradas = new ArrayList<>();
        for (ElementoNoticia elemento : this.elementos) {
            noticias_filtradas.addAll(elemento.buscarNoticias(filtro));
        }
        return noticias_filtradas;
    }

    public void addElemento(ElementoNoticia elemento) {
        if (!this.elementos.contains(elemento)) {
            this.elementos.add(elemento);
        }
    }
}