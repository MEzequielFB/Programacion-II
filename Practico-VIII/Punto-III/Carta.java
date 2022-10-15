import java.util.ArrayList;

public class Carta {
    
    private Ninio remitente;
    private ArrayList<String> regalos_solicitados;

    public Carta(Ninio remitente) {

        this.remitente = remitente;
        this.regalos_solicitados = new ArrayList<>();
    }

    //Funcionalidades
    public void vaciarCarta() {
        this.regalos_solicitados.clear();
    }

    public void addRegalo(String regalos_solicitado) {
        this.regalos_solicitados.add(regalos_solicitado);
    }

    //Getters
    public Ninio getRemitente() {
        return this.remitente;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Carta otraCarta = (Carta) o;
            return this.getRemitente().equals(otraCarta.getRemitente());
        }
        catch(Exception exc) {
            return false;
        }
    }
}