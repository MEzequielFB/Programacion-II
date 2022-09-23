import java.util.ArrayList;

public class Evaluador {

    private static int cont;

    private int id;
    private String nombre;
    private ArrayList<String> temasConocidos;
    private ArrayList<Trabajo> trabajos;

    public Evaluador(String nombre) {

        this.id = cont;
        this.setNombre(nombre);
        this.temasConocidos = new ArrayList<>();
        this.trabajos = new ArrayList<>();

        cont++;
    }

    //Funcionalidades
    public boolean esExperto(Comite comite) {
        
        for (String tema : this.temasConocidos) {

            if (comite.contieneTema(tema)) {
                return true;
            }
        }
        return false;
    }

    public int getCantidadTrabajos() {
        return this.trabajos.size();
    }

    public void addTrabajo(Trabajo trabajo) {

        if (!this.trabajos.contains(trabajo) && this.esApto(trabajo)) {
            this.trabajos.add(trabajo);
        }
    }

    public boolean esApto(Trabajo trabajo) {
        return trabajo.evaluadorEsApto(this);
    }

    public boolean conoceTema(String temaTrabajo) {

        for (String tema : this.temasConocidos) {

            if (tema.equalsIgnoreCase(temaTrabajo)) {
                return true;
            }
        }
        return false;
    }

    public void addTema(String tema) {

        if (!this.temasConocidos.contains(tema)) {
            this.temasConocidos.add(tema);
        }
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }
    
    public int getId() {
        return this.id;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Evaluador otroEvaluador = (Evaluador) o;
            return this.getId() == otroEvaluador.getId();
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Evaluador [id=" + id + ", nombre=" + nombre + "]";
    }
}