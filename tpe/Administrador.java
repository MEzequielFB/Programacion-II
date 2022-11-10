public class Administrador {
    public static void main(String[] args) {

        //Inciso a
        Nodo nodo_raiz = new Nodo(10);
        ComportamientoAddAscendente add_ascendente = new ComportamientoAddAscendente();
        ListaVinculada lista_numeros = new ListaVinculada(nodo_raiz, add_ascendente);
        lista_numeros.addNodo(21);
        lista_numeros.addNodo(1);
        lista_numeros.addNodo(5);
        lista_numeros.addNodo(11);

        //Inciso b
        for (Nodo numero : lista_numeros) {
            System.out.println("Numero: " + numero);
        }

        //Inciso c
        System.out.println();
        lista_numeros.removeNodoPorPosicion(0);
        lista_numeros.removeNodoPorValor(5);
        lista_numeros.removeNodoPorValor(11);

        for (Nodo numero : lista_numeros) {
            System.out.println("Numero: " + numero);
        }

        //Inciso d
        
    }
}