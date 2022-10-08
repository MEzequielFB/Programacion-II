public class EnvioPaquete extends Envio {

    private Persona destinatario;
    private Persona remitente;
    private double peso;
    private String metodo_retiro;

    public EnvioPaquete(Persona destinatario, Persona remitente, String metodo_retiro, double peso) {

        this.destinatario = destinatario;
        this.remitente = remitente;
        this.peso = peso;
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
        return this.peso;
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