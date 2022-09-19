import java.util.ArrayList;

public class Lote {
    
    private static int contador;
    
    private String nombre;
    private double hectareas;
    private ArrayList<String> minerales;

    public Lote(double hectareas) {

        this.nombre = "Lote N°" + (contador+1);
        this.setHectareas(hectareas);
        this.minerales = new ArrayList<>();

        contador++;
    }

    //Funcionalidades
    public boolean sePuedeSembrar(Cereal cereal) {
        return cereal.sePuedeSembrar(this);
    }

    public boolean contieneMineral(String mineral) {
        return this.minerales.contains(mineral);
    }

    public void addMineral(String mineral) {

        if (!this.minerales.contains(mineral)) {
            this.minerales.add(mineral);
        }
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public double getHectareas() {
        return this.hectareas;
    }

    //Setters
    public void setHectareas(double hectareas) {
        
        if (hectareas > 0) {
            this.hectareas = hectareas;
        }
    }

    @Override
    public boolean equals(Object o) {

        try {
            Lote otroLote = (Lote) o;
            return this.getNombre().equals(otroLote.getNombre());
        }
        catch(Exception exc) {
            return false;
        }
    }
}