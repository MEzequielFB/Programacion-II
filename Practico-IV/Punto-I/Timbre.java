public class Timbre {
    
    private boolean estaSonando;

    public Timbre() {

        this.estaSonando = false;
    }

    //Funcionalidades
    public void hacerSonar() {
        this.estaSonando = true;
    }

    public void parar() {
        this.estaSonando = false;
    }

    //Getters
    public boolean estaSonando() {
        return estaSonando;
    }
}