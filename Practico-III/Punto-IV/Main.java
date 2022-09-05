import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Direccion d1 = new Direccion("Av. España", 890, "Tandil");
        Contacto c1 = new Contacto("Fernando", "Quiroga", LocalDate.of(1999, 7, 11), "48305721873", d1, "correo@hotmail.com");

        Direccion d2 = new Direccion("Av. España", 150, "Tandil");
        Contacto c2 = new Contacto("Fernando", "Quiroga", LocalDate.of(1989, 9, 11), "48305721873", d2, "correo13@hotmail.com");

        Direccion d4 = new Direccion("Av. España", 150, "Tandil");
        Contacto c4 = new Contacto("Fernando", "Quiroga", LocalDate.of(1960, 9, 11), "48305721873", d4, "correo13@hotmail.com");

        Direccion d3 = new Direccion("Rivadavia", 589, "MDQ");
        Contacto c3 = new Contacto("Cecilia", "Peroni", LocalDate.of(2001, 12, 1), "347823647", d3, "bjkasd@gmail.com");

        Celular celular1 = new Celular("Samsung j7");

        //Agrega contactos
        celular1.addContacto(c1);
        celular1.addContacto(c2);
        celular1.addContacto(c3);
        celular1.addContacto(c4);

        //Muestra resumen
        System.out.println(celular1.getResumenContactos() + "\n");
        System.out.println(celular1.getListaContactosRepetidos());
    }
}