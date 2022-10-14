import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Archivo archivo1 = new Archivo("texto.txt", LocalDate.of(2022, 2, 21), LocalDate.of(2022, 5, 11), 5);
        Archivo archivo2 = new Archivo("apuntes-parcial.txt", LocalDate.of(2022, 4, 21), LocalDate.of(2022, 5, 12), 3);
        Archivo archivo3 = new Archivo("parcial", LocalDate.of(2022, 1, 3), LocalDate.of(2022, 6, 21), 10);

        Link link1 = new Link("referencia apuntes", LocalDate.of(2022, 6, 21), LocalDate.of(2022, 12, 21), archivo2);

        Directorio directorio1 = new Directorio("directorio1", LocalDate.of(2022, 1, 21), LocalDate.of(2022, 9, 21));

        ArchivoComprimido archivoComprimido1 = new ArchivoComprimido("comprimido1", LocalDate.of(2022, 8, 21), LocalDate.of(2022, 8, 21), 5);

        directorio1.addElemento(archivo1);
        directorio1.addElemento(link1);

        archivoComprimido1.addElemento(directorio1);
        archivoComprimido1.addElemento(archivo2);

        Sistema sistema1 = new Sistema();
        sistema1.addElemento(archivo1);
        sistema1.addElemento(archivo2);
        sistema1.addElemento(archivo3);
        sistema1.addElemento(link1);
        sistema1.addElemento(directorio1);
        sistema1.addElemento(archivoComprimido1);

        System.out.println(directorio1);
        System.out.println("Tamanio directorio1: " + directorio1.getTamanio());
        System.out.println(archivoComprimido1);
        System.out.println("Tamanio archivoComprimido1: " + archivoComprimido1.getTamanio());

        //Filtro1
        FiltroPorNombreContiene filtroNombreContiene1 = new FiltroPorNombreContiene("parcial");

        System.out.println("Elementos que contengan 'parcial': " + sistema1.buscarElementos(filtroNombreContiene1, null));

        //Filtro2
        FiltroPorFechaModificacionPosterior filtroFechaModificacion1 = new FiltroPorFechaModificacionPosterior(LocalDate.of(2022, 10, 15));

        System.out.println("Elementos con fecha de modificacion posterior a '15/10/2022': " + sistema1.buscarElementos(filtroFechaModificacion1, null));

        //Filtro3
        FiltroPorFechaCreacionPosterior filtroFechaCreacion1 = new FiltroPorFechaCreacionPosterior(LocalDate.of(2022, 3, 15));
        FiltroNot filtroNot1 = new FiltroNot(filtroFechaCreacion1);
        FiltroPorNombre filtroNombre1 = new FiltroPorNombre("parcial");
        FiltroAnd filtroAnd1 = new FiltroAnd(filtroNombre1, filtroNot1);

        System.out.println("Elementos con fecha de creacion anterior a '15/03/2022' y que su nombre sea 'parcial': " + sistema1.buscarElementos(filtroAnd1, null));

        //Filtro extra
        FiltroPorTamanioSuperior filtroTamanio = new FiltroPorTamanioSuperior(6);
        FiltroOr filtroOr1 = new FiltroOr(filtroFechaCreacion1, filtroTamanio);

        System.out.println("Elementos con fecha de creacion posterior a '15/03/2022' o con tamanio mayor a 6: " + sistema1.buscarElementos(filtroOr1, null));

        //Busquedas con Comparator
        System.out.println("\nBusquedas con orden:");
        //Comparador1
        ComparadorPorFechaCreacion comparadorFechaCreacion1 = new ComparadorPorFechaCreacion();
        ComparadorPorNombre comparadorNombre = new ComparadorPorNombre();
        ComparadorAnd comparadorAnd1 = new ComparadorAnd(comparadorFechaCreacion1, comparadorNombre);

        System.out.println("Elementos que contengan 'parcial' en su nombre, ordenados ascendentemente por fecha_creacion y dsp por nombre: " + sistema1.buscarElementos(filtroNombreContiene1, comparadorAnd1));

        //Comparador2
        FiltroPorTamanioSuperior filtroTamanio2 = new FiltroPorTamanioSuperior(5);
        ComparadorPorTamanio comparadorTamanio1 = new ComparadorPorTamanio();
        ComparadorNot comparadorNot1 = new ComparadorNot(comparadorTamanio1);
        ComparadorNot comparadorNot2 = new ComparadorNot(comparadorFechaCreacion1);
        ComparadorAnd comparadorAnd2 = new ComparadorAnd(comparadorNot1, comparadorNot2);
        System.out.println("Elementos con tamanio mayor a 5 ordenados descendentemente por tamanio y dsp por fecha_creacion: " + sistema1.buscarElementos(filtroTamanio2, comparadorAnd2));

        //Comparador3
        FiltroPorNombreContiene filtroPorNombreContiene2 = new FiltroPorNombreContiene("t");
        ComparadorNot comparadorNot3 = new ComparadorNot(comparadorNombre);
        System.out.println("Elementos que contengan 't' en su nombre ordenados por nombre descendente: " + sistema1.buscarElementos(filtroPorNombreContiene2, comparadorNot3));
    }
}