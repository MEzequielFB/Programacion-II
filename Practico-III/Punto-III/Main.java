public class Main {
    public static void main(String[] args) {

        Carta c1 = new Carta("Marcelo", "Speedman", 30, 60, 1.68, 200, 600, 300);
        Carta c2 = new Carta("Luciana", "Superwoman", 21, 75, 1.72, 600, 400, 100);
        Carta c3 = new Carta("Tomás", "Sneaky Boy", 16, 55, 1.65, 100, 400, 600);

        Jugador j1 = new Jugador("Esteban");
        Jugador j2 = new Jugador("Sofía");

        Juego juego1 = new Juego("Magic Heroe");

        //Agrega cartas a los mazos
        j1.addCarta(c1); //Speedmans
        j1.addCarta(c1);
        j1.addCarta(c2); //Superwoman

        j2.addCarta(c1); //Speedman
        j2.addCarta(c2); //Superwoman
        j2.addCarta(c3); //Sneaky Boy

        //Agrega jugadores al juego
        juego1.addJugador(j1);
        juego1.addJugador(j2);

        //Prints
        System.out.println(juego1);
    }
}