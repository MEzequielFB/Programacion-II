import java.util.ArrayList;

public class Socio {
    
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
    public double getMayorPagoPorAlquiler() {
        double resultado = 0;
        for (Alquiler alquiler : this.alquileres) {
            double precio = alquiler.getPrecioPagado();
            if (precio > resultado) {
                resultado = precio;
            }
        }
        return resultado;
    }

    public boolean alquiloCancha(Cancha cancha) {
        boolean resultado = false;
        for (Alquiler alquiler : this.alquileres) {
            if (alquiler.getCancha().equals(cancha)) {
                resultado = true;
            }
        }
        return resultado;
    }

    public void addAlquiler(Alquiler alquiler) {
        if (!this.alquileres.contains(alquiler)) {
            this.alquileres.add(alquiler);
        }
    }

    public boolean tieneUltimaCuotaPaga() {
        return this.ultima_cuota_paga;
    }

    //Getters
    public int getCantidadAlquiloCancha(Cancha cancha) {
        int contador = 0;
        for (Alquiler alquiler : this.alquileres) {
            if (alquiler.getCancha().equals(cancha)) {
                contador++;
            }
        }
        return contador;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Socio otroSocio = (Socio) o;
            return this.getNombre().equalsIgnoreCase(otroSocio.getNombre()) && this.getApellido().equalsIgnoreCase(otroSocio.getApellido());
        }
        catch(Exception exc) {
            return false;
        }
    }
}