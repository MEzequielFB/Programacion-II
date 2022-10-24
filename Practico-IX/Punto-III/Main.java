import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        TareaSimple tarea_simple1 = new TareaSimple("comprar pintura", LocalDate.of(2022, 10, 22), LocalDate.of(2022, 10, 23));
        TareaSimple tarea_simple2 = new TareaSimple("comprar lijas", LocalDate.of(2022, 10, 26), LocalDate.of(2022, 10, 26));

        TareaSimple tarea_simple3 = new TareaSimple("pintar el cuarto", LocalDate.of(2022, 10, 23), LocalDate.of(2022, 10, 23));

        TareaSimple tarea_simple4 = new TareaSimple("armar mesa", LocalDate.of(2022, 10, 10), LocalDate.of(2022, 10, 21));

        TareaCompuesta tarea_compuesta1 = new TareaCompuesta("preparar materiales");

        RecursoExclusivo recurso_exclusivo1 = new RecursoExclusivo("jorge", LocalDate.of(2022, 11, 4));
        RecursoExclusivo recurso_exclusivo2 = new RecursoExclusivo("destornillador", LocalDate.of(2022, 10, 13));
        RecursoCompartido recurso_compartido1 = new RecursoCompartido("marcelo");
        RecursoCompartido recurso_compartido2 = new RecursoCompartido("luis");

        tarea_simple2.addRecurso(recurso_exclusivo1);

        tarea_simple1.addRecurso(recurso_compartido1);
        tarea_simple3.addRecurso(recurso_compartido1);

        tarea_compuesta1.addRecurso(recurso_compartido2);

        tarea_compuesta1.addTarea(tarea_simple1);
        tarea_compuesta1.addTarea(tarea_simple2);

        Sistema sistema1 = new Sistema();
        sistema1.addTarea(tarea_compuesta1);
        sistema1.addTarea(tarea_simple3);
        sistema1.addTarea(tarea_simple4);

        tarea_simple2.setFechaInicioReal(LocalDate.of(2022, 10, 26));
        tarea_simple2.setFechaFinalizacionReal(LocalDate.of(2022, 10, 26));
        tarea_simple1.setFechaFinalizacionReal(LocalDate.of(2022, 10, 26));

        //Pruebas
        System.out.println("Fecha inicio real de tarea_compuesta1: " + tarea_compuesta1.getFechaInicioReal());
        System.out.println("Fecha finalizacion real de tarea_compuesta1: " + tarea_compuesta1.getFechaFinalizacionEstimada());
        System.out.println("Estado tarea_compuesta1: " + tarea_compuesta1.getEstado());

        //Inciso 1
        System.out.println("\nTareas atrasadas: " + sistema1.getTareasAtrasadas());

        //Inciso 2
        System.out.println("\nTareas que usan el recurso_exclusivo1: " + sistema1.getTareasPorRecurso(recurso_exclusivo1));
        System.out.println("Tareas que usan el recurso_compartido1: " + sistema1.getTareasPorRecurso(recurso_compartido1));
        System.out.println("Tareas que usan el recurso_compartido2: " + sistema1.getTareasPorRecurso(recurso_compartido2));

        //Inciso 3
        System.out.println("\nRecursos usados en tarea_compuesta1: " + sistema1.getRecursosPorTarea(tarea_compuesta1));
        System.out.println("Recursos usados en tarea_simple3: " + sistema1.getRecursosPorTarea(tarea_simple3));

        //Inciso 4
        System.out.println("\nDuracion estimada de tarea_simple4: " + sistema1.getDuracionEstimadaPorTarea(tarea_simple4) + " dias");

        //Inciso 5
        System.out.println("\nSe puede agregar recurso_exclusivo1 a tarea_simple4: " + sistema1.sePuedeAgregarRecurso(recurso_exclusivo1, tarea_simple4));
        System.out.println("Se puede agregar recurso_compartido1 a tarea_simple4: " + sistema1.sePuedeAgregarRecurso(recurso_compartido1, tarea_simple4));
        System.out.println("Se puede agregar recurso_exclusivo2 a tarea_simple4: " + sistema1.sePuedeAgregarRecurso(recurso_exclusivo2, tarea_simple4));
    }
}