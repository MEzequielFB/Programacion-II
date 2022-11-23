import java.util.ArrayList;
import java.util.Collections;
public class Seccion extends ElementoPortal {

    protected ArrayList<ElementoPortal> elementos;

    public Seccion(String titulo, String categoria) {
        super(titulo, categoria);
        this.elementos = new ArrayList<>();
    }

    //Funcionalidades
    public boolean tieneElementos() {
        return !this.elementos.isEmpty();
    }

    public void addElemento(ElementoPortal elemento) {
        if (!this.elementos.contains(elemento)) {
            this.elementos.add(elemento);
        }
        Collections.sort(this.elementos);
    }

    //Getters
    @Override
    public ElementoPortal getCopiaEstructura(Filtro filtro) {
        Seccion seccion_copia = new Seccion(this.getTitulo(), this.getCategoria());
        for (ElementoPortal elemento : this.elementos) {
            ElementoPortal elemento_copia = elemento.getCopiaEstructura(filtro);
            if (elemento_copia != null) {
                seccion_copia.addElemento(elemento_copia);
            }
        }
        if (seccion_copia.tieneElementos()) {
            return seccion_copia;
        }
        return null;
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> palabras_clave = new ArrayList<>();
        for (ElementoPortal elemento : this.elementos) {
            for (String palabra_clave : elemento.getPalabrasClave()) {
                if (!palabras_clave.contains(palabra_clave)) {
                    palabras_clave.add(palabra_clave);
                }
            }
        }
        return palabras_clave;
    }
}