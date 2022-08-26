import java.util.ArrayList;

public class Provincia {

    private String nombre;
    private ArrayList<Ciudad> ciudades;

    public Provincia(String nombre) {

        setNombre(nombre);
        ciudades = new ArrayList<Ciudad>();
    }

    //Funcionalidades
    public int getCantCiudadesSinMinimoDeHabitantes() {
        
        int cant_ciudades_sin_minimo = 0;
        for (int i = 0; i < ciudades.size(); i++) {

            if (!ciudades.get(i).tieneMinimoDeHabitantes()) {
                cant_ciudades_sin_minimo++;
            }
        }
        return cant_ciudades_sin_minimo;
    }

    public boolean masDeLaMitadCiudadesConDeficit() {

        int cant_ciudades_con_deficit = 0;
        for (int i = 0; i < ciudades.size(); i++) {

            if (ciudades.get(i).estaEnDeficit() && ciudades.get(i).tieneMinimoDeHabitantes()) { //Se controla que las ciudades cumplan con el mínimo de habitantes

                cant_ciudades_con_deficit++;
            }
        }
        if (cant_ciudades_con_deficit > Math.floor((ciudades.size() - this.getCantCiudadesSinMinimoDeHabitantes()) / 2)) { //Se resta la cantidad de ciudades que no cumplen con el minimo de habitantes ya que no se tienen en cuenta controlar el gasto público
            return true;
        }
        return false;
    }

    public String getCiudadesEnDeficit() {

        String ciudades_en_deficit = "";
        for (int i = 0; i < ciudades.size(); i++) {

            Ciudad ciudad = ciudades.get(i);
            if (ciudad.estaEnDeficit() && ciudad.tieneMinimoDeHabitantes()) { //Se controla que las ciudades cumplan con el mínimo de habitantes

                ciudades_en_deficit += "- " + ciudad.getNombre() + " ";
            }
        }
        return ciudades_en_deficit;
    }

    public double getMontoGastos() {

        double monto = 0;
        for (int i = 0; i < ciudades.size(); i++) {

            if (ciudades.get(i).tieneMinimoDeHabitantes()) { //Se controla que las ciudades cumplan con el mínimo de habitantes
                
                monto += ciudades.get(i).getGastosMantenimiento();
            }
        }
        return monto;
    }

    public double getMontoRecaudado() {

        double monto = 0;
        for (int i = 0; i < ciudades.size(); i++) {

            if (ciudades.get(i).tieneMinimoDeHabitantes()) { //Se controla que las ciudades cumplan con el mínimo de habitantes

                monto += ciudades.get(i).getMontoRecaudado();
            }
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