public class Main {
    public static void main(String[] args) {

        PilaDeElementos p1 = new PilaDeElementos();

        String s1 = "Hola";
        String s2 = "Adios";

        p1.push(s1);
        p1.push(s2);

        System.out.println(p1);
        System.out.println("Elemento eliminado: " + p1.pop());
        System.out.println(p1);
        System.out.println("Elemento eliminado: " + p1.pop());
        System.out.println(p1.size());
        /* System.out.println("Elemento eliminado: " + p1.pop()); */
        /* System.out.println("Último elemento de la pila: " + p1.top()); */
    }
}