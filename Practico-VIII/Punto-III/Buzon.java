import java.util.ArrayList;

public class Buzon { //Como hacer el buzon especial?
    
    private Barrio barrio;
    private ArrayList<Ninio> ninios_buenos;
    private ArrayList<Carta> cartas;

    public Buzon() {
        this.barrio= null;
        this.ninios_buenos = new ArrayList<>();
        this.cartas = new ArrayList<>();
    }

    //Funcionalidades
    public void addNinioBueno(Ninio ninio){

        if (!this.ninios_buenos.contains(ninio)) {
            this.ninios_buenos.add(ninio);
        }
    }

    public void addCarta(Carta carta) { //Si el barrio del remitente y del buzon son el mismo se agrega. Si el remitente no está dentro de la lista de ninios buenos se vacia la carta y los regalos se reemplazan por 'trozo de carbon'

        if (carta.getRemitente().getBarrio().equals(this.barrio)) {
            this.cartas.add(carta);
            if (!this.ninios_buenos.contains(carta.getRemitente())) {
                carta.vaciarCarta();
                carta.addRegalo("trozo de carbon");
            }
        }
    }

    //Getters
    public ArrayList<Carta> getCartasValidas() {

        ArrayList<Carta> cartas_validas = new ArrayList<>();
        for (Carta carta : this.cartas) {

            if (this.ninios_buenos.contains(carta.getRemitente()) && !cartas_validas.contains(carta)) {
                cartas_validas.add(carta);
            }
        }
        return cartas_validas;
    }

    public Barrio getBarrio() {
        return this.barrio;
    }

    //Setters
    public void setBarrio(Barrio barrio) {

        if (this.barrio == null) {

            this.barrio = barrio;
            barrio.setBuzon(this);
        }
    }

    @Override
    public boolean equals(Object o) {

        try {
            Buzon otroBuzon = (Buzon) o;
            return this.getBarrio().equals(otroBuzon.getBarrio());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.barrio + ", " + this.ninios_buenos + ", " + this.cartas;
    }
}