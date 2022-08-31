public class Main {
    public static void main(String[] args) {
        
        Empleado e1 = new Empleado("Luis", 1000);
        Empleado e2 = new Empleado("Fernando", 1000);

        Persona p1 = new Persona("Julián", "36948104");
        Persona p2 = new Persona("Samuel", "40928482");

        Encuesta enc1 = new Encuesta(e1);
        Encuesta enc2 = new Encuesta(e1);
        Encuesta enc3 = new Encuesta(e2);

        Empresa empresa1 = new Empresa("Encuestas Company");

        //Agrega preguntas a las encuestas
        enc1.addPregunta("¿Qué te gusta de esto?");
        enc1.addPregunta("¿Qué te parece esto?");

        enc2.addPregunta("¿Esto está mal?");
        enc2.addPregunta("¿Qué haría si...?");

        enc3.addPregunta("Y si...?");

        //Agrega personas encuestadas
        enc1.addPersona(p1);
        enc1.addPersona(p1);
        enc1.addPersona(p2);

        enc2.addPersona(p1);

        enc3.addPersona(p1);
        enc3.addPersona(p2);

        //Agrega empleados a la empresa
        empresa1.addEmpleado(e1);
        empresa1.addEmpleado(e2);

        //Agrega encuestas a la empresa
        empresa1.addEncuesta(enc1);
        empresa1.addEncuesta(enc2);
        empresa1.addEncuesta(enc3);

        //Prints
        System.out.println(empresa1.toString() + "\n");
        System.out.println("Encuestas hechas por e1: " + e1.getCantEncuestasRealizadas());
        System.out.println("Sueldo de e1: " + empresa1.pagarSueldo(e1));
        System.out.println("Sueldo de e2: " + empresa1.pagarSueldo(e2));
    }
}