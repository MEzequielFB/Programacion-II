public class Empleado extends Persona {
    
    private static int cont_legajo;

    private int nro_legajo;
    private double sueldo;

    public Empleado(String nombre, String apellido, int edad, double sueldo) {

        super(nombre, apellido, edad);
        this.nro_legajo = cont_legajo;
        this.sueldo = sueldo;

        cont_legajo++;
    }

    //Getters
    public int getNroLegajo() {
        return nro_legajo;
    }

    public double getSueldo() {
        return sueldo;
    }
}