public class Candidato implements Comparable<Candidato> {
    
    private String nombre;
    private String partido_politico;
    private String agrupacion;

    public Candidato(String nombre, String partido_politico, String agrupacion) {
        this.nombre = nombre;
        this.partido_politico = partido_politico;
        this.agrupacion = agrupacion;
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public String getPartidoPolitico() {
        return this.partido_politico;
    }

    public String getAgrupacion() {
        return this.agrupacion;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Candidato otroCandidato = (Candidato) o;
            return this.getNombre().equalsIgnoreCase(otroCandidato.getNombre()) && this.getPartidoPolitico().equalsIgnoreCase(otroCandidato.getPartidoPolitico());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.getNombre();
    }

    @Override
    public int compareTo(Candidato otroCandidato) {
        
        int resultado = this.getPartidoPolitico().compareTo(otroCandidato.getPartidoPolitico());
        if (resultado == 0) {
            resultado = this.getAgrupacion().compareTo(otroCandidato.getAgrupacion());
        }
        if (resultado == 0) {
            resultado = this.getNombre().compareTo(otroCandidato.getNombre());
        }
        return resultado;
    }
}