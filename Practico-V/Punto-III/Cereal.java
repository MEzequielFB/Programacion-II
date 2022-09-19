import java.util.ArrayList;

public class Cereal {

    private String nombre;
    protected ArrayList<String> minerales_necesarios;

    public Cereal(String nombre) {

        this.setNombre(nombre);
        this.minerales_necesarios = new ArrayList<>();
    }

    //Funcionalidades
    public boolean sePuedeSembrar(Lote lote) {

        int contador = 0;
        for (String mineral : this.minerales_necesarios) {

            if (lote.contieneMineral(mineral)) {
                contador++;
            }
        }
        return contador == this.minerales_necesarios.size();
    }

    public boolean necesitaMineral(String mineral) {
        return this.minerales_necesarios.contains(mineral);
    }

    public void addMineralNecesario(String mineral) {

        if (!this.minerales_necesarios.contains(mineral)) {
            this.minerales_necesarios.add(mineral);
        }
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Cereal otroCereal = (Cereal) o;
            return this.getNombre().equals(otroCereal.getNombre());
        }
        catch(Exception exc) {
            return false;
        }
    }
}