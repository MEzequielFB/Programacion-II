public class Main {
    public static void main(String[] args) {

        Proceso p1 = new Proceso(5);
        Proceso p2 = new Proceso(20);
        Proceso p3 = new Proceso(15);

        Computadora c1 = new Computadora();
        Computadora c2 = new Computadora();

        ColaDeProcesosPorMemoria cola1 = new ColaDeProcesosPorMemoria();

        CentroComputos centro_computos1 = new CentroComputos(cola1);

        centro_computos1.addComputadora(c1);
        centro_computos1.addComputadora(c2);

        centro_computos1.addProceso(p1);
        centro_computos1.addProceso(p2);
        centro_computos1.addProceso(p3);

        System.out.println(centro_computos1 + "\n");
        centro_computos1.ejecutarProcesos();
        System.out.println(centro_computos1);
    }
}