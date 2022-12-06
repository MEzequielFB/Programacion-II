import java.util.ArrayList;

public class CalculadorPalabraMasCorta extends CalculadorPalabraClave {

    private int posicion_palabra_inicial;

    public CalculadorPalabraMasCorta(int posicion_palabra_inicial) {
        this.posicion_palabra_inicial = posicion_palabra_inicial;
    }

    @Override
    public String calcularPalabraClave(ArrayList<String> palabras_clave) {
        if (!palabras_clave.isEmpty() && palabras_clave.size() > this.posicion_palabra_inicial) {
            String palabra_mas_corta = palabras_clave.get(this.posicion_palabra_inicial);
            for (String palabra_clave : palabras_clave) {
                if (palabra_clave.compareTo(palabra_mas_corta) < 0) {
                    palabra_mas_corta = palabra_clave;
                }
            }
            return palabra_mas_corta;
        }
        return null;
    }
}