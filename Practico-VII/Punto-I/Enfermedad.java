import java.util.ArrayList;

public class Enfermedad {
    
    private String nombre;
    private ArrayList<String> patologias;

    public Enfermedad(String nombre) {

        this.nombre = nombre;
        this.patologias = new ArrayList<>();
    }

    //Funcionalidades
    public int getCantidadPatologias() {
        return this.patologias.size();
    }

    public boolean contienePatologia(String patologia) {
        return this.patologias.contains(patologia);
    }

    public void addPatologia(String patologia) {

        if (!this.patologias.contains(patologia)) {
            this.patologias.add(patologia);
        }
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Enfermedad otraEnfermedad = (Enfermedad) o;
            return this.getNombre().equalsIgnoreCase(otraEnfermedad.getNombre());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Enfermedad [nombre=" + nombre + ", patologias=" + patologias + "]";
    }
}