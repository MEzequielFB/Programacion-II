import java.util.ArrayList;

public class Jugador {
    
    public static final int CANT_CARTAS_REP_PERMITIDAS = 2;
    public static final int MAXIMO_CARTAS = 5;

    private String nombre;
    private int puntos;
    private ArrayList<Carta> mazo;

    public Jugador(String nombre) {

        setNombre(nombre);
        this.puntos = 0;
        this.mazo = new ArrayList<>();
    }

    //Funcionalidades
   /*  public void devolverCartasAlMazo() { //Setea el boolean 'jugada' de todas las cartas a 'false'

        for (Carta carta : this.mazo) {

            carta.devolverCartaAlMazo();
        }
    } */

    public Carta jugarCartaRandom() { //Setea como 'jugada=true' a la carta seleccionada dentro del mazo

        int numeroRandom = (int) (Math.random() * mazo.size());
        Carta cartaAJugar = mazo.get(numeroRandom);

        /* if (this.mazo.contains(cartaAJugar)) {

            cartaAJugar.jugarCarta();
        } */
        return cartaAJugar;
    }

    public void incrementPuntos() {
        this.puntos++;
    }

    public void removeCarta(Carta c) {

        if (this.mazo.contains(c)) {
            this.mazo.remove(c);
        }
    }

    //Puede haber una carta repetida de cada héroe
    //Máximo de cartas: 5
    public void addCarta(Carta c) {

        int cont = 0;
        

        for (Carta carta : this.mazo) {

            if (carta.equals(c)) {
                cont++;
            }
        }
        
        //Si no existe la carta en el mazo agrega la carta pasada como parámetro
        //Si existe un carta igual a la pasada por parámetro, se crea una nueva carta con los mismos valores
        //Se crea una nueva carta para que no se setee 'jugada=true' en ambas cartas al jugar una sola
        if (cont < CANT_CARTAS_REP_PERMITIDAS && this.mazo.size() < MAXIMO_CARTAS) {

            if (cont > 0) {

                Carta copiaCarta = new Carta(c.getNombreReal(), c.getNombreHeroe(), c.getEdad(), c.getPeso(), c.getAltura(), c.getFuerza(), c.getVelocidad(), c.getVisionNocturna());

                this.mazo.add(copiaCarta);
            } else {
                this.mazo.add(c);
            }
        }
    }

    //Getters
    public static int getMaximoCartas() {
        return MAXIMO_CARTAS;
    }

    public static int getCartasRepPermitidas() {
        return CANT_CARTAS_REP_PERMITIDAS;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", mazo=" + mazo + "]";
    }
}