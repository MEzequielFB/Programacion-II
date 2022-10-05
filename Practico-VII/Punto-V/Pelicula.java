import java.util.ArrayList;

public class Pelicula {
    
    private String titulo;
    private String sinopsis;
    private ArrayList<String> generos;
    private String director;
    private ArrayList<String> actores;
    private int anio_estreno;
    private int duracion;
    private int edad_minima_requerida;

    public Pelicula(String titulo, String sinopsis, String director, int anio_estreno, int duracion, int edad_minima_requerida) {

        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.director = director;
        this.anio_estreno = anio_estreno;
        this.duracion = duracion;
        this.edad_minima_requerida = edad_minima_requerida;
        this.generos = new ArrayList<>();
        this.actores = new ArrayList<>();
    }

    //Funcionalidades
    public boolean contieneActor(String actor) {
        return this.actores.contains(actor);
    }

    public boolean contieneGenero(String genero) {
        return this.generos.contains(genero);
    }

    public void addActor(String actor) {

        if (!this.actores.contains(actor)) {
            this.actores.add(actor);
        }
    }

    public void addGenero(String genero) {

        if (!this.generos.contains(genero)) {
            this.generos.add(genero);
        }
    }

    //Getters
    public String getTitulo() {
        return this.titulo;
    }

    public String getSinopsis() {
        return this.sinopsis;
    }

    public String getDirector() {
        return this.director;
    }

    public int getAnioEstreno() {
        return this.anio_estreno;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public int getEdadMinimaRequerida() {
        return this.edad_minima_requerida;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Pelicula otraPelicula = (Pelicula) o;
            return this.getTitulo().equalsIgnoreCase(otraPelicula.getTitulo()) && this.getDirector().equalsIgnoreCase(otraPelicula.getDirector());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Pelicula [titulo=" + titulo + "]";
    }
}