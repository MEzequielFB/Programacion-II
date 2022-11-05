public class Main {
    public static void main(String[] args) {
        
        Nodo nodo_raiz = new Nodo(10);

        ComportamientoAddAscendente add_ascendente = new ComportamientoAddAscendente();
        ComportamientoAddDescendente add_descendente = new ComportamientoAddDescendente();

        ListaVinculada lista_vinculada = new ListaVinculada(nodo_raiz, add_ascendente);

        Nodo nodo1 = new Nodo(11);
        Nodo nodo2 = new Nodo(11);
        Nodo nodo3 = new Nodo(12);

        lista_vinculada.addNodo(nodo1);
        lista_vinculada.addNodo(nodo2);
        lista_vinculada.addNodo(nodo3);
        /* lista_vinculada.addNodo(10);
        lista_vinculada.addNodo(11);
        lista_vinculada.addNodo(11);
        lista_vinculada.addNodo(12); */
        lista_vinculada.imprimir();

        /* lista_vinculada.removeNodoPorPosicion(0);
        lista_vinculada.removeNodoPorNodo(nodo1); */
        System.out.println();
        lista_vinculada.imprimir();
        System.out.println("Posicion de nodo3: " + lista_vinculada.getPosicionNodo(nodo3));
        System.out.println("Cantidad de nodos: " + lista_vinculada.getCantidadNodos());
        System.out.println("Nodo por posicion: " + lista_vinculada.getNodoPorPosicion(0));

        for (Nodo nodo : lista_vinculada) {
            System.out.println("Nodo: " + nodo);
        }

        lista_vinculada.setComportamientoAdd(add_descendente);
        lista_vinculada.imprimir();
    }
}