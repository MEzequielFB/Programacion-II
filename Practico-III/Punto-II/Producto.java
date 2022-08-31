public class Producto {
    
    private String tipo;
    private double peso;
    private String madera;
    private String color;
    private double costoFabricacion;
    private int stock;
    private int cantVentas;
    private double porcentajeVenta;

    public Producto(String tipo, double peso, String madera, String color, double costoFabricacion) {

        this.tipo = tipo;
        this.peso = peso;
        this.madera = madera;
        this.color = color;
        this.costoFabricacion = costoFabricacion;
        this.stock = 0;
        this.cantVentas = 0;
        this.porcentajeVenta = 35;
    }

    //Funcionalidades
    public void removeVentas(int valor) {
        this.cantVentas -= valor;
    }

    public void addVentas(int valor) {
        this.cantVentas += valor;
    }

    public void removeStock(int valor) {
        this.stock -= valor;
    }

    public void addStock(int valor) {
        this.stock += valor;
    }

    public double getValorVenta() {
        return costoFabricacion * (1 + (porcentajeVenta / 100));
    }

    public double getGanancia() {
        return getValorVenta() - costoFabricacion;
    }

    //Getters
    public String getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }

    public String getMadera() {
        return madera;
    }

    public String getColor() {
        return color;
    }

    public double getCostoFabricacion() {
        return costoFabricacion;
    }

    public int getStock() {
        return stock;
    }

    public int getCantVentas() {
        return cantVentas;
    }

    //Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setMadera(String madera) {
        this.madera = madera;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCostoFabricacion(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }

    public void setPorcetanjeVenta(double porcentajeVenta) {
        this.porcentajeVenta = porcentajeVenta;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {

        Producto objetoParam = (Producto) o;

        if (this.tipo == objetoParam.getTipo() && this.color == objetoParam.getColor() && this.madera == objetoParam.getMadera() && this.peso == objetoParam.getPeso()) {
            return true;
        }
        return false;
    }
}