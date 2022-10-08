public class Main {
    public static void main(String[] args) {

        Pelicula pelicula1 = new Pelicula("duro de matar en la luna", "pasan cosas", "javier", 2000, 90, 16);
        Pelicula pelicula2 = new Pelicula("hombres de negro a la luna", "aliens", "gabriela", 2004, 55, 14);
        Pelicula pelicula3 = new Pelicula("viernes 13", "asesino serial por la vida", "matias", 1993, 75, 18);
        Pelicula pelicula4 = new Pelicula("soy leyenda", "zombis y will smith", "martin scorsese", 2002, 139, 16);
        Pelicula pelicula5 = new Pelicula("pelicula buena", "esta buena", "marcelo", 2010, 144, 18);
        Pelicula pelicula6 = new Pelicula("pelicula lunatica", "sinopsis", "alejo", 2018, 30, 12);

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

        pelicula5.addGenero("documental");
        pelicula5.addActor("juan");

        pelicula6.addGenero("ciencia ficcion");
        pelicula6.addActor("isabella");

        FiltroPorDuracionInferior filtro10 = new FiltroPorDuracionInferior(120);
        FiltroPorGenero filtro11 = new FiltroPorGenero("comedia");
        FiltroNot filtro12 = new FiltroNot(filtro11);
        FiltroAnd filtro13 = new FiltroAnd(filtro10, filtro12); //Combinacion logica de las anteriores - Peliculas con duracion menor a 120 minutos y que no sean del genero comedia

        FiltroPorAnioSuperior filtro14 = new FiltroPorAnioSuperior(2017);
        FiltroPorGenero filtro15 = new FiltroPorGenero("infantil");
        FiltroPorGenero filtro16 = new FiltroPorGenero("documental");
        FiltroOr filtro17 = new FiltroOr(filtro15, filtro16);
        FiltroOr filtro18 = new FiltroOr(filtro14, filtro17); //Combinacion logica de las anteriores - Peliculas posteriores a 2017 o que tengan o el genero infantil o documental

        Plataforma plataforma1 = new Plataforma(filtro18);

        plataforma1.addPelicula(pelicula1);
        plataforma1.addPelicula(pelicula2);
        plataforma1.addPelicula(pelicula3);
        plataforma1.addPelicula(pelicula4);
        plataforma1.addPelicula(pelicula5);
        plataforma1.addPelicula(pelicula6);

        FiltroPorTituloContiene filtro1 = new FiltroPorTituloContiene("luna");
        FiltroPorGenero filtro2 = new FiltroPorGenero("terror");

        FiltroPorActor filtro3 = new FiltroPorActor("will smith");
        FiltroPorDirector filtro4 = new FiltroPorDirector("martin scorsese");
        FiltroNot filtro5 = new FiltroNot(filtro4);
        FiltroAnd filtro6 = new FiltroAnd(filtro3, filtro5);

        FiltroPorAnioInferior filtro7 = new FiltroPorAnioInferior(2015);
        FiltroPorDuracionInferior filtro8 = new FiltroPorDuracionInferior(95);
        FiltroAnd filtro9 = new FiltroAnd(filtro7, filtro8);

        System.out.println("Películas de la plataforma: " + plataforma1);
        System.out.println("Peliculas que contengan 'luna' en el título: " + plataforma1.buscarPeliculas(filtro1));
        System.out.println("Peliculas que contengan el genero 'terror': " + plataforma1.buscarPeliculas(filtro2));
        System.out.println("Peliculas donde actue will smith y el director no sea martin scorsese: " + plataforma1.buscarPeliculas(filtro6));
        System.out.println("Peliculas estrenadas antes del 2015 y con duracion menor a 95 minutos: " + plataforma1.buscarPeliculas(filtro9));
    }
}