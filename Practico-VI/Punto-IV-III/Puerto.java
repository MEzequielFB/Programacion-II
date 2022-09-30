public class Puerto {
 
    private ColaOrdenada cola_barcos;
    private ColaOrdenada cola_camiones;

    public Puerto() {

        this.cola_barcos = new ColaOrdenada();
        this.cola_camiones = new ColaOrdenada();
    }

    //Funcionalidades
    public void simularFinalizacionDeLaCarga() { //Método para pruebas

        if (this.barcoSiendoCargado()) {

            Barco barco = (Barco) this.cola_barcos.getPrimerElemento();
            Camion camion = (Camion) this.cola_camiones.getPrimerElemento();

            barco.setCamionAsignado(null);
            camion.setBarcoAsignado(null);

            this.cola_barcos.removePrimerElemento();
            this.cola_camiones.removePrimerElemento();
        }
    }

    private boolean barcoSiendoCargado() {

        Barco barco = (Barco) this.cola_barcos.getPrimerElemento();
        return barco.getCamionAsignado() != null;
    }

    public void cargarBarco() {

        if (!this.cola_barcos.estaVacio() && !this.cola_camiones.estaVacio()) {

            if (!this.barcoSiendoCargado()) {

                Barco barco = (Barco) this.cola_barcos.getPrimerElemento();
                Camion camion = (Camion) this.cola_camiones.getPrimerElemento();

                barco.setCamionAsignado(camion);
                camion.setBarcoAsignado(barco);
            }
        }
    }

    public void addcamion(Camion nuevo_camion) {
        this.cola_camiones.addElemento(nuevo_camion);
    }

    public void addBarco(Barco nuevo_barco) {
        this.cola_barcos.addElemento(nuevo_barco);
    }

    @Override
    public String toString() {
        return "Puerto [cola_barcos=" + cola_barcos + ", cola_camiones=" + cola_camiones + "]";
    }
}