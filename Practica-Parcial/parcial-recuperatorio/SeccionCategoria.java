import java.util.ArrayList;

public class SeccionCategoria extends Seccion {

    private ArrayList<String> categorias_admisibles;

    public SeccionCategoria(String titulo, String categoria) {
        super(titulo, categoria);
        this.categorias_admisibles = new ArrayList<>();
    }

    //Funcionalidades
    @Override
    public void addElemento(ElementoPortal elemento) {
        for (String categoria_admisible : this.categorias_admisibles) {
            if (elemento.getCategoria().equalsIgnoreCase(categoria_admisible)) {
                super.addElemento(elemento);
            }
        }
    }

    public void addCategoriaAdmisible(String categoria) {
        if (!this.categorias_admisibles.contains(categoria)) {
            this.categorias_admisibles.add(categoria);
        }
    }

    @Override
    public ElementoPortal getCopiaEstructura(Filtro filtro) {
        SeccionCategoria seccion_copia = new SeccionCategoria(this.getTitulo(), this.getCategoria());
        for (String categoria_admisible : this.categorias_admisibles) {
            seccion_copia.addCategoriaAdmisible(categoria_admisible);
        }
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
}