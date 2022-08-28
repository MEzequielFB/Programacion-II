public class Main {
    public static void main(String[] args) {
        
        Empleado e1 = new Empleado("Luis", 1000);

        Persona p1 = new Persona("Julián", "36948104");
        Persona p2 = new Persona("Samuel", "40928482");

        Encuesta enc1 = new Encuesta(e1);
        Encuesta enc2 = new Encuesta(e1);

        Empresa empresa1 = new Empresa("Encuestas Company");

        //Agrega preguntas a las encuestas
        enc1.addPregunta("¿Qué te gusta de esto?");
        enc1.addPregunta("¿Qué te parece esto?");

        enc2.addPregunta("¿Esto está mal?");
        enc2.addPregunta("¿Qué haría si...?");

        //Agrega personas encuestadas
        enc1.addPersona(p1);
        enc1.addPersona(p1);
        enc1.addPersona(p2);

        enc2.addPersona(p1);

        //Agrega empleados a la empresa
        empresa1.addEmpleado(e1);

        //Agrega encuestas a la empresa
        empresa1.addEncuesta(enc1);
        empresa1.addEncuesta(enc2);

        //Prints
        System.out.println(empresa1.toString());
        System.out.println("Encuestas hechas por e1: " + e1.getCantEncuestasRealizadas());
    }
}