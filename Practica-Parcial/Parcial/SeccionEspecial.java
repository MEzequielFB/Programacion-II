import java.util.ArrayList;
import java.util.Collections;

public class SeccionEspecial extends Seccion {

    private String categoria;
    private int cantidad_palabras_clave;

    public SeccionEspecial(String categoria, int cantidad_palabras_clave) {
        super(-1);
        this.categoria = categoria;
        this.cantidad_palabras_clave = cantidad_palabras_clave;
    }

    //Getters
    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> palabras_clave_padre = super.getPalabrasClave();
        ArrayList<String> palabras_clave = new ArrayList<>();

        Collections.sort(palabras_clave_padre);
        for (int i = 0; i < this.cantidad_palabras_clave; i++) {
            if (palabras_clave_padre.size() > i) {
                palabras_clave.add(palabras_clave_padre.get(i));
            }
        }
        return palabras_clave;
    }

    @Override
    public String getCategoria() {
        return this.categoria;
    }
}