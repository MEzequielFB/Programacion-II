import java.util.Comparator;

public class ComparadorPartidoPolitico implements Comparator<Candidato> {

    @Override
    public int compare(Candidato candidato1, Candidato candidato2) {
        return candidato1.getPartidoPolitico().compareTo(candidato2.getPartidoPolitico());
    }
}