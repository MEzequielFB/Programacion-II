import java.time.LocalDate;

public class Persona {
    
    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate fecha_nacimiento;
    private char sexo;
    private double peso;
    private double altura;    

    public Persona(int dni) {
        this(dni, "N", "N");
    }

    public Persona(int dni, String nombre, String apellido) {
        this(dni, nombre, apellido, LocalDate.of(2000, 1, 1));
    }

    public Persona(int dni, String nombre, String apellido, LocalDate fecha) {

        this.dni = dni;
        setNombre(nombre); //Se usa el set para tener un control de los valores que se pasan como parámetro
        setApellido(apellido);
        setFechaNac(fecha);
        setSexo('F');
        setPeso(1);
        setAltura(1);
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setFechaNac(LocalDate fecha) {
        this.fecha_nacimiento = fecha;
    }
    public  void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public char getSexo() {
        return sexo;
    }
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }

    public int getEdad() {

        return LocalDate.now().getYear() - this.fecha_nacimiento.getYear();
    }

    public double getImc() {
        return Math.round(peso / Math.pow(altura, 2));
    }

    public boolean getEstadoImc() {

        double en_forma_min = 18.5;
        double en_forma_max = 25;
        double imc = getImc();

        return (imc >= en_forma_min && imc <= en_forma_max);
    }

    public boolean cumpliendo_anios() {
        return (LocalDate.now().getMonth() == fecha_nacimiento.getMonth() && LocalDate.now().getDayOfMonth() == fecha_nacimiento.getDayOfMonth());
    }

    public boolean esMayor() {

        int min_mayor = 18;
        return getEdad() >= min_mayor;
    }

    public boolean puedeVotar() {

        int min_edad = 16;
        return getEdad() >= min_edad;
    }

    @Override //Indica que se está sobreescribiendo el método de una superclase
    public String toString() {
        return "Persona [altura=" + altura + ", apellido=" + apellido + ", dni=" + dni + ", fecha_nacimiento="
                + fecha_nacimiento + ", nombre=" + nombre + ", peso=" + peso + ", sexo=" + sexo + "]";
    }
    
}
