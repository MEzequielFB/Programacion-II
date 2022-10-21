public class Main {
    public static void main(String[] args) {

        ContenedorNoticias contenedor1 = new ContenedorNoticias("colectivos de tandil", "colectivo.png");
        ContenedorNoticias contenedor2 = new ContenedorNoticias("transporte", "calle.png");
        ContenedorNoticias contenedor3 = new ContenedorNoticias("deporte", "pelota.png");
        ContenedorNoticias contenedor4 = new ContenedorNoticias("general", "diario.png");

        Noticia noticia1 = new Noticia("colectivos :o", "pasa esto", "pasaron cosas cosas cosas cosas cosas cosas cosas cosas cosas cosas cosas cosas cosas cosas cosas", "juan perez", "colectivos :o.html");
        Noticia noticia2 = new Noticia("ultimo momento", "pasa estoasd", "pasaron cosas otra vez", "juan perez", "ultimo momento.html");
        Noticia noticia3 = new Noticia("vehiculos", "pasa estoasd", "pasaron cosas otra vez", "agustina", "vehiculos.html");
        Noticia noticia4 = new Noticia("boca vs river", "goles y goles", "se pico", "hernesto caproli", "boca vs river.html");

        noticia1.addPalabraClave("colectivo");
        noticia2.addPalabraClave("colectivo");
        noticia3.addPalabraClave("vehiculo");
        noticia4.addPalabraClave("partido");
        noticia4.addPalabraClave("goleada");

        contenedor1.addContenido(noticia1);
        contenedor1.addContenido(noticia2);

        contenedor2.addContenido(noticia3);
        contenedor2.addContenido(contenedor1);

        contenedor3.addContenido(noticia4);

        contenedor4.addContenido(contenedor2);
        contenedor4.addContenido(contenedor3);

        Sistema sistema1 = new Sistema();
        sistema1.addContenido(contenedor4); //Raiz del sitio

        System.out.println("Cantidad de noticias de contenedor1: " + sistema1.getCantidadNoticiasPorContenido(contenedor1));
        System.out.println("Cantidad de noticias de contenedor2: " + sistema1.getCantidadNoticiasPorContenido(contenedor2));
        System.out.println("Cantidad de noticias de contenedor3: " + sistema1.getCantidadNoticiasPorContenido(contenedor3));
        System.out.println("Cantidad de noticias de contenedor4: " + sistema1.getCantidadNoticiasPorContenido(contenedor4));

        System.out.println("\nCopias");
        System.out.println("Copia de contenido2 por palabra clave 'colectivo': " + sistema1.getCopiaPorPalabraClave(contenedor2, "colectivo"));
        System.out.println("Copia de contenido1 por palabra clave 'pais': " + sistema1.getCopiaPorPalabraClave(contenedor1, "pais"));

        System.out.println("\nFiltros");
        //Filtro 1
        FiltroPorLargoTexto filtro_largo_texto1 = new FiltroPorLargoTexto(30);
        System.out.println("Noticias con largo del texto mayor a 30: " + sistema1.buscarNoticias(filtro_largo_texto1));

        //Filtro 2
        FiltroPorAutor filtro_autor = new FiltroPorAutor("juan perez");
        System.out.println("Noticias del autor 'juan perez': " + sistema1.buscarNoticias(filtro_autor));

        //Filtro 3
        FiltroPorPalabraClave filtro_palabra_clave1 = new FiltroPorPalabraClave("partido");
        FiltroPorPalabraClave filtro_palabra_clave2 = new FiltroPorPalabraClave("goleada");
        FiltroAnd filtro_and1 = new FiltroAnd(filtro_palabra_clave1, filtro_palabra_clave2);
        System.out.println("Noticias con las palabras clave 'partido' y 'goleada': " + sistema1.buscarNoticias(filtro_and1));

        //Filtro 4
        FiltroPorTitulo filtro_titulo1 = new FiltroPorTitulo("ultimo momento");
        System.out.println("Noticias con el titulo 'ultimo momento': " + sistema1.buscarNoticias(filtro_titulo1));

        //Mapa del sitio
        System.out.println("\nMapa del sitio");
        System.out.println(contenedor2.getMapa());
        System.out.println(noticia2.getMapa());
    }
}