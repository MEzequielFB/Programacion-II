import java.util.ArrayList;

public class ComboPostal extends Envio {

    private ArrayList<Envio> envios;

    public ComboPostal() {
        this.envios = new ArrayList<>();
    }

    //Funcionalidades
    private boolean tieneMismoDestino(Envio envio) {

        if (this.envios.isEmpty()) {
            return true;
        }
        if (envio.getDestinatario().getCiudad().equalsIgnoreCase(this.getDestinatario().getCiudad()) && envio.getDestinatario().getDireccion().equalsIgnoreCase(this.getDestinatario().getDireccion())) {
            return true;
        }
        return false;
    }

    public void addEnvio(Envio envio) {

        if (!this.envios.contains(envio) && tieneMismoDestino(envio)) {

            envio.setNumeroTracking(this.getNumeroTracking());
            this.envios.add(envio);
        }
    }

    //Getters
    @Override
    public Persona getDestinatario() {
        
        if (!this.envios.isEmpty()) {
            return this.envios.get(0).getDestinatario();
        }
        return null;
    }

    @Override
    public Persona getRemitente() {

        if (!this.envios.isEmpty()) {
            return this.envios.get(0).getRemitente();
        }
        return null;
    }


    @Override
    public double getPeso() {
        
        int peso_total = 0;
        for (Envio envio : this.envios) {
            peso_total += envio.getPeso();
        }
        return peso_total;
    }

    @Override
    public int getCantidadEnvios() {
        
        int cantidad_total = 0;
        for (Envio envio : this.envios) {
            cantidad_total += envio.getCantidadEnvios();
        }
        return cantidad_total;
    }

    @Override
    public String getMetodoRetiro() {

        if (!this.envios.isEmpty()) {
            return this.envios.get(0).getMetodoRetiro();
        }
        return null;
    }

    //Setters
    @Override
    public void setNumeroTracking(int numero_tracking) { //Deberia hacerlo un metodo abstracto en envio?

        super.setNumeroTracking(numero_tracking);
        for (Envio envio : this.envios) {
            envio.setNumeroTracking(numero_tracking);
        }
    }

    @Override
    public String toString() {
        return "ComboPostal [envios=" + envios + "]";
    }
}