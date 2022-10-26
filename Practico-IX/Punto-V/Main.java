import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("sebastian", "qatar", 1, 30);
        Empleado empleado2 = new Empleado("matias", "bonilla", 2, 18);
        Empleado empleado3 = new Empleado("ezequiel", "frisone", 3, 25);
        Empleado empleado4 = new Empleado("martin", "miranda", 4, 54);
        Empleado empleado5 = new Empleado("camila", "fara", 5, 43);

        Mensaje mensaje1 = new Mensaje(empleado1, LocalDateTime.of(2022, 10, 26, 16, 0, 0));
        Mensaje mensaje2 = new Mensaje(empleado1, LocalDateTime.of(2022, 10, 26, 16, 30, 0));

        Mensaje mensaje3 = new Mensaje(empleado2, LocalDateTime.of(2022, 10, 26, 17, 0, 0));

        Mensaje mensaje4 = new Mensaje(empleado3, LocalDateTime.of(2022, 9, 15, 13, 0, 0));

        Mensaje mensaje5 = new Mensaje(empleado4, LocalDateTime.of(2022, 9, 16, 9, 0, 0));

        Mensaje mensaje6 = new Mensaje(empleado5, LocalDateTime.of(2022, 10, 25, 10, 0, 0));

        //Agrega palabras
        mensaje1.addPalabra("hola");
        mensaje1.addPalabra("chicos");
        mensaje2.addPalabra("java");
        mensaje2.addPalabra(":)");


        mensaje3.addPalabra("joya");

        mensaje4.addPalabra("okei");
        mensaje4.addPalabra("matrix");

        mensaje5.addPalabra("tranqui");
        mensaje5.addPalabra("no");
        mensaje5.addPalabra("pasa");
        mensaje5.addPalabra("nada");
        mensaje5.addPalabra("java");

        mensaje6.addPalabra("buenisimo");

        //Crea limitaciones
        LimitacionPorPalabra limitacion_palabra1 = new LimitacionPorPalabra("java");
        LimitacionPorLargo limitacion_largo1 = new LimitacionPorLargo(4);
        LimitacionPorEmpleado limitacion_emplead1 = new LimitacionPorEmpleado(empleado4);

        Grupo grupo1 = new Grupo("programadores de java", limitacion_palabra1);
        grupo1.addComunicado(empleado1);
        grupo1.addComunicado(empleado2);

        Grupo grupo2 = new Grupo("tudai 2022", limitacion_largo1); //Grupo 2 contiene todo
        grupo2.addComunicado(empleado2);
        grupo2.addComunicado(empleado3);
        grupo2.addComunicado(empleado4);
        grupo2.addComunicado(grupo1);
        
        grupo1.addNotificacion(mensaje2);
        grupo2.addNotificacion(mensaje4);

        grupo2.setLimitacion(limitacion_emplead1); //cambia la limitacion
        grupo2.addNotificacion(mensaje5);

        System.out.println(grupo2);

        Sistema sistema1 = new Sistema();
        sistema1.addComunicado(grupo2);
        sistema1.addComunicado(empleado5);

        //Inciso 1
        ComparadorPorCantidadMensajes comparador_cantidad_mensajes1 = new ComparadorPorCantidadMensajes();

        System.out.println("\nCantidad de empleado del grupo1: " + sistema1.getCantidadEmpleadosPorGrupo(grupo1));
        System.out.println("Cantidad de empleado del grupo2: " + sistema1.getCantidadEmpleadosPorGrupo(grupo2));

        //Inciso 2
        System.out.println("\nListado de empleados ordenados asc por cantidad de notificaciones: " + sistema1.getListadoEmpleados(comparador_cantidad_mensajes1));

        //Inciso 4
        LimitacionPorPalabra limitacion_palabra2 = new LimitacionPorPalabra("matrix");
        ComparadorPorEdad comparador_edad1 = new ComparadorPorEdad();
        System.out.println("\nListado de  empleados que contengan la palabra matrix en alguna notificacion ordenados asc por edad: " + sistema1.getListadoEmpleados(limitacion_palabra2, comparador_edad1));

        //Inciso 5
        LimitacionPorLargo limitacion_largo2 = new LimitacionPorLargo(3);
        System.out.println("\nListado de empleados con notificaciones con menos de 3 palabras: " + sistema1.getListadoEmpleados(limitacion_largo2, null));

        //Inciso 6
        System.out.println("\nCantidad de mensajes del grupo2: " + sistema1.getCantidadDeMensajesPorGrupo(grupo2));
    }
}