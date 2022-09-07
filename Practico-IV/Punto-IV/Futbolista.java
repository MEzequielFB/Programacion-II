import java.time.LocalDate;

public class Futbolista extends Integrante {
    
    private String posicion;
    private char pie_habil;
    private int cant_goles;

    public Futbolista(String nombre, String apellido, LocalDate fecha_nacimiento, String posicion, char pie_habil) {

        super(nombre, apellido, fecha_nacimiento);
        this.posicion = posicion;
        this.pie_habil = pie_habil;
        this.cant_goles = 0;
    }

    //Funcionalidades
    public void IncrementCantGoles(int cant_goles) {
        this.cant_goles += cant_goles;
    }

    //Getters
    public String getPosicion() {
        return posicion;
    }

    public char getPieHabil() {
        return pie_habil;
    }

    public int getGoles() {
        return cant_goles;
    }

    //Setters
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setPieHabil(char pie_habil) {
        this.pie_habil = pie_habil;
    }
}