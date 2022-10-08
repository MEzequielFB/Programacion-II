import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Archivo archivo1 = new Archivo("sublime text", LocalDate.of(2022, 7, 11), LocalDate.of(2022, 8, 4), 100);
        Archivo archivo2 = new Archivo("internet explorer", LocalDate.of(2020, 1, 2), LocalDate.of(2021, 2, 1), 483);

        Link link1 = new Link("internet explorer link", LocalDate.of(2020, 1, 2), LocalDate.of(2021, 2, 1), archivo2);

        Directorio directorio1 = new Directorio("asdasfas", LocalDate.of(2022, 7, 11), LocalDate.of(2022, 8, 4));

        ArchivoComprimido archivoC1 = new ArchivoComprimido("comprimido", LocalDate.of(2022, 7, 11), LocalDate.of(2022, 8, 11), 15);

        directorio1.addElemento(archivo1);
        directorio1.addElemento(archivo2);
        directorio1.addElemento(link1);

        archivoC1.addElemento(archivo1);
        archivoC1.addElemento(archivo2);
        archivoC1.addElemento(link1);

        System.out.println("Tamanio del archivo1: " + archivo1.getTamanio());
        System.out.println("Cantidad de elementos de archivo1: " + archivo1.getCantidadElementos());
        System.out.println("Tamanio del directorio1: " + directorio1.getTamanio());
        System.out.println("Cantidad de elementos de directorio1: " + directorio1.getCantidadElementos());
        System.out.println("Tamanio del archivoC1: " + archivoC1.getTamanio());
        System.out.println("Cantidad de elementos de archivoC1: " + archivoC1.getCantidadElementos());
    }
}