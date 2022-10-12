import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cancha cancha1 = new Cancha();
        Cancha cancha2 = new Cancha();

        Socio socio1 = new Socio("juan", "bautista", 23, false);
        Socio socio2 = new Socio("candela", "bautista", 20, false);
        Socio socio3 = new Socio("carmen", "bala", 32, true);
        Socio socio4 = new Socio("candela", "zarap", 17, true);
        Socio socio5 = new Socio("luciano", "pereyra", 15, true);

        Alquiler alquiler1 = new Alquiler(socio1, cancha1, LocalDate.of(2022, 9, 11), 1000);
        Alquiler alquiler2 = new Alquiler(socio1, cancha1, LocalDate.of(2022, 10, 11), 1000);
        Alquiler alquiler3 = new Alquiler(socio2, cancha1, LocalDate.of(2022, 10, 21), 500);
        Alquiler alquiler4 = new Alquiler(socio3, cancha1, LocalDate.of(2022, 1, 21), 600);
        Alquiler alquiler5 = new Alquiler(socio5, cancha2, LocalDate.of(2022, 1, 21), 700);
        Alquiler alquiler6 = new Alquiler(socio5, cancha1, LocalDate.of(2022, 3, 21), 800);

        socio1.addAlquiler(alquiler1);
        socio1.addAlquiler(alquiler2);

        socio2.addAlquiler(alquiler3);

        socio3.addAlquiler(alquiler4);

        socio5.addAlquiler(alquiler5);
        socio5.addAlquiler(alquiler6);
        
        Club club1 = new Club();

        club1.addCancha(cancha1);
        club1.addCancha(cancha2);

        club1.addSocio(socio1);
        club1.addSocio(socio2);
        club1.addSocio(socio3);
        club1.addSocio(socio4);
        club1.addSocio(socio5);

        //Punto a
        FiltroPorCuotaPaga cuota = new FiltroPorCuotaPaga();
        FiltroNot not1 = new FiltroNot(cuota);

        ComparadorPorApellido compApellido = new ComparadorPorApellido();
        ComparadorPorNombre compNombre = new ComparadorPorNombre();
        ComparadorAnd compAnd = new ComparadorAnd(compApellido, compNombre);

        //Punto b
        FiltroPorMayorDeEdad edad = new FiltroPorMayorDeEdad();
        FiltroNot not2 = new FiltroNot(edad);

        ComparadorPorEdad compEdad = new ComparadorPorEdad();

        //Punto c
        FiltroPorCancha cancha = new FiltroPorCancha(cancha1);

        ComparadorPorCantidadAlquileresCancha compCantidadAlquilerCancha = new ComparadorPorCantidadAlquileresCancha(cancha1);

        //Punto d
        FiltroPorPrecio precio = new FiltroPorPrecio(500);

        ComparadorPorCuotaPaga compCuotaPaga = new ComparadorPorCuotaPaga();
        ComparadorNot compNot = new ComparadorNot(compCuotaPaga); //Hace que los primeros socios sean los que tienen la cuota paga
        ComparadorAnd compAnd2 = new ComparadorAnd(compNot, compAnd);

        System.out.println("Socios con cuota impaga ordenados por apellido y nombre: " + club1.filtrarSociosOrdenados(not1, compAnd));
        System.out.println("Socios menores de edad ordenados por edad: " + club1.filtrarSociosOrdenados(not2, compEdad));
        System.out.println("Socios que alquilaron la cancha1 ordenados por la cantidad de alquileres de esa cancha: " + club1.filtrarSociosOrdenados(cancha, compCantidadAlquilerCancha));
        System.out.println("Socios que pagaron mas de 500 ordenados por cuota paga y alfabeticamente: " + club1.filtrarSociosOrdenados(precio, compAnd2));
    }
}