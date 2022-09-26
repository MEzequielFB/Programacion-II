import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Juan", "43847271");
        Cliente c2 = new Cliente("Fernanda", "40384382");

        Pelicula p1 = new Pelicula(150, "Pelicula 1", "Terror", "Carlitos", 1);
        Pelicula p2 = new Pelicula(150, "Pelicula 2", "Comedia", "Axel", 2);

        Vehiculo v1 = new Vehiculo(10000, "Ford", 2000, "MFN 123", "Naftero");

        Videoclub videoclub1 = new Videoclub("Alquileres peliculas/autos");

        videoclub1.addCliente(c1);
        videoclub1.addCliente(c2);

        videoclub1.addProducto(p1);
        videoclub1.addProducto(p2);
        videoclub1.addProducto(v1);

        Alquiler a1 = videoclub1.alquilar(c1, p1, LocalDateTime.of(2022, 9, 28, 16, 0, 0));
        Alquiler a2 = videoclub1.alquilar(c2, p1, LocalDateTime.of(2022, 9, 28, 16, 0, 0));
        Alquiler a3 = videoclub1.alquilar(c2, v1, LocalDateTime.of(2022, 8, 28, 16, 0, 0));
        Alquiler a4 = videoclub1.alquilar(c2, p2, LocalDateTime.of(2022, 8, 28, 16, 0, 0));

        System.out.println("Alquiler 1: " + a1);
        System.out.println("Alquiler 2: " + a2);
        System.out.println("Alquiler 3: " + a3);
        System.out.println("Alquiler 3: " + a4);

        System.out.println("Cantidad de alquileres: " + videoclub1.getCantidadAlquileres());
        System.out.println("Clientes con alquileres vencidos: " + videoclub1.getClientesAlquilerVencido());
    }
}