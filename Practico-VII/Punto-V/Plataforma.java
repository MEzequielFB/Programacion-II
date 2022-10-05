import java.util.ArrayList;

public class Plataforma {
    
    private ArrayList<Pelicula> peliculas;

    public Plataforma() {
        this.peliculas = new ArrayList<>();
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

        if (!this.peliculas.contains(pelicula)) {
            this.peliculas.add(pelicula);
        }
    }
}