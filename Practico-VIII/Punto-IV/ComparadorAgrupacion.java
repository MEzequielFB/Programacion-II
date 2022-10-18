import java.util.Comparator;

public class ComparadorAgrupacion implements Comparator<Candidato> {

    @Override
    public int compare(Candidato candidato1, Candidato candidato2) {
        return candidato1.getAgrupacion().compareTo(candidato2.getAgrupacion());
    }
}