public class Luz {
    
    private String color;
    private boolean estaEncendido;

    public Luz(String color) {

        this.color = color;
        this.estaEncendido = false;
    }

    //Funcionalidades
    public void encender() {
        this.estaEncendido = true;
    }

    public void apagar() {
        this.estaEncendido = false;
    }

    //Getters
    public String getColor() {
        return color;
    }

    public boolean estaEncendido() {
        return estaEncendido;
    }

    //Setters
    public void setColor(String color) {
        this.color = color;
    }
}