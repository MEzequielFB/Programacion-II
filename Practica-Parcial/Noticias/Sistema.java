import java.util.ArrayList;

public class Sistema {
    
    private ArrayList<ElementoNoticia> elementos;

    public Sistema() {
        this.elementos = new ArrayList<>();
    }

    //Funcionalidades
    public ArrayList<String> getMapa(ElementoNoticia elemento_noticia) {
        ArrayList<String> mapa_sitio = new ArrayList<>();
        for (ElementoNoticia elemento : this.elementos) {
            mapa_sitio.addAll(elemento.getMapa(elemento_noticia));
        }
        return mapa_sitio;
    }

    public ArrayList<ElementoNoticia> getNuevaInterfaz(String palabra_clave) {
        ArrayList<ElementoNoticia> nueva_interfaz = new ArrayList<>();
        for (ElementoNoticia elemento : this.elementos) {
            ElementoNoticia elemento_copia = elemento.getCopia(palabra_clave);
            if (elemento_copia != null) {
                nueva_interfaz.add(elemento_copia);
            }
        }
        return nueva_interfaz;
    }

    public void addElemento(ElementoNoticia elemento_noticia) {
        if (!this.elementos.contains(elemento_noticia)) {
            this.elementos.add(elemento_noticia);
        }
    }
}