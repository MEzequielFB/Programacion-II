public class Main {
    public static void main(String[] args) {
        
        Nodo nodo3 = new Nodo(3, null, null); //Nodos izquierda de la raiz
        Nodo nodo2 = new Nodo(4, nodo3, null);

        Nodo nodo4 = new Nodo(6, null, null); //Nodos derecha de la raiz

        Nodo nodo_raiz = new Nodo(5, nodo2, nodo4);

        ComportamientoImprimir comportamiento_imprimir = new ComportamientoImprimir();
        ComportamientoAddAsc comportamiento_add_asc = new ComportamientoAddAsc();
        ComportamientoAddDesc comportamiento_add_desc = new ComportamientoAddDesc();

        nodo_raiz.recorrer(comportamiento_imprimir);
        
        nodo_raiz.recorrer(comportamiento_add_asc);
        System.out.println(comportamiento_add_asc.getLista());

        nodo_raiz.recorrer(comportamiento_add_desc);
        System.out.println(comportamiento_add_desc.getLista());
    }
}