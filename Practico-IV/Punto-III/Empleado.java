public class Empleado {
    
    private static int cont = 0;

    private String nombre;
    private int id;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        
        this.nombre = nombre;
        this.id = cont;
        this.sueldo = sueldo;

        cont++;
    }

    //Funcionalidades
    public void cobrarSueldo() {
        System.out.println(this.nombre + "(" + this.id + ") cobra: " + this.sueldo);
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public boolean equals(Object o) { //Dos empleados son iguales si tienen mismo nombre y id

        Empleado otroEmpleado = (Empleado) o;
        return this.nombre.equals(otroEmpleado.getNombre()) && this.id == otroEmpleado.getId();
    }
}