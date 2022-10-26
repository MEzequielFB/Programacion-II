import java.time.LocalDateTime;
import java.util.ArrayList;

public class Mensaje {
    
    private Empleado empleado_emisor;
    private LocalDateTime fecha_emision;
    private ArrayList<String> palabras;

    public Mensaje(Empleado empleado_emisor, LocalDateTime fecha_emision) {
        this.empleado_emisor = empleado_emisor;
        this.fecha_emision = fecha_emision;
        this.palabras = new ArrayList<>();
    }

    //Funcionalidades
    public boolean tieneMismasPalabras(Mensaje otroMensaje) {

        int contador = 0;
        for (String palabra : this.palabras) {
            if (otroMensaje.contienePalabra(palabra)) {
                contador++;
            }
        }
        return contador == otroMensaje.getCantidadPalabras();
    }

    public boolean contienePalabra(String palabra) {
        return this.palabras.contains(palabra);
    }

    public void addPalabra(String palabra) {
        this.palabras.add(palabra);
    }

    //Getters
    public int getCantidadPalabras() {
        return this.palabras.size();
    }

    public Empleado getEmpleadoEmisor() {
        return this.empleado_emisor;
    }

    public LocalDateTime  getFechaEmision() {
        return this.fecha_emision;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Mensaje otroMensaje = (Mensaje) o;
            return this.getEmpleadoEmisor().equals(otroMensaje.getEmpleadoEmisor()) && this.getFechaEmision().isEqual(otroMensaje.getFechaEmision()) && this.tieneMismasPalabras(otroMensaje);
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Mensaje [palabras=" + palabras + "]";
    }
}