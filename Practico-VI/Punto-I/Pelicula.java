public class Pelicula extends Producto {
 
    private String titulo;
    private String genero;
    private String director;

    public Pelicula(double precio, String titulo, String genero, String director, int stock) {

        super(precio, stock);
        this.setTitulo(titulo);
        this.setGenero(genero);
        this.setDirector(director);
    }

    //Funcionalidades
    

    //Getters
    public String getTitulo() {
        return this.titulo;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getDirector() {
        return this.director;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDirector(String director) {
        this.director = director;
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
        return "Pelicula [director=" + director + ", genero=" + genero + ", titulo=" + titulo + "]";
    }
}