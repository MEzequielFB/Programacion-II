import java.util.ArrayList;

public class Empresa {
    
    private String nombre;
    private ArrayList<Persona> personas;

    public Empresa(String nombre) {

        this.nombre = nombre;
        this.personas = new ArrayList<>();
    }

    //Funcionalidades
    public String getInfoPersonas() {

        String info_personas = "";
        for (Persona persona : this.personas) {

            info_personas += persona + "\n";
        }
        return info_personas;
    }

    public void addPersona(Persona p) {

        if (!this.personas.contains(p)) {
            this.personas.add(p);
        }
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
}