import java.util.ArrayList;

public class Establecimiento {

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
    /* private boolean hayConflictoTurnos(Turno t) {

        boolean hayConflicto = false;
        int cantConflictos = 0;
        for (int i = 0; i < turnos.size(); i++) {

            Turno turnoLista = turnos.get(i);
            if (t.getFecha().isEqual(turnoLista.getFecha()) && ( ( t.getHorario_inicio() >= turnoLista.getHorario_inicio() && t.getHorario_inicio() < turnoLista.getHorario_fin() ) || ( t.getHorario_fin() > turnoLista.getHorario_inicio() && t.getHorario_fin() <= turnoLista.getHorario_fin() ) )){

                cantConflictos++;
            }
        }
        if (cantConflictos == turno) {

        }
        return hayConflicto;
    } */

    public void addTurno(Turno t) {

        for (int i = 0; i < turnos.size(); i++) {

            if (!turnos.get(i).equals(t) /* && !hayConflictoTurnos(t) */) {
                turnos.add(t);
            }
        }
    }

    public void addCancha(Cancha c) {

        for (int i = 0; i < canchas.size(); i++) {

            if (!canchas.get(i).equals(c)) {
                canchas.add(c);
            }
        }
    }

    public void addUsuario(Usuario u) {

        for (int i = 0; i < usuarios.size(); i++) {

            if (!usuarios.get(i).equals(u)) {
                usuarios.add(u);
            }
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
}