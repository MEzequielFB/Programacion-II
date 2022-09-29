import java.util.ArrayList;

public class Puerto {
 
    private ArrayList<Barco> cola_barcos;
    private ArrayList<Camion> cola_camiones;

    public Puerto() {

        this.cola_barcos = new ArrayList<>();
        this.cola_camiones = new ArrayList<>();
    }

    //Funcionalidades
    public void simularFinalizacionDeLaCarga() { //Método para pruebas

        if (this.barcoSiendoCargado()) {

            Barco barco = this.cola_barcos.get(0);
            Camion camion = this.cola_camiones.get(0);

            barco.setCamionAsignado(null);
            camion.setBarcoAsignado(null);

            this.cola_barcos.remove(barco);
            this.cola_camiones.remove(camion);
        }
    }

    private boolean barcoSiendoCargado() {
        return this.cola_barcos.get(0).getCamionAsignado() != null;
    }

    public void cargarBarco() {

        if (!this.cola_barcos.isEmpty() && !this.cola_camiones.isEmpty()) {

            if (!this.barcoSiendoCargado()) {

                Barco barco = this.cola_barcos.get(0);
                Camion camion = this.cola_camiones.get(0);

                barco.setCamionAsignado(camion);
                camion.setBarcoAsignado(barco);
            }
        }
    }

    private boolean fueCargadoAntes(Camion camion1, Camion camion2) {
        return camion1.getFechaCarga().isBefore(camion2.getFechaCarga());
    }

    public void addcamion(Camion nuevo_camion) {

        if (!this.cola_camiones.contains(nuevo_camion)) {

            for (Camion camion : this.cola_camiones) {

                if (this.fueCargadoAntes(nuevo_camion, camion)) {

                    this.cola_camiones.add(this.cola_camiones.indexOf(camion), nuevo_camion);
                }
            }
            this.cola_camiones.add(nuevo_camion);
        }
    }

    private boolean tieneMayorCapacidad(Barco barco1, Barco barco2) {
        return barco1.getCapacidad() > barco2.getCapacidad();
    }

    public void addBarco(Barco nuevo_barco) {

        if (!this.cola_barcos.contains(nuevo_barco)) {

            for (Barco barco : this.cola_barcos) {

                if (this.tieneMayorCapacidad(nuevo_barco, barco)) {

                    this.cola_barcos.add(this.cola_barcos.indexOf(barco), nuevo_barco);
                    return;
                }
            }
            this.cola_barcos.add(nuevo_barco);
        }
    }

    @Override
    public String toString() {
        return "Puerto [cola_barcos=" + cola_barcos + ", cola_camiones=" + cola_camiones + "]";
    }
}