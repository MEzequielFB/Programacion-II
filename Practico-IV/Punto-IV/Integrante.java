import java.time.LocalDate;

public class Integrante {
    
    private static int cont;

    private String nombre;
    private String apellido;
    private int numero_pasaporte;
    private LocalDate fecha_nacimiento;
    private String estado;

    public Integrante(String nombre, String apellido, LocalDate fecha_nacimiento) {

        this.numero_pasaporte = cont;
        cont++;

        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.estado = "viajando";
    }

    //Getters
    public int getNumeroPasaporte() {
        return numero_pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fecha_nacimiento;
    }

    public String getEstado() {
        return estado;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object obj) {
       
        Integrante otroIntegrante = (Integrante) obj;
        return this.nombre.equals(otroIntegrante.getNombre()) && this.apellido.equals(otroIntegrante.getApellido()) && this.numero_pasaporte == otroIntegrante.getNumeroPasaporte();
    }

    
}