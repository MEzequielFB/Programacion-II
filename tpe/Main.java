public class Main {
    public static void main(String[] args) {
        
        Nodo nodo_raiz = new Nodo(10);
        ComportamientoAddAscendente add_ascendente = new ComportamientoAddAscendente();
        ListaVinculada lista_vinculada = new ListaVinculada(nodo_raiz, add_ascendente);

        lista_vinculada.addNodo(11);
        lista_vinculada.addNodo(11);
        lista_vinculada.addNodo(12);
        lista_vinculada.imprimir();

        lista_vinculada.removeNodoPorPosicion(0);
        lista_vinculada.removeNodoPorObjetoComparable(11);
        System.out.println();
        lista_vinculada.imprimir();
    }
}