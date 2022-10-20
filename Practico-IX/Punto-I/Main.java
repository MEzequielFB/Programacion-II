public class Main {
    public static void main(String[] args) {

        ContenedorNoticias contenedor1 = new ContenedorNoticias("colectivos de tandil, paso esto", "colectivo.png");
        ContenedorNoticias contenedor2 = new ContenedorNoticias("transporte", "calle.png");

        Noticia noticia1 = new Noticia("colectivos :o", "pasa esto", "pasaron cosas", "augusto", "noticias.com/colectivos");
        Noticia noticia2 = new Noticia("colectivos 2", "pasa estoasd", "pasaron cosas otra vez", "augusto segundo", "noticias.com/colectivos");
        Noticia noticia3 = new Noticia("vehiculos", "pasa estoasd", "pasaron cosas otra vez", "agustina", "noticias.com/transporte/asd");

        noticia1.addPalabraClave("colectivo");
        noticia2.addPalabraClave("colectivo");
        noticia3.addPalabraClave("vehiculo");

        contenedor1.addContenido(noticia1);
        contenedor1.addContenido(noticia2);

        contenedor2.addContenido(noticia3);
        contenedor2.addContenido(contenedor1);

        Sistema sistema1 = new Sistema();
        sistema1.addContenido(noticia1);
        sistema1.addContenido(noticia2);
        sistema1.addContenido(noticia3);

        sistema1.addContenido(contenedor1);
        sistema1.addContenido(contenedor2);

        System.out.println("Cantidad de noticias de contenedor1: " + sistema1.getCantidadNoticiasPorContenido(contenedor1));
        System.out.println("Cantidad de noticias de contenedor2: " + sistema1.getCantidadNoticiasPorContenido(contenedor2));

        System.out.println("Copia de contenido2 por palabra clave 'colectivo': " + sistema1.getCopiaPorPalabraClave(contenedor2, "colectivo"));
        System.out.println("Copia de contenido1 por palabra clave 'pais': " + sistema1.getCopiaPorPalabraClave(contenedor1, "pais"));
    }
}