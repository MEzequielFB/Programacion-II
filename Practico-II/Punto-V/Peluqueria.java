import java.time.LocalDate;
import java.util.ArrayList;

public class Peluqueria {
    
    public final double DESCUENTO = 10;
    public final int MIN_MES_SOCIO = 1; //Un mes atrás

    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Peluquero> peluqueros;
    private ArrayList<Turno> turnos;

    public Peluqueria(String nombre) {

        this.nombre = nombre;
        this.clientes = new ArrayList<Cliente>();
        this.peluqueros = new ArrayList<Peluquero>();
        this.turnos = new ArrayList<Turno>();
    }

    //Funcionalidades
    public double cobrarTurno(Turno t) {

        double precio = t.getPrecio();
        if (this.clienteEsSocio(t.getCliente())) {

            precio = precio * (1 - (DESCUENTO / 100));
        }
        return precio;
    }

    private LocalDate getFechaMinSocio() {
        return LocalDate.now().minusMonths(MIN_MES_SOCIO);
    }

    public boolean clienteEsSocio(Cliente c) {
        
        int cantTurnosHechos = 0;
        for (Turno turnoLista : turnos) {

            if (turnoLista.getCliente().equals(c) && turnoLista.getFecha().isAfter(this.getFechaMinSocio())) {
                cantTurnosHechos++;
            }
        }
        return cantTurnosHechos >= 1;
    }

    private boolean hayConflictos(Turno t) {

        for (Turno turnoLista : turnos) {

            if (turnoLista.getPeluquero().equals(t.getPeluquero())) {

                if (turnoLista.getFecha().isEqual(t.getFecha())) {

                    if (( !t.getHorario_inicio().isAfter(turnoLista.getHorario_inicio()) && !t.getHorario_inicio().isBefore(turnoLista.getHorario_fin()) ) && ( !t.getHorario_fin().isAfter(turnoLista.getHorario_inicio()) && !t.getHorario_fin().isBefore(turnoLista.getHorario_fin()) )) {

                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void addTurno(Turno t) { //Hay que controlar conflictos

        if (!turnos.contains(t)) {

            if (!hayConflictos(t)) {

                turnos.add(t);
            }
        }
    }

    public void addPeluquero(Peluquero p) {

        if (!peluqueros.contains(p)) {
            peluqueros.add(p);
        }
    }

    public void addCliente(Cliente c) {

        if (!clientes.contains(c)) {
            clientes.add(c);
        }
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Peluqueria [DESCUENTO=" + DESCUENTO + ", clientes=" + clientes + ", nombre=" + nombre + ", peluqueros="
                + peluqueros + ", turnos=" + turnos + "]";
    }
}