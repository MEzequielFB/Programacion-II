import java.util.ArrayList;

public abstract class ElementoPortal implements Comparable<ElementoPortal> {
    
    private String titulo;
    private String categoria;

    public ElementoPortal(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    //Metodos abstractos
    public abstract ArrayList<String> getPalabrasClave();
    public abstract ElementoPortal getCopiaEstructura(Filtro filtro);

    //Funcionalidades
    @Override
    public int compareTo(ElementoPortal otroElemento) {
        return this.getCategoria().compareTo(otroElemento.getCategoria());
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean equals(Object o) {

        try {
            ElementoPortal otroElemento = (ElementoPortal) o;
            return this.getTitulo().equalsIgnoreCase(otroElemento.getTitulo());
        }
        catch(Exception exc) {
            return false;
        }
    }
}