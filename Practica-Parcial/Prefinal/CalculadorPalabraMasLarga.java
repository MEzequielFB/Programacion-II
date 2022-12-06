import java.util.ArrayList;

public class CalculadorPalabraMasLarga extends CalculadorPalabraClave {

    @Override
    public String calcularPalabraClave(ArrayList<String> palabras_clave) {
        String palabra_mas_larga = "";
        if (!palabras_clave.isEmpty()) {
            for (String palabra_clave : palabras_clave) {
                if (palabra_clave.compareTo(palabra_mas_larga) > 0) {
                    palabra_mas_larga = palabra_clave;
                }
            }
            return palabra_mas_larga;
        }
        return null;
    }
}