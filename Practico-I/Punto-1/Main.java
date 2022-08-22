import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Hola mundo");
        System.out.println("Este es el primer práctico");

        Persona p1 = new Persona(40752921, "Sebastián", "Guzmán");

        p1.setFechaNac(LocalDate.of(1998, 2, 15));
        System.out.println("Edad de " + p1.getNombre() + ": " + p1.getEdad());

        //Calcular índice de masa muscular
        p1.setPeso(58);
        p1.setAltura(1.65);
        System.out.println("IMC de " + p1.getNombre() + ": " + p1.getImc());

        //Indicar si está en forma
        System.out.println("Está en forma? " + p1.getEstadoImc());

        //Indicar si cumple anios
        System.out.println("Es su cumpleanios? " + p1.cumpliendo_anios());

        //Indicar si es mayor de edad
        System.out.println("Es mayor de edad? " + p1.esMayor());

        //Indicar si puede votar
        System.out.println("Puede votar? " + p1.puedeVotar());

        System.out.println(p1.toString());
    }
}