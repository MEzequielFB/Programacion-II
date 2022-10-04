public class Main {
    public static void main(String[] args) {

        Documento documento1 = new Documento("indigenas", "origen de los indigenas");
        Documento documento2 = new Documento("san martin", "quien es san martin");
        Documento documento3 = new Documento("ucrania y rusia", "Guerra terrible muy muy muy muy muy muy muy muy muy muy muy muy muy muy muy muy muy muy muy terrible");

        documento1.addAutor("leonardo");
        documento1.addAutor("javier");

        documento2.addAutor("Esteban");

        documento3.addAutor("leonardo");

        documento2.addPalabraClave("guerra");
        documento3.addPalabraClave("guerra");

        Coleccion coleccion1 = new Coleccion();

        coleccion1.addDocumento(documento1);
        coleccion1.addDocumento(documento2);
        coleccion1.addDocumento(documento3);

        FiltroPorTitulo filtroTitulo1 = new FiltroPorTitulo("indigenas");
        FiltroPorTitulo filtroTitulo2 = new FiltroPorTitulo("colonizacion de marte");

        FiltroPorTituloContiene filtroTituloContiene1 = new FiltroPorTituloContiene("martin");

        FiltroPorPalabraClave filtroPorPalabraClave1 = new FiltroPorPalabraClave("guerra");

        FiltroTienePalabrasClave filtroTienePalabrasClave1 = new FiltroTienePalabrasClave();
        FiltroNot filtroNot1 = new FiltroNot(filtroTienePalabrasClave1);

        FiltroPorAutor filtroPorAutor1 = new FiltroPorAutor("leonardo");

        FiltroPorContenidoContiene filtroPorContenidoContiene1 = new FiltroPorContenidoContiene("de");

        FiltroPorContenidoCantidadPalabras filtroPorContenidoCantidadPalabras1 = new FiltroPorContenidoCantidadPalabras(20);

        FiltroAnd filtroAnd1 = new FiltroAnd(filtroPorPalabraClave1, filtroPorContenidoCantidadPalabras1);

        System.out.println("Documentos con titulo 'indigenas' " + coleccion1.buscarDocumentos(filtroTitulo1));
        System.out.println("Documentos con titulo 'colonizacion de marte' " + coleccion1.buscarDocumentos(filtroTitulo2));
        System.out.println("Documentos que contengan 'martin' en su titulo: " + coleccion1.buscarDocumentos(filtroTituloContiene1));
        System.out.println("Documentos que contengan la palabra clave 'guerra': " + coleccion1.buscarDocumentos
        (filtroPorPalabraClave1));
        System.out.println("Documentos que no contengan palabras clave: " + coleccion1.buscarDocumentos
        (filtroNot1));
        System.out.println("Documentos que contengan al autor 'leonardo': " + coleccion1.buscarDocumentos
        (filtroPorAutor1));
        System.out.println("Documentos que contengan la palabra 'de' en su contenido: " + coleccion1.buscarDocumentos
        (filtroPorContenidoContiene1));
        System.out.println("Documentos que contengan al menos 20 palabras: " + coleccion1.buscarDocumentos
        (filtroPorContenidoCantidadPalabras1));
        System.out.println("Documentos que contengan al menos 20 palabras y la palabra clave guerra: " + coleccion1.buscarDocumentos
        (filtroAnd1));
    }
}