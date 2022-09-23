import java.util.ArrayList;

public class Comite {
    
    private ArrayList<Evaluador> evaluadores;
    private ArrayList<Trabajo> trabajos;
    private ArrayList<String> temasExpertos;

    public Comite() {

        this.evaluadores = new ArrayList<>();
        this.trabajos = new ArrayList<>();
        this.temasExpertos = new ArrayList<>();
    }

    //Funcionalidades
    public void asignarTrabajo(Evaluador evaluador, Trabajo trabajo) {
        evaluador.addTrabajo(trabajo);
    }

    public boolean evaluadorEsExperto(Evaluador evaluador) {

        if (this.evaluadores.contains(evaluador)) {
            return evaluador.esExperto(this);
        }
        return false;
    }

    public boolean contieneTema(String tema) {

        for (String temaExperto : this.temasExpertos) {

            if (temaExperto.equalsIgnoreCase(tema)) {
                return true;
            }
        }
        return false;
    }

    public int getCantidadTrabajosDeEvaluador(Evaluador evaluador) {

        if (this.evaluadores.contains(evaluador)) {
            return evaluador.getCantidadTrabajos();
        }
        return -1;
    }

    public String evaluadorEsApto(Evaluador evaluador) {

        String trabajos_asignables = "";
        for (Trabajo trabajo : this.trabajos) {

            if (trabajo.evaluadorEsApto(evaluador)) {
                trabajos_asignables += trabajo + ", ";
            }
        }
        return trabajos_asignables;
    }

    public String evaluadoresAptos(Trabajo trabajo) {

        String evaluadores_aptos = "";
        for (Evaluador evaluador : this.evaluadores) {

            if (evaluador.esApto(trabajo)) {
                evaluadores_aptos += evaluador + ", ";
            }
        }
        return evaluadores_aptos;
    }

    public void addTemaExperto(String tema) {

        if (!this.temasExpertos.contains(tema)) {
            this.temasExpertos.add(tema);
        }
    }

    public void addTrabajo(Trabajo trabajo) {

        if (!this.trabajos.contains(trabajo)) {
            this.trabajos.add(trabajo);
        }
    }

    public void addEvaluador(Evaluador evaluador) {

        if (!this.evaluadores.contains(evaluador)) {
            this.evaluadores.add(evaluador);
        }
    }
}