public class Administrador {
    public static void main(String[] args) {

        Nodo nodo_raiz = new Nodo(10);
        ComportamientoAddAscendente add_ascendente = new ComportamientoAddAscendente();
        ListaVinculada lista_numeros = new ListaVinculada(nodo_raiz, add_ascendente);
        lista_numeros.addNodo(21);
        lista_numeros.addNodo(1);
        lista_numeros.addNodo(5);
        lista_numeros.addNodo(11);
        for (Nodo numero : lista_numeros) {
            System.out.println("Numero: " + numero);
        }
    }
}