public abstract class Envio {
    
    private static int _contador;
    private int numero_tracking;

    public Envio() {

        this.numero_tracking = _contador;
        _contador++;
        /* this.destinatario = destinatario;
        this.remitente = remitente; */
    }

    //Getters
    public int getNumeroTracking() {
        return this.numero_tracking;
    }

    /* public Persona getDestinatario() {
        return this.destinatario;
    }

    public Persona getRemitente() {
        return this.remitente;
    } */

    public abstract Persona getDestinatario();

    public abstract Persona getRemitente();

    public abstract double getPeso();

    public abstract int getCantidadEnvios();

    public abstract String getMetodoRetiro();

    //Setters
    public void setNumeroTracking(int numero_tracking) {
        this.numero_tracking = numero_tracking;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Envio otroEnvio = (Envio) o;
            return this.getNumeroTracking() == otroEnvio.getNumeroTracking();
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Envio [numero_tracking=" + numero_tracking + "]";
    }
}