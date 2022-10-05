public class Ficha {

    private String nombre;
    private int fortaleza;
    private int tamanio;
    private int poder_destruccion;

    public Ficha(String nombre, int fortaleza, int tamanio, int poder_destruccion) {

        this.nombre = nombre;
        this.fortaleza = fortaleza;
        this.tamanio = tamanio;
        this.poder_destruccion = poder_destruccion;
    }
    public Ficha(String nombre, int fortaleza, int tamanio) {

        this.nombre = nombre;
        this.fortaleza = fortaleza;
        this.tamanio = tamanio;
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public int getFortaleza() {
        return this.fortaleza;
    }

    public int getTamanio() {
        return this.tamanio;
    }

    public int getPoderDestruccion() {
        return this.poder_destruccion;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Ficha otraFicha = (Ficha) o;
            return this.getNombre().equalsIgnoreCase(otraFicha.getNombre());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Ficha [nombre=" + nombre + "]";
    }
}