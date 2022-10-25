public class Main {
    public static void main(String[] args) {

        Nodo nodo_raiz = new Nodo();

        Arbol arbol = new Arbol(nodo_raiz);

        ComportamientoImprimir comportamiento_imprimir = new ComportamientoImprimir();
        ComportamientoAddAsc comportamiento_add_asc = new ComportamientoAddAsc();
        ComportamientoAddDesc comportamiento_add_desc = new ComportamientoAddDesc();
        ComportamientoCantidadNodos comportamiento_cantidad_nodos = new ComportamientoCantidadNodos();

        arbol.addNodo(7);
        arbol.addNodo(4);
        arbol.addNodo(12);
        arbol.addNodo(5);
        arbol.addNodo(9);

        arbol.recorrer(comportamiento_imprimir);
        
        arbol.recorrer(comportamiento_add_asc);
        System.out.println("Ascendente: " + comportamiento_add_asc.getLista());

        arbol.recorrer(comportamiento_add_desc);
        System.out.println("Descendente: " + comportamiento_add_desc.getLista());

        arbol.recorrer(comportamiento_cantidad_nodos);
        System.out.println("Cantidad de nodos recorridos: " + comportamiento_cantidad_nodos.getCantidadNodos());
    }
}