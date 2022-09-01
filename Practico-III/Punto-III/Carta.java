public class Carta {
    
    private String nombreReal;
    private String nombreHeroe;
    private int edad;
    private double peso;
    private double altura;
    private int fuerza;
    private int velocidad;
    private int visionNocturna;
    private boolean jugada;
    
    public Carta(String nombreReal, String nombreHeroe, int edad, double peso, double altura, int fuerza, int velocidad, int visionNocturna) {

        setNombreReal(nombreReal);
        setNombreHeroe(nombreHeroe);
        setEdad(edad);
        setPeso(peso);
        setAltura(altura);
        setFuerza(fuerza);
        setVelocidad(velocidad);
        setVisionNocturna(visionNocturna);
        this.jugada = false;
    }

    //Funcionalidades
    public void devolverCartaAlMazo() {
        this.jugada = false;
    }

    public void jugarCarta() {
        this.jugada = true;
    }

    //Getters
    public String getNombreReal() {
        return nombreReal;
    }

    public String getNombreHeroe() {
        return nombreHeroe;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getVisionNocturna() {
        return visionNocturna;
    }

    public boolean getJugada() {
        return jugada;
    }

    //Setters
    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public void setNombreHeroe(String nombreHeroe) {
        this.nombreHeroe = nombreHeroe;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setVisionNocturna(int visionNocturna) {
        this.visionNocturna = visionNocturna;
    }

    /* public void setJugada(boolean jugada) {
        this.jugada = jugada;
    } */

    @Override
    public String toString() {
        return "Carta [heroe=" + nombreHeroe + "]";
    }
}