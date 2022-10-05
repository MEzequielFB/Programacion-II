public class Main {
    public static void main(String[] args) {

        Pelicula pelicula1 = new Pelicula("duro de matar en la luna", "pasan cosas", "javier", 2000, 90, 16);
        Pelicula pelicula2 = new Pelicula("hombres de negro a la luna", "aliens", "gabriela", 2004, 55, 14);
        Pelicula pelicula3 = new Pelicula("viernes 13", "asesino serial por la vida", "matias", 1993, 75, 18);
        Pelicula pelicula4 = new Pelicula("soy leyenda", "zombis y will smith", "martin scorsese", 2002, 63, 16);

        pelicula1.addGenero("accion");
        pelicula1.addGenero("drama");
        pelicula1.addActor("williams");

        pelicula2.addGenero("accion");
        pelicula2.addGenero("comedia");
        pelicula2.addActor("will smith");

        pelicula3.addGenero("terror");
        pelicula3.addActor("thomas anderson");

        pelicula4.addGenero("accion");
        pelicula4.addGenero("suspenso");
        pelicula4.addActor("will smith");

        Plataforma plataforma1 = new Plataforma();

        plataforma1.addPelicula(pelicula1);
        plataforma1.addPelicula(pelicula2);
        plataforma1.addPelicula(pelicula3);
        plataforma1.addPelicula(pelicula4);

        FiltroPorTituloContiene filtro1 = new FiltroPorTituloContiene("luna");
        FiltroPorGenero filtro2 = new FiltroPorGenero("terror");

        FiltroPorActor filtro3 = new FiltroPorActor("will smith");
        FiltroPorDirector filtro4 = new FiltroPorDirector("martin scorsese");
        FiltroNot filtro5 = new FiltroNot(filtro4);
        FiltroAnd filtro6 = new FiltroAnd(filtro3, filtro5);

        FiltroPorAnioInferior filtro7 = new FiltroPorAnioInferior(2015);
        FiltroPorDuracionInferior filtro8 = new FiltroPorDuracionInferior(95);
        FiltroAnd filtro9 = new FiltroAnd(filtro7, filtro8);

        System.out.println("Peliculas que contengan 'luna' en el título: " + plataforma1.buscarPeliculas(filtro1));
        System.out.println("Peliculas que contengan el genero 'terror': " + plataforma1.buscarPeliculas(filtro2));
        System.out.println("Peliculas donde actue will smith y el director no sea martin scorsese: " + plataforma1.buscarPeliculas(filtro6));
        System.out.println("Peliculas estrenadas antes del 2015 y con duracion menor a 95 minutos: " + plataforma1.buscarPeliculas(filtro9));
    }
}