public class Empleado {

    private String nombre;
    private String apellido;
    private String dni;
    private double sueldo_mensual;

    public Empleado(String nombre, String apellido, String dni, double sueldo_mensual) {

        this.setNombre(nombre);
        this.setApellido(apellido);
        this.dni = dni;
        this.setSueldo_mensual(sueldo_mensual);
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public double getSueldoMensual() {
        return sueldo_mensual;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSueldo_mensual(double sueldo_mensual) {

        if (sueldo_mensual > 0) {
            this.sueldo_mensual = sueldo_mensual;
        }
    }

    @Override
    public boolean equals(Object o) {

        try {

            Empleado otroEmpleado = (Empleado) o;
            return this.getDni().equals(otroEmpleado.getDni());
        }
        catch(Exception exc) {
            return false;
        }
    }
}