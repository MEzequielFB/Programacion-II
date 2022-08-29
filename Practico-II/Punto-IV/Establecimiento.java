import java.time.LocalDate;
import java.util.ArrayList;

public class Establecimiento {

    public final int CANT_TURNOS_SOCIO = 4;
    public final int MIN_MESES_ANTES = 2;
    public final double DESCUENTO = 10; //%

    private String nombre;
    private ArrayList<Cancha> canchas;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Turno> turnos;

    public Establecimiento(String nombre) {

        this.nombre = nombre;
        this.canchas = new ArrayList<Cancha>();
        this.usuarios = new ArrayList<Usuario>();
        this.turnos = new ArrayList<Turno>();
    }

    //Funcionalidades
    
    //Método cobrar turno que use el método UsuarioEsSocio
    public double cobrarTurno(Turno t) {

        double precio = t.getCanchaReservada().getPrecio();
        if (usuarioEsSocio(t.getUsuario())) {
            
            precio = precio * (1 - (DESCUENTO / 100));
        }
        return precio;
    }

    private LocalDate getFechaMinSocio() {
        return LocalDate.now().minusMonths(MIN_MESES_ANTES); //Dos meses menos al actual
    }

    public boolean usuarioEsSocio(Usuario u) {

        int turnosHechos = 0;
        for (int i = 0; i < turnos.size(); i++) {

            Turno turno = turnos.get(i);
            if (turno.getUsuario().equals(u)) {

                if (turno.getFecha().isAfter(getFechaMinSocio())) {

                    turnosHechos++;
                }
            }
        }
        return turnosHechos >= CANT_TURNOS_SOCIO;
    }

    public void addTurno(Turno t) {

        if (!hayConflictoTurnos(t)) {
            turnos.add(t);
        }
    }

    public boolean hayConflictoTurnos(Turno t) {

        for (int i = 0; i < turnos.size(); i++) {

            //Si la cancha es igual al de algun turno se busca un conflicto
            if (t.getCanchaReservada().equals(turnos.get(i).getCanchaReservada())) {

                Turno turnoLista = turnos.get(i);
                if (t.getFecha().isEqual(turnoLista.getFecha()) && ( ( t.getHorario_inicio() >= turnoLista.getHorario_inicio() && t.getHorario_inicio() < turnoLista.getHorario_fin() ) || ( t.getHorario_fin() > turnoLista.getHorario_inicio() && t.getHorario_fin() <= turnoLista.getHorario_fin() ) )){

                    return true;
                }
            }
        }
        return false;
    }

    public void addCancha(Cancha c) {

        if (!canchas.contains(c)) {
            canchas.add(c);
        }
    }

    public void addUsuario(Usuario u) {

        if (!usuarios.contains(u)) {
            usuarios.add(u);
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
        return "Establecimiento [nombre=" + nombre + ", canchas=" + canchas +  ", turnos=" + turnos + ", usuarios=" + usuarios + "]";
    }
}