import java.util.ArrayList;
import java.util.Collections;

public class CalculadorPrimeraPalabraOrdenada extends CalculadorPalabraClave {

    private int posicion_palabra;

    public CalculadorPrimeraPalabraOrdenada(int posicion_palabra) {
        this.posicion_palabra = posicion_palabra;
    }

    @Override
    public String calcularPalabraClave(ArrayList<String> palabras_clave) {
        Collections.sort(palabras_clave);
        if (!palabras_clave.isEmpty() && palabras_clave.size() > this.posicion_palabra) {
            return palabras_clave.get(this.posicion_palabra);
        }
        return null;
    }
}