public class Main {
    public static void main(String[] args) {

        PilaDeElementos p1 = new PilaDeElementos();

        String s1 = "Hola";
        String s2 = "Adios";
        String s3 = "Como estas";

        p1.push(s1);
        p1.push(s2);

        System.out.println(p1);
        System.out.println("Último elemento de la pila: " + p1.top());
        System.out.println("Elemento eliminado: " + p1.pop());
        System.out.println(p1);
        System.out.println("Último elemento de la pila: " + p1.top());
        System.out.println("Elemento eliminado: " + p1.pop());
        System.out.println("Cantidad de elementos almacenados: " + p1.size());

        System.out.println("Elemento eliminado: " + p1.pop());
        System.out.println("Elemento eliminado: " + p1.pop());
        System.out.println("Último elemento de la pila: " + p1.top());

        p1.push(s3);
        p1.push(s2);
        p1.push(s2);
        System.out.println(p1);

        PilaDeElementos copiaPila = p1.copy();
        System.out.println("Copia: " + copiaPila);

        copiaPila.push(s1);
        System.out.println(p1);
        System.out.println("Copia: " + copiaPila);
        System.out.println("Elemento eliminado: " + copiaPila.pop());
        System.out.println("Elemento eliminado: " + copiaPila.pop());

        PilaDeElementos copiaPilaInvertida = p1.reverse();
        System.out.println(p1);
        System.out.println("Copia invertida: " + copiaPilaInvertida);
    }
}