import java.util.ArrayList;

public class Sistema {
    
    private ArrayList<Buzon> buzones;
    private ArrayList<Carta> cartas_guardadas;

    public Sistema() {
        this.buzones = new ArrayList<>();
        this.cartas_guardadas = new ArrayList<>();
    }

    //Funcionalidades
    public void guardarCartas() {

        for (Buzon buzon : this.buzones) {
            this.cartas_guardadas.addAll(buzon.getCartasValidas());
        }
    }

    public void addBuzon(Buzon buzon) {

        if (!this.buzones.contains(buzon)) {
            this.buzones.add(buzon);
        }
    }
}