import java.time.LocalDate;

public class Entrenador extends Integrante {
    
    private static int cont;

    private int federacion_id;

    public Entrenador(String nombre, String apellido, LocalDate fecha_nacimiento) {

        super(nombre, apellido, fecha_nacimiento);
        this.federacion_id = cont;
        cont++;
    }

    //Getters
    public int getFederacion_id() {
        return federacion_id;
    }
}