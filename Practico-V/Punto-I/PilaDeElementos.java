public class PilaDeElementos {
 
    private Object [] elementos;
    private int ultimaPos;

    public PilaDeElementos() {

        this.elementos = new Object[1];
        this.ultimaPos = this.elementos.length - 1;
    }

    //Funcionalidades
    public int size() {
        return this.elementos.length;
    }

    private void disminuirPila() {

        /* if (this.ultimaPos > 0) { */

            Object [] nuevaPila = new Object[this.elementos.length - 1];
            for (int i = 0; i < nuevaPila.length; i++) {

                nuevaPila[i] = this.elementos[i];
            }
            this.actualizarAtributos(nuevaPila);
        /* } else {

            this.elementos[this.ultimaPos] = null;
        } */
    }

    public Object top() {

        /* if (this.elementos[this.ultimaPos] != null) { */
        
            return this.elementos[this.ultimaPos];
        /* }
        return null; */
    }

    public Object pop() {

        Object ultimoElemento = this.top();
        this.disminuirPila();

        return ultimoElemento;
    }

    private void actualizarAtributos(Object [] pila) {

        this.elementos = pila;
        this.setUltimaPos();
    }

    private void expandirPila() {

        Object [] nuevaPila = new Object[this.elementos.length + 1];
        for (int i = 0; i < this.elementos.length; i++) {

            nuevaPila[i] = this.elementos[i];
        }
        this.actualizarAtributos(nuevaPila);
    }

    private boolean hayEspacio() {
        return this.elementos[this.ultimaPos] == null;
    }

    public void push(Object o) {
        
        if (hayEspacio()) {

            this.elementos[this.ultimaPos] = o;
        } else {

            this.expandirPila();
            this.elementos[this.ultimaPos] = o;
        }
    }

    private String getElementos() {

        String elementos = "";
        for (Object elemento : this.elementos) {

            elementos += elemento + ", ";
        }
        return elementos;
    }

    //Setters
    private void setUltimaPos() {

        if (this.elementos.length >= 1) {

            this.ultimaPos = this.elementos.length - 1;
        }
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[" + this.getElementos() + "]";
    }
}