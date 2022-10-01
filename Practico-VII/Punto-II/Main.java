public class Main {
    public static void main(String[] args) {

        Documento documento1 = new Documento("indigenas", "origen de los indigenas");
        Documento documento2 = new Documento("san martin", "quien es san martin");
        Documento documento3 = new Documento("ucrania y rusia", "razones de la guerra");

        Coleccion coleccion1 = new Coleccion();

        coleccion1.addDocumento(documento1);
        coleccion1.addDocumento(documento2);
        coleccion1.addDocumento(documento3);

        FiltroPorTitulo filtroTitulo1 = new FiltroPorTitulo("indigenas");
        FiltroPorTitulo filtroTitulo2 = new FiltroPorTitulo("colonizacion de marte");

        System.out.println("Documentos con titulo 'indigenas' " + coleccion1.buscarDocumentos(filtroTitulo1));
        System.out.println("Documentos con titulo 'colonizacion de marte' " + coleccion1.buscarDocumentos(filtroTitulo2));
    }
}