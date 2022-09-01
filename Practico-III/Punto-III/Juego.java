import java.util.ArrayList;

public class Juego {

    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Juego(String nombre) {

        setNombre(nombre);
        this.jugadores = new ArrayList<>();
    }

    //Funcionalidades
    private void compararCartas() {
        
    }

    public void jugar() {

        int tamanioMazo = 0;

        for (Jugador jugador : this.jugadores) {

            tamanioMazo = jugador.getMazo().size(); //Si el tamanio de alguno de los mazos de todos los jugadores es distinto no se puede jugar
            for (int i = 0; i < jugadores.size()-1; i++) {

                if (tamanioMazo != this.jugadores.get(i+1).getMazo().size()) {

                    System.out.println("Distintos tamanios de mazo. No se puede jugar");
                    return;
                }
            }

            ArrayList<Carta> cartasAJugar = new ArrayList<>();
            for (Jugador j : this.jugadores) {

                int cartaIndex = (int) (Math.random() * tamanioMazo-1);

                cartasAJugar.add(j.getMazo().get(cartaIndex));
            }
            
        }
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