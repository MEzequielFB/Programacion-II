import java.time.LocalTime;
import java.util.ArrayList;

public class Zona extends ElementoVoto {

    private String nombre;
    private ArrayList<ElementoVoto> elementos_voto;

    public Zona(String nombre) {
        this.nombre = nombre;
        this.elementos_voto = new ArrayList<>();
    }

    //Funcionalidades
    public void addElementoVoto(ElementoVoto elemento_voto) {

        if (!this.elementos_voto.contains(elemento_voto)) {
            this.elementos_voto.add(elemento_voto);
        }
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public int getCantidadVotos() {
        
        int cantidad_votos = 0;
        for (ElementoVoto elemento_voto : this.elementos_voto) {
            cantidad_votos += elemento_voto.getCantidadVotos();
        }
        return cantidad_votos;
    }

    @Override
    public int getCantidadVotosCandidato(Candidato candidato) {
        
        int cantidad_votos_candidato = 0;
        for (ElementoVoto elemento_voto : this.elementos_voto) {
            cantidad_votos_candidato += elemento_voto.getCantidadVotosCandidato(candidato);
        }
        return cantidad_votos_candidato;
    }

    @Override
    public double getPorcentajeVotosCandidato(Candidato candidato) {
        return ((double) this.getCantidadVotosCandidato(candidato) / (double) this.getCantidadVotos()) * 100;
    }

    @Override
    public int getCantidadVotosHorario(LocalTime hora_inicio, LocalTime hora_fin) {

        int cantidad_votos_horario = 0;
        for (ElementoVoto elemento_voto : this.elementos_voto) {
            cantidad_votos_horario += elemento_voto.getCantidadVotosHorario(hora_inicio, hora_fin);
        }
        return cantidad_votos_horario;
    }

    @Override
    public double getPorcentajeVotosHorario(LocalTime hora_inicio, LocalTime hora_fin) {
        return ((double) this.getCantidadVotosHorario(hora_inicio, hora_fin) / (double) this.getCantidadVotos()) * 100;
    }
}