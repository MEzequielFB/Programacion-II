public class Empleado {
    
    public final double sueldoPlus = 100;

    private String nombre;
    private int cantEncuestasRealizadas;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {

        setNombre(nombre);
        this.cantEncuestasRealizadas = 0;
        setSueldo(sueldo);
    }

    //Funcionalidades
    public void IncrementCantEncuestasRealizadas() {
        this.cantEncuestasRealizadas++;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getCantEncuestasRealizadas() {
        return cantEncuestasRealizadas;
    }

    public double getSueldo() {
        return sueldo + (sueldoPlus * cantEncuestasRealizadas);
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", cantEncuestasRealizadas=" + cantEncuestasRealizadas +  "]";
    }
}