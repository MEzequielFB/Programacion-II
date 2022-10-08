public class EnvioCarta extends Envio {

    private Persona destinatario;
    private Persona remitente;
    private String metodo_retiro;

    public EnvioCarta(Persona destinatario, Persona remitente, String metodo_retiro) {
        
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.metodo_retiro = metodo_retiro;
    }

    //Getters
    @Override
    public Persona getDestinatario() {
        return this.destinatario;
    }

    @Override
    public Persona getRemitente() {
        return this.remitente;
    }

    @Override
    public double getPeso() {
        return 0.1;
    }

    @Override
    public int getCantidadEnvios() {
        return 1;
    }
    @Override
    public String getMetodoRetiro() {
        return this.metodo_retiro;
    }
}