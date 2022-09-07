import java.time.LocalDate;

public class Masajista extends Integrante {
 
    private String titulo;
    private int anios_experiencia;

    public Masajista(String nombre, String apellido, LocalDate fecha_nacimiento, String titulo, int anios_experiencia) {

        super(nombre, apellido, fecha_nacimiento);
        this.titulo = titulo;
        this.anios_experiencia = anios_experiencia;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public int getAnios_experiencia() {
        return anios_experiencia;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAniosExperiencia(int anios_experiencia) {
        this.anios_experiencia = anios_experiencia;
    }
}