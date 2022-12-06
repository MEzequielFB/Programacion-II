import java.util.ArrayList;

public class CalculadorPrimeraPalabra extends CalculadorPalabraClave {

    private int posicion_palabra;

    public CalculadorPrimeraPalabra(int posicion_palabra) {
        this.posicion_palabra = posicion_palabra;
    }

    @Override
    public String calcularPalabraClave(ArrayList<String> palabras_clave) {
        if (!palabras_clave.isEmpty() && palabras_clave.size() > this.posicion_palabra) {
            return palabras_clave.get(this.posicion_palabra);
        }
        return null;
    }
    
}