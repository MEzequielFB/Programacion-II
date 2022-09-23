import java.util.ArrayList;

public class Trabajo {
    
    private static int cont;

    private int id;
    private String categoria;
    protected ArrayList<String> temas;

    public Trabajo(String categoria) {

        this.id = cont;
        this.categoria = categoria;
        this.temas = new ArrayList<>();

        cont++;
    }

    //Funcionalidades
    public boolean evaluadorEsApto(Evaluador evaluador) {

        int contador = 0;
        for (String tema : this.temas) {

            if (evaluador.conoceTema(tema)) {
                contador++;
            }
        }
        return contador == this.temas.size();
    }

    public void addTema(String tema) {

        if (!this.temas.contains(tema)) {
            this.temas.add(tema);
        }
    }

    //Getters
    public String getCategoria() {
        return this.categoria;
    }

    public int getId() {
        return this.id;
    }

    //Setters
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Trabajo otroTrabajo = (Trabajo) o;
            return this.getId() == otroTrabajo.getId() && this.getCategoria().equalsIgnoreCase(otroTrabajo.getCategoria());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Trabajo [categoria=" + categoria + ", id=" + id + "]";
    }
}