import java.time.LocalDate;

public class Camion {
    
    private static int contador;

    private int id;
    private LocalDate fecha_carga;
    private Barco barco_asignado;

    public Camion(LocalDate fecha_carga) {

        this.id = contador;
        this.fecha_carga = fecha_carga;
        this.barco_asignado = null;

        contador++;
    }

    //Getters
    public int getId() {
        return this.id;
    }

    public LocalDate getFechaCarga() {
        return this.fecha_carga;
    }

    public Barco getBarcoAsignado() {
        return this.barco_asignado;
    }

    //Setters
    public void setBarcoAsignado(Barco barco_asignado) {
        this.barco_asignado = barco_asignado;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Camion otroCamion = (Camion) o;
            return this.getId() == otroCamion.getId();
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Camion [id=" + id + ", fecha_carga=" + fecha_carga + ", barco_asignado=" + barco_asignado + "]";
    }
}