import java.util.ArrayList;

public class Cooperativa {
    
    private String nombre;
    private ArrayList<Lote> lotes;
    private ArrayList<Cereal> cereales;
    private ArrayList<String> minerales_primarios;

    public Cooperativa(String nombre) {

        this.setNombre(nombre);
        this.lotes = new ArrayList<>();
        this.cereales = new ArrayList<>();
        this.minerales_primarios = new ArrayList<>();
    }

    //Funcionalidades
    public boolean loteEsEspecial(Lote lote) {
        
        for (String mineral : this.minerales_primarios) {

            if (lote.contieneMineral(mineral)) {
                return true;
            }
        }
        return false;
    }

    public String getLotesAptos(Cereal cereal) {

        String lista_lotes = "";
        for (Lote lote : this.lotes) {

            if (lote.sePuedeSembrar(cereal)) {

                lista_lotes += lote.getNombre() + ", ";
            }
        }
        return lista_lotes;
    }

    public String getCerealesAptos(Lote lote) {

        String lista_cereales = "";
        for (Cereal cereal : this.cereales) {

            if (cereal.sePuedeSembrar(lote)) {

                lista_cereales += cereal.getNombre() + ", ";
            }
        }
        return lista_cereales;
    }

    public void addMineralPrimario(String mineral) {

        if (!this.minerales_primarios.contains(mineral)) {
            this.minerales_primarios.add(mineral);
        }
    }

    public void addLote(Lote lote) {

        if (!this.lotes.contains(lote)) {
            this.lotes.add(lote);
        }
    }

    public void addCereal(Cereal cereal) {

        if (!this.cereales.contains(cereal)) {
            this.cereales.add(cereal);
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
}