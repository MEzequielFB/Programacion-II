import java.util.ArrayList;

public class Provincia {
    
    private String nombre;
    private ArrayList<Ciudad> ciudades;

    public Provincia(String nombre) {

        setNombre(nombre);
        ciudades = new ArrayList<Ciudad>();
    }

    //Funcionalidades
    public boolean masDeLaMitadCiudadesConDeficit() {

        int cant_ciudades_con_deficit = 0;
        for (int i = 0; i < ciudades.size(); i++) {

            if (ciudades.get(i).estaEnDeficit()) {

                cant_ciudades_con_deficit++;
            }
        }
        if (cant_ciudades_con_deficit > Math.floor(ciudades.size() / 2)) {
            return true;
        }
        return false;
    }

    public String getCiudadesEnDeficit() {

        String ciudades_en_deficit = "";
        for (int i = 0; i < ciudades.size(); i++) {

            Ciudad ciudad = ciudades.get(i);
            if (ciudad.estaEnDeficit()) {

                ciudades_en_deficit += "- " + ciudad.getNombre();
            }
        }
        return ciudades_en_deficit;
    }

    public double getMontoGastos() {

        double monto = 0;
        for (int i = 0; i < ciudades.size(); i++) {

            monto += ciudades.get(i).getGastosMantenimiento();
        }
        return monto;
    }

    public double getMontoRecaudado() {

        double monto = 0;
        for (int i = 0; i < ciudades.size(); i++) {

            monto += ciudades.get(i).getMontoRecaudado();
        }
        return monto;
    }

    public void addCiudad(Ciudad c) {

        if (!this.existeCiudadEnLista(c)) {
            ciudades.add(c);
        }
    }

    private boolean existeCiudadEnLista(Ciudad c) {

        for (int i = 0; i < ciudades.size(); i++) {

            if (ciudades.get(i).equals(c)) {
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