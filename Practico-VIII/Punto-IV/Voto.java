import java.time.LocalTime;

public class Voto {
    
    private Votante votante;
    private Candidato candidato_votado;
    private LocalTime horario_emision;

    public Voto(Votante votante, Candidato candidato_votado, LocalTime horario_emision) {
        this.votante = votante;
        this.candidato_votado = candidato_votado;
        this.horario_emision = horario_emision;
    }

    //Getters
    public Votante getVotante() {
        return this.votante;
    }

    public Candidato getCandidato() {
        return this.candidato_votado;
    }

    public LocalTime getHorarioEmision() {
        return this.horario_emision;
    }

    //Setters
    public void setHorarioEmision(LocalTime horario_emision) {
        this.horario_emision = horario_emision;
    }

    @Override
    public boolean equals(Object o) {
        try {
            Voto otroVoto = (Voto) o;
            return this.getVotante().equals(otroVoto.getVotante());
        }
        catch(Exception exc) {
            return false;
        }
    }
}