import java.util.ArrayList;

public class Pais {
    
    private String nombre;
    private ArrayList<Provincia> provincias;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
    }

    //Funcionalidades
    public void addProvincia(Provincia provincia) {

        if (!this.provincias.contains(provincia)) {
            this.provincias.add(provincia);
        }
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return this.nombre + ", " + this.provincias;
    }
}