import java.util.ArrayList;

public class Plataforma {
    
    private ArrayList<Pelicula> peliculas;
    private Filtro preferencia;

    public Plataforma(Filtro preferencia) {

        this.peliculas = new ArrayList<>();
        this.preferencia = preferencia;
    }

    //Funcionalidades
    public ArrayList<Pelicula> buscarPeliculas(Filtro filtro) {

        ArrayList<Pelicula> peliculas_filtradas = new ArrayList<>();
        for (Pelicula pelicula : this.peliculas) {

            if (filtro.cumple(pelicula)) {
                peliculas_filtradas.add(pelicula);
            }
        }
        return peliculas_filtradas;
    }

    public void addPelicula(Pelicula pelicula) {

        if (!this.peliculas.contains(pelicula) && this.preferencia.cumple(pelicula)) {
            this.peliculas.add(pelicula);
        }
    }

    //Setters
    public void setPreferencia(Filtro preferencia) {
        this.preferencia = preferencia;
    }

    @Override
    public String toString() {
        return "Plataforma [peliculas=" + peliculas + "]";
    }
}