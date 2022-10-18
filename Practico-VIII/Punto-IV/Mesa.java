import java.time.LocalTime;
import java.util.ArrayList;

public class Mesa extends ElementoVoto {
    
    private int numero;
    private ArrayList<Votante> votantes;
    private ArrayList<Voto> votos;

    public Mesa(int numero) {
        this.numero = numero;
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
        if (!this.votantes.contains(votante) && votante.getMesaAsignada() == null) {
            this.votantes.add(votante);
            votante.setMesaAsignada(this);
        }
    }

    //Getters
    @Override
    public int getCantidadVotos() {
        return this.votos.size();
    }

    @Override
    public int getCantidadVotosCandidato(Candidato candidato) {

        int cantidad_votos_candidato = 0;
        for (Voto voto : this.votos) {

            if (candidato != null) {
                if (voto.getCandidato().equals(candidato)) {
                    cantidad_votos_candidato++;
                }
            } else {
                if (voto.getCandidato() == candidato) {
                    cantidad_votos_candidato++;
                }
            }
        }
        return cantidad_votos_candidato;
    }

    @Override
    public double getPorcentajeVotosCandidato(Candidato candidato) { //Maneja que el candidato sea null o no para comparar de forma distinta los candidatosy no de error de ejecucion
        return ((double) this.getCantidadVotosCandidato(candidato) / (double) this.getCantidadVotos()) * 100;
    }

    @Override
    public int getCantidadVotosHorario(LocalTime hora_inicio, LocalTime hora_fin) {

        int cantidad_votos_horario = 0;
        for (Voto voto : this.votos) {

            if ((voto.getHorarioEmision().compareTo(hora_inicio) > 0 || voto.getHorarioEmision().compareTo(hora_inicio) == 0) && (voto.getHorarioEmision().compareTo(hora_fin) < 0 || voto.getHorarioEmision().compareTo(hora_fin) == 0)) {
                cantidad_votos_horario++;
            }
        }
        return cantidad_votos_horario;
    }

    @Override
    public double getPorcentajeVotosHorario(LocalTime hora_inicio, LocalTime hora_fin) { //Si el voto esta entre ambos horarios cumple
        return ((double) this.getCantidadVotosHorario(hora_inicio, hora_fin) / (double) this.getCantidadVotos()) * 100;
    }

    public int getNumero() {
        return this.numero;
    }

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