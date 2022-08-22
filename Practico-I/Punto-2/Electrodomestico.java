public class Electrodomestico {
    
    private String nombre;
    private double precio; //Pesos
    private String color;
    private double consumo; //Kw
    private double peso; //Kg

    public Electrodomestico(String nombre) {
        this(nombre, 100, "Gris plata", 10, 2);
    }

    public Electrodomestico(String nombre, double precio) {
        this(nombre, precio, "Gris plata", 10, 2);
    }

    public Electrodomestico(String nombre, double precio, String color) {
        this(nombre, precio, color, 10, 2);
    }

    public Electrodomestico(String nombre, double precio, String color, double consumo) {
        this(nombre, precio, color, consumo, 2);
    }

    public Electrodomestico(String nombre, double precio, String color, double consumo, double peso) {

        setNombre(nombre);
        setPrecio(precio);
        setColor(color);
        setConsumo(consumo);
        setPeso(peso);
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public double getConsumo() {
        return consumo;
    }

    public double getPeso() {
        return peso;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Funcionalidades
    public boolean esBajoConsumo() {
        double max_bajo_consumo = 45;
        return consumo < max_bajo_consumo;
    }

    public double getBalance() {
        return Math.round(precio / peso);
    }

    public boolean esAltaGama() {
        int min_alta_gama = 3;
        return getBalance() > min_alta_gama;
    }

    @Override
    public String toString() {
        return "Electrodomestico [nombre=" + nombre + ", precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + "]";
    }
}
