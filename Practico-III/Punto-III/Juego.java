import java.util.ArrayList;

public class Juego {

    //public static final int CANT_RONDAS = 5;
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Juego(String nombre) {

        setNombre(nombre);
        this.jugadores = new ArrayList<>();
    }

    //Funcionalidades
    private Jugador getGanador() { //Obtiene al ganador del juego. Devuelve null si hay empate

        Jugador ganador = null;
        for (int i = 0; i < this.jugadores.size()-1; i++) {

            if (this.jugadores.get(i).getPuntos() > this.jugadores.get(i+1).getPuntos()) {

                ganador = this.jugadores.get(i);
            } else if (this.jugadores.get(i).getPuntos() < this.jugadores.get(i+1).getPuntos()) {

                ganador = this.jugadores.get(i+1);
            }
        }
        return ganador;
    }

    private boolean compararAtributoCartas(int numero , Carta c1, Carta c2) {

        switch(numero) {
            case 0: {
                System.out.println("Fuerza");
                return c1.esMasFuerte(c2);
            }
            case 1: {
                System.out.println("Velocidad");
                return c1.esMasRapido(c2);
            }
            case 2: {
                System.out.println("Visión nocturna");
                return c1.tieneMejorVisionNocturna(c2);
            }
            default: {
                return false;
            }
        }
    }

    private void incrementPuntos(ArrayList<Carta> cartas) {

        int index = -1;
        int numeroRandom = (int) (Math.random() * 3);

        for (int i = 0; i < cartas.size()-1; i++) {

            if (compararAtributoCartas(numeroRandom, cartas.get(i), cartas.get(i+1))) {

                index = i;
            } else if (compararAtributoCartas(numeroRandom, cartas.get(i+1), cartas.get(i))) {

                index = i + 1;
            }
        }
        if (index != -1) {

            jugadores.get(index).incrementPuntos();
        }
    }

    private boolean tienenMismaCantDeCartas() { //Devuelve true si todos los jugadores tienen la misma cantidad de cartas en el mazo

        for (int i = 0; i < this.jugadores.size()-1; i++) { 

            if (this.jugadores.get(i).getMazo().size() != this.jugadores.get(i+1).getMazo().size()) {
                return false;
            }
        }
        return true;
    }

    private int getCantRondas() {
        return this.jugadores.get(0).getMazo().size();
    }

    public Jugador jugar() {

        Jugador ganador = null;
        ArrayList<Carta> cartasAComparar = new ArrayList<>();
        
        if (this.tienenMismaCantDeCartas()) { //Verifica que todos los jugadores tengan la misma cantidad de cartas

            int cantRondas = this.getCantRondas(); //Obtiene la cantidad de rondas (cantidad de cartas de jugador)

            for (int i = 0; i < cantRondas; i++) { //Se juegan las rondas

                cartasAComparar.clear(); //Vacía la lista para la próxima ronda
                for (Jugador jugador : this.jugadores) { //Cada jugador juega una carta random y se agrega a la lista de cartas a jugar

                    Carta cartaJugada = jugador.jugarCartaRandom();
                    cartasAComparar.add(cartaJugada);
                }
        
                System.out.println(cartasAComparar.get(0).getNombreHeroe() + " vs " + cartasAComparar.get(1).getNombreHeroe());

                this.incrementPuntos(cartasAComparar); //Compara las cartas jugadas e incrementa los puntos al jugador con la carta ganadora
            }
            ganador = this.getGanador(); //Obtiene al ganador
        }
        return ganador; //Devuelve al ganador
    }

    public void removeJugador(Jugador j) {

        if (this.jugadores.contains(j)) {
            this.jugadores.remove(j);
        }
    }

    public void addJugador(Jugador j) {

        if (!this.jugadores.contains(j)) {
            this.jugadores.add(j);
        }
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Juego [nombre=" + nombre + ", jugadores=" + jugadores + "]";
    }
}