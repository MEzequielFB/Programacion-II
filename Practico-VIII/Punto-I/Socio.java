import java.util.ArrayList;

public class Socio {
    
    private static int _edad_mayor = 18;
    private String nombre;
    private String apellido;
    private int edad;
    private boolean ultima_cuota_paga;
    private ArrayList<Alquiler> alquileres;

    public Socio(String nombre, String apellido, int edad, boolean ultima_cuota_paga) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ultima_cuota_paga = ultima_cuota_paga;
        this.alquileres = new ArrayList<>();
    }

    //Funcionalidades
    public boolean pagoMinimoPrecioPorAlquiler(double precio_minimo) {

        for (Alquiler alquiler : this.alquileres) {

            if (alquiler.getPrecio() > precio_minimo) {
                return true;
            }
        }
        return false;
    }

    public int getCantVecesAlquiloCancha(Cancha cancha) {

        int contador = 0;
        for (Alquiler alquiler : this.alquileres) {

            if (alquiler.getCancha().equals(cancha)) {
                contador++;
            }
        }
        return contador;
    }

    public boolean alquiloCancha(Cancha cancha) {
        
        for (Alquiler alquiler : this.alquileres) {

            if (alquiler.getCancha().equals(cancha)) {
                return true;
            }
        }
        return false;
    }

    public boolean esMayor() {
        return this.edad >= _edad_mayor;
    }

    public void addAlquiler(Alquiler alquiler) {

        if (!this.alquileres.contains(alquiler) && alquiler.getSocio().equals(this)) {
            this.alquileres.add(alquiler);
        }
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public boolean getUltimaCuotaPaga() {
        return this.ultima_cuota_paga;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Socio otroSocio = (Socio) o;
            return this.getNombre().equalsIgnoreCase(otroSocio.getNombre()) && this.getApellido().equals(otroSocio.getApellido()) && this.getEdad() == otroSocio.getEdad();
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Socio [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
    }
}