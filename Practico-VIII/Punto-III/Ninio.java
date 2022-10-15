import java.util.ArrayList;

public class Ninio {
    
    private String nombre;
    private String dni;
    private Barrio barrio;
    private ArrayList<Carta> cartas;

    public Ninio(String nombre, String dni, Barrio barrio) {

        this.nombre = nombre;
        this.dni = dni;
        this.barrio = barrio;
        this.cartas = new ArrayList<>();
    }

    //Funcionalidades
    public void addCarta(Carta carta) {
        this.cartas.add(carta);
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public Barrio getBarrio() {
        return this.barrio;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Ninio otroNinio = (Ninio) o;
            return this.getDni().equalsIgnoreCase(otroNinio.getDni());
        }
        catch(Exception exc) {
            return false;
        }
    }
}