public class Alarma {

    private Timbre timbre;
    private boolean vidrioRoto;
    private boolean puertaVentanaAbierta;
    private boolean hayMovimiento;

    public Alarma(Timbre timbre) {
        
        this.timbre = timbre;
        this.vidrioRoto = false;
        this.puertaVentanaAbierta = false;
        this.hayMovimiento = false;
    }

    //Funcionalidades
    public void comprobar() {

        if (this.vidrioRoto || this.puertaVentanaAbierta || this.hayMovimiento) {

            this.timbre.hacerSonar();
        }
    }

    public void parar() {
        this.timbre.parar();
    }

    //Getters
    public boolean estaActivada() {
        return this.timbre.estaSonando();
    }

    public Timbre getTimbre() {
        return timbre;
    }

    public boolean hayVidrioRoto() {
        return vidrioRoto;
    }

    public boolean hayPuertaVentanaAbierta() {
        return puertaVentanaAbierta;
    }

    public boolean hayMovimiento() {
        return hayMovimiento;
    }

    //Setters
    public void setVidrioRoto(boolean vidrioRoto) {
        this.vidrioRoto = vidrioRoto;
    }

    public void setPuertaVentanaAbierta(boolean puertaVentanaAbierta) {
        this.puertaVentanaAbierta = puertaVentanaAbierta;
    }

    public void setHayMovimiento(boolean hayMovimiento) {
        this.hayMovimiento = hayMovimiento;
    }
}