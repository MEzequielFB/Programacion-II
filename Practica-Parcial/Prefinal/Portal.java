import java.util.ArrayList;

public class Portal {
    
    private ArrayList<ElementoNoticia> elementos;

    public Portal() {
        this.elementos = new ArrayList<>();
    }

    //Funcionalidades
    public void addElemento(ElementoNoticia elemento) {
        if (!this.elementos.contains(elemento)) {
            this.elementos.add(elemento);
        }
    }

    //Getters
    public int getCantidadElementosPorCaracteristica(Seccion seccion, Filtro filtro) {
        return seccion.getCantidadElementosPorCaracteristica(filtro);
    }
}
