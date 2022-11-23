import java.util.ArrayList;

public class Portal {
    
    private ArrayList<ElementoPortal> elementos;
    private ArrayList<Suscriptor> suscriptores;

    public Portal() {
        this.elementos = new ArrayList<>();
        this.suscriptores = new ArrayList<>();
    }

    //Funcionalidades
    public void entregarNoticia(Noticia noticia) {
        for (Suscriptor suscriptor : this.suscriptores) {
            suscriptor.addNoticia(noticia);
        }
    }

    public void addSuscriptor(Suscriptor suscriptor) {
        if (!this.suscriptores.contains(suscriptor)) {
            this.suscriptores.add(suscriptor);
        }
    }

    public ArrayList<ElementoPortal> getCopiaEstructura(Filtro filtro) {
        ArrayList<ElementoPortal> estructura_copia = new ArrayList<>();
        for (ElementoPortal elemento : this.elementos) {
            ElementoPortal elemento_copia = elemento.getCopiaEstructura(filtro);
            if (elemento_copia != null) {
                estructura_copia.add(elemento_copia);
            }
        }
        return estructura_copia;
    }

    public void addElemento(ElementoPortal elemento) {
        if (!this.elementos.contains(elemento)) {
            this.elementos.add(elemento);
        }
    }
}