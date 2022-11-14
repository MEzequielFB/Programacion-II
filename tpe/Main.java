public class Main {
    public static void main(String[] args) { //Punto 4

        //Inciso a
        ComportamientoAddAscendente add_ascendente = new ComportamientoAddAscendente();
        ListaVinculada lista_numeros = new ListaVinculada(add_ascendente);
        lista_numeros.addNodo(10);
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
        System.out.println();
        ListaVinculada lista_strings = new ListaVinculada(add_ascendente);
        lista_strings.addNodo("facil");
        lista_strings.addNodo("es");
        lista_strings.addNodo("parcial");
        lista_strings.addNodo("prog 2");

        //Inciso e
        for (Nodo string : lista_strings) {
            System.out.println("String: " + string);
        }

        //Inciso f
        System.out.println();
        System.out.println("Posicion de la palabra 'parcial': " + lista_strings.getPosicionNodo("parcial"));

        //Inciso g
        System.out.println("Posicion de la palabra 'recuperatorio': " + lista_strings.getPosicionNodo("recuperatorio"));

        //inciso h
        System.out.println();
        ComportamientoAddDescendente add_descendente = new ComportamientoAddDescendente();
        lista_strings.setComportamientoAdd(add_descendente);
        for (Nodo string : lista_strings) {
            System.out.println("String: " + string);
        }

        //Inciso i
        System.out.println();
        Alumno alumno1 = new Alumno("john", "doe", "1200000", 74);
        Alumno alumno2 = new Alumno("federico", "lopez", "35999888", 27);
        Alumno alumno3 = new Alumno("juana", "garcia", "27123455", 37);
        Alumno alumno4 = new Alumno("mora", "diaz", "37124425", 25);
        Alumno alumno5 = new Alumno("flora", "rivas", "34555111", 28);
        Alumno alumno6 = new Alumno("martin", "gomez", "34111222", 29);
        Alumno alumno7 = new Alumno("roman", "bazan", "32555111", 32);
        Grupo grupo_unicen1 = new Grupo("unicen");
        Grupo grupo_unicen2 = new Grupo("exactas");
        Grupo grupo_unicen3 = new Grupo("humanas");
        Grupo grupo_unicen4 = new Grupo("historia");

        alumno1.addInteres("intercambio");

        alumno2.addInteres("redes");
        alumno2.addInteres("php");
        alumno2.addInteres("java");
        alumno2.addInteres("python");

        alumno3.addInteres("programacion");
        alumno3.addInteres("php");
        alumno3.addInteres("java");

        alumno4.addInteres("psicologia");
        alumno4.addInteres("freud");

        alumno5.addInteres("historia");
        alumno5.addInteres("antigua");

        alumno6.addInteres("romanos");
        alumno6.addInteres("egipcios");
        alumno6.addInteres("griegos");

        alumno7.addInteres("argentina");

        grupo_unicen4.addElemento(alumno5);
        grupo_unicen4.addElemento(alumno6);
        grupo_unicen4.addElemento(alumno7);

        grupo_unicen3.addElemento(alumno4);
        grupo_unicen3.addElemento(grupo_unicen4);

        grupo_unicen2.addElemento(alumno2);
        grupo_unicen2.addElemento(alumno3);

        grupo_unicen1.addElemento(alumno1);
        grupo_unicen1.addElemento(grupo_unicen2);
        grupo_unicen1.addElemento(grupo_unicen3);

        Alumno competidor1 = new Alumno("juan", "suarez", "33222444", 32);
        Alumno competidor2 = new Alumno("julio", "cesar", "33222111", 32);
        Alumno competidor3 = new Alumno("bernardino", "rivas", "30987654", 34);
        Alumno competidor4 = new Alumno("jose", "paso", "33322112", 33);
        Alumno competidor5 = new Alumno("isaac", "newton", "12343565", 73);
        Grupo grupo_olimpiadas1 = new Grupo("olimpiadas matematicas");
        Grupo grupo_olimpiadas2 = new Grupo("matea2");
        Grupo grupo_olimpiadas3 = new Grupo("losFibo");

        competidor1.addInteres("sucesiones");
        competidor1.addInteres("algebra");

        competidor2.addInteres("sucesiones");
        competidor2.addInteres("algebra");

        competidor3.addInteres("matematicas");

        competidor4.addInteres("problemas");

        competidor5.addInteres("sucesiones");

        grupo_olimpiadas3.addElemento(competidor3);
        grupo_olimpiadas3.addElemento(competidor4);
        grupo_olimpiadas3.addElemento(competidor5);

        grupo_olimpiadas2.addElemento(competidor1);
        grupo_olimpiadas2.addElemento(competidor2);

        grupo_olimpiadas1.addElemento(grupo_olimpiadas2);
        grupo_olimpiadas1.addElemento(grupo_olimpiadas3);

        ListaVinculada lista_estructuras = new ListaVinculada(add_descendente);
        lista_estructuras.addNodo(grupo_olimpiadas1);
        lista_estructuras.addNodo(grupo_unicen1);
        for (Nodo estructura : lista_estructuras) {
            System.out.println("Estructura: " + estructura);
        }
    }
}