public class EnvioPaquete extends Envio {

    private Persona remitente;
    private Persona destinatario;
    private double peso;
    private String metodo_retiro;

    public EnvioPaquete(Persona remitente, Persona destinatario, String metodo_retiro, double peso) {

        this.remitente = remitente;
        this.destinatario = destinatario;
        this.peso = peso;
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