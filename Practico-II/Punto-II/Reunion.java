import java.time.LocalDate;
import java.util.ArrayList;

public class Reunion {

    private String ubicacion;
    private String tema;
    private LocalDate fecha;
    private int horario_inicio;
    private int horario_fin;

    private ArrayList<Persona> personas;

    public Reunion(String ubicacion, String tema, LocalDate fecha, int horario_inicio, int horario_fin) {

        this.ubicacion = ubicacion;
        this.tema = tema;
        this.fecha = fecha;
        this.horario_inicio = horario_inicio;
        this.horario_fin = horario_fin;

        this.personas = new ArrayList<Persona>();
    }

    //Getters
    public String getUbicacion() {
        return ubicacion;
    }

    public String getTema() {
        return tema;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getHorario_inicio() {
        return horario_inicio;
    }

    public int getHorario_fin() {
        return horario_fin;
    }

    //Setters
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHorario_inicio(int horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public void setHorario_fin(int horario_fin) {
        this.horario_fin = horario_fin;
    }

    //Funcionalidades
    //Si no existe la persona en la lista se agrega
    public void addPersona(Persona p) {

        for (int i = 0; i < personas.size(); i++) {

            if (personas.get(i).equals(p)) {

                System.out.print(p.getNombre() + " ya está en la reunión");
                return;
            }
        }
        this.personas.add(p);
    }

    //Si existe la persona en la lista se elimina
    public void removePersona(Persona p) {
        
        for (int i = 0; i < personas.size(); i++) {

            if (personas.get(i).equals(p)) {

                personas.remove(i);
                System.out.println(p.getNombre() + " eliminado/a de la reunión");
                return;
            }
        }
        System.out.println(p.getNombre() + " no es participe de esta reunión");
    }
}