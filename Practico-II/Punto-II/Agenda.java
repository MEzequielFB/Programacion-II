import java.util.ArrayList;

public class Agenda {
    
    private ArrayList<Reunion> reuniones;

    public Agenda() {

        this.reuniones = new ArrayList<Reunion>();
    }

    public void addReunion(Reunion r) { //HAY QUE CONTROLAR LOS HORARIOS DE LAS REUNIONES

        for (int i = 0; i < reuniones.size(); i++) {

            if (reuniones.get(i).equals(r)) {

                System.out.print("La reunión ingresada ya está registrada en la agenda");
                return;
            }
        }
        reuniones.add(r);
    }

    public void removeReunion(Reunion r) {

        for (int i = 0; i < reuniones.size(); i++) {

            if (reuniones.get(i).equals(r)) {
                reuniones.remove(r);
                return;
            }
        }
        System.out.println("La reunión que se quiere eliminar no existe en la agenda");
    }
}