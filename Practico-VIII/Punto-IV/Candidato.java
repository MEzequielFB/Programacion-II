public class Candidato {
    
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
}