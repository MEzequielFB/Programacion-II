import java.util.ArrayList;

public class Planta {
 
    private String nombre_cientifico;
    private ArrayList<String> nombres_vulgares;
    private String clasificacion;
    private String familia;
    private String clase;
    private boolean de_interior;
    private int requerimiento_sol;
    private int requerimiento_agua;

    public Planta(String nombre_cientifico, String clasificacion, String familia, String clase, boolean de_interior, int requerimiento_sol, int requerimiento_agua) {

        this.nombre_cientifico = nombre_cientifico;
        this.nombres_vulgares = new ArrayList<>();
        this.clasificacion = clasificacion;
        this.familia = familia;
        this.clase = clase;
        this.de_interior = de_interior;
        this.requerimiento_sol =  requerimiento_sol;
        this.requerimiento_agua = requerimiento_agua;
    }

    //Funcionalidades
    public boolean contieneNombreVulgar(String nombre_vulgar) {
        return this.nombres_vulgares.contains(nombre_vulgar);
    }

    public void addNombreVulgar(String nombre_vulgar) {

        if (!this.nombres_vulgares.contains(nombre_vulgar)) {
            this.nombres_vulgares.add(nombre_vulgar);
        }
    }

    //Getters
    public String getNombreCientifico() {
        return this.nombre_cientifico;
    }

    public String getClasificacion() {
        return this.clasificacion;
    }

    public String getFamilia() {
        return this.familia;
    }

    public String getClase() {
        return this.clase;
    }

    public boolean esDeInterior() {
        return this.de_interior;
    }

    public int getRequerimientoSol() {
        return this.requerimiento_sol;
    }

    public int getRequerimientoAgua() {
        return this.requerimiento_agua;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Planta otraPlanta = (Planta) o;
            return this.getNombreCientifico().equalsIgnoreCase(otraPlanta.getNombreCientifico());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Planta -> nombre_cientifico = " + this.nombre_cientifico;
    }
}