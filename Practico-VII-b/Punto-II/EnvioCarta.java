public class EnvioCarta extends Envio {

    private Persona remitente;
    private Persona destinatario;
    private String metodo_retiro;

    public EnvioCarta(Persona remitente, Persona destinatario, String metodo_retiro) {
        
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.metodo_retiro = metodo_retiro;
    }

    //Getters
    @Override
    public Persona getRemitente() {
        return this.remitente;
    }

    @Override
    public Persona getDestinatario() {
        return this.destinatario;
    }

    @Override
    public double getPeso() {
        return 0.1; //Por que no suma
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