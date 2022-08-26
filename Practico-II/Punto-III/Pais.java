import java.util.ArrayList;

public class Pais {
    
    private String nombre;
    private ArrayList<Provincia> provincias;

    public Pais(String nombre) {

        setNombre(nombre);
        this.provincias = new ArrayList<Provincia>();
    }

    //Funcionalidades
    public String getProvinciasConMasDeLaMitadDeDeficit() {

        String provincias_con_deficit = "";
        for (int i = 0; i < provincias.size(); i++) {

            if (provincias.get(i).masDeLaMitadCiudadesConDeficit()) {

                provincias_con_deficit += "- " + provincias.get(i).getNombre() + " ";
            }
        }
        return provincias_con_deficit;
    }

    public String getCiudadesEnDeficit() {

        String ciudades_en_deficit = "";
        for (int i = 0; i < provincias.size(); i++) {

            ciudades_en_deficit += provincias.get(i).getCiudadesEnDeficit();
        }
        return ciudades_en_deficit;
    }

    public void addProvincia(Provincia p) {

        if (!this.existeProvinciaEnLista(p)) {
            provincias.add(p);
        }
    }

    private boolean existeProvinciaEnLista(Provincia p) {

        for (int i = 0; i < provincias.size(); i++) {

            if (provincias.get(i).equals(p)) {
                return true;
            }
        }
        return false;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}