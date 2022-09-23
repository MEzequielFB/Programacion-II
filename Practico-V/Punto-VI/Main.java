public class Main {
    public static void main(String[] args) {

        Trabajo t1 = new Trabajo("Articulo");
        TrabajoPoster t2 = new TrabajoPoster();

        Evaluador e1 = new Evaluador("Jerónimo");
        Evaluador e2 = new Evaluador("Manuel");

        Comite comite1 = new Comite();

        t1.addTema("java");
        t1.addTema("agentes");

        t2.addTema("javascript");
        t2.addTema("html");

        e1.addTema("java");
        e1.addTema("agentes");

        e2.addTema("javascript");
        e2.addTema("java");
        e2.addTema("agentes");

        comite1.addTrabajo(t1);
        comite1.addTrabajo(t2);

        comite1.addEvaluador(e1);
        comite1.addEvaluador(e2);

        comite1.addTemaExperto("agentes");
        System.out.println("Evaluadores aptos para t1: " + comite1.evaluadoresAptos(t1));
        System.out.println("Evaluadores aptos para t2: " + comite1.evaluadoresAptos(t2));
        System.out.println();
        System.out.println("Trabajos asignables para e1: " + comite1.evaluadorEsApto(e1));
        System.out.println("Trabajos asignables para e2: " + comite1.evaluadorEsApto(e2));
        System.out.println();
        comite1.asignarTrabajo(e1, t1);
        comite1.asignarTrabajo(e1, t2);

        comite1.asignarTrabajo(e2, t1);
        comite1.asignarTrabajo(e2, t2);
        System.out.println("Cantidad de trabajos de e1: " + comite1.getCantidadTrabajosDeEvaluador(e1));
        System.out.println("Cantidad de trabajos de e2: " + comite1.getCantidadTrabajosDeEvaluador(e2));
        System.out.println();

        System.out.println("e1 es experto: " + comite1.evaluadorEsExperto(e1));
        System.out.println("e2 es experto: " + comite1.evaluadorEsExperto(e2));
    }
}