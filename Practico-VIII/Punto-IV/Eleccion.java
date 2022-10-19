import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
/* import java.util.Comparator; */

public class Eleccion {
    
    private ArrayList<Candidato> candidatos; //Los agrego manualmente
    private ArrayList<ElementoVoto> elementos_voto;
    //private Comparator<Candidato> comparador;

    public Eleccion(/* Comparator<Candidato> comparador */) {
        this.candidatos = new ArrayList<>();
        this.elementos_voto = new ArrayList<>();
        /* this.comparador = comparador; */
    }

    //Funcionalidades
    public void addElementoVoto(ElementoVoto elemento_voto) {

        if (!this.elementos_voto.contains(elemento_voto)) {
            this.elementos_voto.add(elemento_voto);
        }
    }

    public void addCandidato(Candidato candidato) {

        if (!this.candidatos.contains(candidato)) {
            this.candidatos.add(candidato);
        }
    }

    //Getters
    public int getCantidadVotosPorElemento(ElementoVoto elemento_voto) {
        return elemento_voto.getCantidadVotos();
    }

    public double getPorcentajeVotosHorarioPorElemento(ElementoVoto elemento_voto, LocalTime hora_inicio, LocalTime hora_fin) {
        return elemento_voto.getPorcentajeVotosHorario(hora_inicio, hora_fin);
    }

    public double getPorcentajeVotosBlancoPorElemento(ElementoVoto elemento_voto) {
        return elemento_voto.getPorcentajeVotosBlanco();
    }

    public double getPorcentajeVotosCandidatoPorElemento(ElementoVoto elemento_voto, Candidato candidato) {
        return elemento_voto.getPorcentajeVotosCandidato(candidato);
    }

    public ArrayList<Candidato> getCandidatosOrdenados() { //Crea copia de candidatos y lo ordena con collections y el comparador
        
        ArrayList<Candidato> candidatos_ordenados = new ArrayList<>(this.candidatos);
        //Collections.sort(candidatos_ordenados, this.comparador);
        Collections.sort(candidatos_ordenados);
        return candidatos_ordenados;
    }
}