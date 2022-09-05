public class Direccion {
    
    private String calle;
    private int altura;
    private String ciudad;

    public Direccion(String calle, int altura, String ciudad) {

        this.calle = calle;
        this.altura = altura;
        this.ciudad = ciudad;
    }

    //Getters
    public String getCalle() {
        return calle;
    }

    public int getAltura() {
        return altura;
    }

    public String getCiudad() {
        return ciudad;
    }

    //Setters
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}