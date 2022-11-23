import java.util.ArrayList;

public abstract class Seguro {

    private String dni_duenio;

    public Seguro(String dni_duenio) {
        this.dni_duenio = dni_duenio;
    }

    //Metodos abstractos
    public abstract int getNumeroPoliza();
    public abstract double getMontoAsegurado();
    public abstract double getCostoPoliza();
    public abstract String getDescripcion();
    public abstract ArrayList<Seguro> buscarSeguros(Filtro filtro);

    //Getters
    public String getDniDuenio() {
        return dni_duenio;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Seguro otroSeguro = (Seguro) o;
            return this.getNumeroPoliza() == otroSeguro.getNumeroPoliza() && this.getDniDuenio().equals(otroSeguro.getDniDuenio());
        }
        catch(Exception exc) {
            return false;
        }
    }
}