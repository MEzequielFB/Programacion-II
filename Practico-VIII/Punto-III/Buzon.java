import java.util.ArrayList;

public class Buzon extends ElementoNavidad {

    private ArrayList<Ninio> ninios_buenos;
    private ArrayList<Carta> cartas;

    public Buzon() {
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

        this.cartas.add(carta);
        if (!this.ninios_buenos.contains(carta.getRemitente())) {
            carta.vaciarCarta();
            carta.addRegalo("trozo de carbon");
        }
    }

    //Getters
    @Override
    public ArrayList<Carta> getCartasValidas() {

        ArrayList<Carta> cartas_validas = new ArrayList<>();
        for (Carta carta : this.cartas) {

            if (this.ninios_buenos.contains(carta.getRemitente()) && !cartas_validas.contains(carta)) {
                cartas_validas.add(carta);
            }
        }
        return cartas_validas;
    }

    @Override
    public int getCantidadCartasPorRegalo(String regalo) {
        
        int contador = 0;
        for (Carta carta : this.cartas) {
            if (carta.contieneRegalo(regalo)) {
                contador++;
            }
        }
        return contador;
    }
    @Override
    public double getPorcentajeCartasPorRegalo(String regalo) {
        return ((double) this.getCantidadCartasPorRegalo(regalo) / (double) this.cartas.size()) * 100.0;
    }

    @Override
    public int getCantidadNiniosMalos() { //Se hace con una lista porque un ninio puede tener varias cartas, y asi se evita que se cuente mas de una vez a un ninio malo
        
        ArrayList<Ninio> ninios_malos = new ArrayList<>();
        for (Carta carta : this.cartas) {
            Ninio ninio = carta.getRemitente();
            if (!this.ninios_buenos.contains(ninio) && !ninios_malos.contains(ninio)) {
                ninios_malos.add(ninio);
            }
        }
        return ninios_malos.size();
    }

    @Override
    public int getCantCartasRecibidas() {
        return this.cartas.size();
    }

    @Override
    public String toString() {
        return this.ninios_buenos + ", " + this.cartas;
    }
}