public class Main {
    public static void main(String[] args) {
        
        Nodo nodo_raiz = new Nodo(10);

        ComportamientoAddAscendente add_ascendente = new ComportamientoAddAscendente();
        ComportamientoAddDescendente add_descendente = new ComportamientoAddDescendente();

        ListaVinculada lista_vinculada1 = new ListaVinculada(nodo_raiz, add_ascendente);

        Nodo nodo1 = new Nodo(11);
        Nodo nodo2 = new Nodo(11);
        Nodo nodo3 = new Nodo(12);

        lista_vinculada1.addNodo(nodo1);
        lista_vinculada1.addNodo(nodo2);
        lista_vinculada1.addNodo(nodo3);
        /* lista_vinculada1.addNodo(10);
        lista_vinculada1.addNodo(11);
        lista_vinculada1.addNodo(11);
        lista_vinculada1.addNodo(12); */
        lista_vinculada1.imprimir();

        lista_vinculada1.removeNodoPorPosicion(0);
        lista_vinculada1.removeNodoPorNodo(nodo1);
        System.out.println();
        lista_vinculada1.imprimir();
        System.out.println("Posicion de nodo3: " + lista_vinculada1.getPosicionNodo(nodo3));
        System.out.println("Cantidad de nodos: " + lista_vinculada1.getCantidadNodos());
        System.out.println("Nodo por posicion: " + lista_vinculada1.getNodoPorPosicion(0));

        for (Nodo nodo : lista_vinculada1) {
            System.out.println("Nodo: " + nodo);
        }
        /* System.out.println(lista_vinculada1.getNodoPorPosicion(0).getSiguienteNodo());
        System.out.println(lista_vinculada1.getNodoPorPosicion(0).getAnteriorNodo()); */
        lista_vinculada1.setComportamientoAdd(add_descendente);
        lista_vinculada1.imprimir();

        Nodo nodo4 = new Nodo(14);
        Nodo nodo5 = new Nodo(9);
        lista_vinculada1.addNodo(nodo5);
        System.out.println();
        lista_vinculada1.imprimir();

        System.out.println();
        lista_vinculada1.setComportamientoAdd(add_ascendente);
        lista_vinculada1.addNodo(nodo4);
        lista_vinculada1.imprimir();

        /* Alumno alumno1 = new Alumno("esteban", "qatar", "41859294", 21);
        Alumno alumno2 = new Alumno("valentina", "cuba", "44849294", 19);
        Nodo nodo_alumno1 = new Nodo(alumno1);
        Nodo nodo_alumno2 = new Nodo(alumno2);
        ListaVinculada lista_vinculada2 = new ListaVinculada(nodo_alumno1, add_descendente); */
    }
}