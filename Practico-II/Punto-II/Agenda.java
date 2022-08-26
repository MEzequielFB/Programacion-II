import java.time.LocalDate;
import java.util.ArrayList;

public class Agenda {
    
    private ArrayList<Reunion> reuniones;

    public Agenda() {

        this.reuniones = new ArrayList<Reunion>();
    }

    public void addReunion(Reunion r) { //HAY QUE CONTROLAR LOS HORARIOS DE LAS REUNIONES

        if (!existeReunionEnLista(r) && !hayConflictoDeHorarios(r)) {
            reuniones.add(r);
        } else {
            System.out.println("No se puede agregar la reunion");
        }
    }

    public void removeReunion(Reunion r) {

        if (existeReunionEnLista(r)) {
            reuniones.remove(r);
        }
    }

    private boolean existeReunionEnLista(Reunion r) {

        for (int i = 0; i < reuniones.size(); i++) {

            if (reuniones.get(i).equals(r)) {
                return true;
            }
        }
        return false;
    }

    //Si el horario de la nueva reunión está entre los horarios de una reunión ya existente en la agenda, se hace en la misma fecha y en el mismo lugar, devuelve true
    private boolean hayConflictoDeHorarios(Reunion r) {

        for (int i = 0; i < reuniones.size(); i++) {

            int item_horario_inicio = reuniones.get(i).getHorario_inicio();
            int item_horario_fin = reuniones.get(i).getHorario_fin();
            String item_ubicacion = reuniones.get(i).getUbicacion();
            LocalDate item_fecha = reuniones.get(i).getFecha();

            if (((r.getHorario_inicio() >= item_horario_inicio && r.getHorario_inicio() < item_horario_fin) || (r.getHorario_fin() > item_horario_inicio && r.getHorario_fin() <= item_horario_fin)) && item_ubicacion.equals(r.getUbicacion()) && item_fecha.isEqual(r.getFecha())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Agenda [reuniones=" + reuniones + "]";
    }
}