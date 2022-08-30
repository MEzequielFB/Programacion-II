import java.time.LocalDateTime;
import java.util.ArrayList;

public class Peluqueria {
    
    public final double DESCUENTO = 10;
    public final int MIN_MES_SOCIO = 1; //Un mes atrás
    public final int MAX_HORAS_SOCIO = 12; //Un medio día atrás

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
    public Turno getPrimerTurnoDisponiblePeluquero(Peluquero p) {  //Devuelve el turno de un peluquero en particular más próximo a la fecha actual 

        Turno primerTurnoDisponible = null;

        for (Turno turnoLista : turnos) {

            LocalDateTime fechaIni = turnoLista.getFechaInicio();

            if (( fechaIni.isEqual(LocalDateTime.now()) || fechaIni.isAfter(LocalDateTime.now()) ) && turnoLista.getPeluquero().equals(p)) {

                if (primerTurnoDisponible == null) {

                    primerTurnoDisponible = turnoLista;
                } else if (esFechaMasProxima(fechaIni, primerTurnoDisponible.getFechaInicio())){
    
                    primerTurnoDisponible = turnoLista;
                }
            }
        }
        return primerTurnoDisponible;
    }

    public Turno getPrimerTurnoDisponible() { //Devuelve el turno reservado más próximo a la fecha actual

        Turno primerTurnoDisponible = null;

        for (Turno turnoLista : turnos) {

            LocalDateTime fechaIni = turnoLista.getFechaInicio();

            if (fechaIni.isEqual(LocalDateTime.now()) || fechaIni.isAfter(LocalDateTime.now())) {

                if (primerTurnoDisponible == null) {

                    primerTurnoDisponible = turnoLista;
                } else if (esFechaMasProxima(fechaIni, primerTurnoDisponible.getFechaInicio())){
    
                    primerTurnoDisponible = turnoLista;
                }
            }
        }
        return primerTurnoDisponible;
    }

    private boolean esFechaMasProxima(LocalDateTime fecha, LocalDateTime fechaPrimerTurno) { //Devuelve true si el primer parámetro es menor al segundo parámetro o si el segundo parámetro es null

        if (fecha.isBefore(fechaPrimerTurno) || fechaPrimerTurno.equals(null)) {
            return true;
        }
        return false;
    }

    public double cobrarTurno(Turno t) { //Si no existe el turno ingresado dentro de los turnos de la peluqueria se devuelve -1

        if (turnos.contains(t)) {

            double precio = t.getPrecio();
            if (this.clienteEsSocio(t.getCliente())) {

                precio = precio * (1 - (DESCUENTO / 100));
            }
            return precio;
        }
        return -1;
    }

    //Fechas para ser socio - Entre el mes pasado y medio dia antes del turno que se cobra
    private LocalDateTime getFechaMinSocio() {
        return LocalDateTime.now().minusMonths(MIN_MES_SOCIO);
    }

    private LocalDateTime getFechaMaxSocio() {
        return LocalDateTime.now().minusHours(MAX_HORAS_SOCIO);
    }

    public boolean clienteEsSocio(Cliente c) {
        
        int cantTurnosHechos = 0;
        for (Turno turnoLista : turnos) {

            if (turnoLista.getCliente().equals(c)) {

                if (turnoLista.getFechaInicio().isAfter(this.getFechaMinSocio()) && turnoLista.getFechaInicio().isBefore(getFechaMaxSocio())) {

                    cantTurnosHechos++;
                }
            }
        }
        return cantTurnosHechos >= 1;
    }

    private boolean hayConflictos(Turno t) {

        for (Turno turnoLista : turnos) {

            if (turnoLista.getPeluquero().equals(t.getPeluquero())) {

                if (t.getFechaInicio().isEqual(turnoLista.getFechaInicio()) || ( t.getFechaInicio().isAfter(turnoLista.getFechaInicio()) && t.getFechaInicio().isBefore(turnoLista.getFechaFin()) )) {

                    return true;
                }
            }
        }
        return false;
    }

    public void addTurno(Turno t) {

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
        return "Peluqueria [nombre=" + nombre + ", clientes=" + clientes + ", peluqueros= " + peluqueros + ", turnos=" + turnos + "]";
    }
}