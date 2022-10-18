import java.util.Comparator;

public class ComparadorNombre implements Comparator<Candidato> {

    @Override
    public int compare(Candidato candidato1, Candidato candidato2) {
        return candidato1.getNombre().compareTo(candidato2.getNombre());
    }
}