import java.time.LocalTime;

public abstract class ElementoVoto {
    
    public abstract int getCantidadVotos();

    public abstract int getCantidadVotosCandidato(Candidato candidato);

    public abstract double getPorcentajeVotosCandidato(Candidato candidato);

    public double getPorcentajeVotosBlanco() {
        return this.getPorcentajeVotosCandidato(null);
    }

    public abstract int getCantidadVotosHorario(LocalTime hora_inicio, LocalTime hora_fin);

    public abstract double getPorcentajeVotosHorario(LocalTime hora_inicio, LocalTime hora_fin);
}