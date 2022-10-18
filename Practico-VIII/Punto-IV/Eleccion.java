import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Eleccion {
    
    private ArrayList<Candidato> candidatos; //Los agrego manualmente
    private ArrayList<ElementoVoto> elementos_voto;
    private Comparator<Candidato> comparador;

    public Eleccion(Comparator<Candidato> comparador) {
        this.candidatos = new ArrayList<>();
        this.elementos_voto = new ArrayList<>();
        this.comparador = comparador;
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
    public ArrayList<Candidato> getCandidatosOrdenados() { //Crea copia de candidatos y lo ordena con collections y el comparador
        
        ArrayList<Candidato> candidatos_ordenados = new ArrayList<>(this.candidatos);
        Collections.sort(candidatos_ordenados, this.comparador);
        return candidatos_ordenados;
    }
}