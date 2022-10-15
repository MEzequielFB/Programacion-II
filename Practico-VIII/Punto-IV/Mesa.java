import java.time.LocalTime;
import java.util.ArrayList;

public class Mesa {
    
    private int numero;
    /* private Establecimiento establecimiento; */
    private ArrayList<Votante> votantes;
    private ArrayList<Voto> votos;

    public Mesa(int numero) {
        this.numero = numero;
        /* this.establecimiento = null; */
        this.votantes = new ArrayList<>();
        this.votos = new ArrayList<>();
    }

    //Funcionalidades
    public void addVoto(Voto voto) {
        if (!this.votos.contains(voto) && this.votantes.contains(voto.getVotante())) {
            this.votos.add(voto);
            voto.setHorarioEmision(LocalTime.now());
        }
    }

    public void addVotante(Votante votante) {
        if (!this.votantes.contains(votante)) {
            this.votantes.add(votante);
            votante.setMesaAsignada(this);
        }
    }

    //Getters
    public int getNumero() {
        return this.numero;
    }

    /* public Establecimiento getEstablecimiento() {
        return this.establecimiento;
    } */

    @Override
    public boolean equals(Object o) {
        try {
            Mesa otraMesa = (Mesa) o;
            return this.getNumero() == otraMesa.getNumero();
        }
        catch(Exception exc) {
            return false;
        }
    }
}