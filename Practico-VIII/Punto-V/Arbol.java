public class Arbol {
    
    private Nodo nodo_raiz;

    public Arbol(Nodo nodo_raiz) {
        this.nodo_raiz = nodo_raiz;
    }

    //Funcionalidades
    public void recorrer(AccionEjecutable accion_ejecutable) { 
        this.nodo_raiz.recorrer(accion_ejecutable);
    }

    public void addNodo(Comparable valor) {
        this.nodo_raiz.addNodo(valor);
    }

    //Getters
    public Nodo getNodoRaiz() {
        return this.nodo_raiz;
    }
}