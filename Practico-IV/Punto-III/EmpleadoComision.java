public class EmpleadoComision extends Empleado {
    
    private int cantVentas;
    private double porcentaje;

    public EmpleadoComision(String nombre, double sueldo) {

        super(nombre, sueldo);
        this.cantVentas = 0;
        this.porcentaje = 5;
    }

    //Funcionalidades
    private double calcularSueldo() {
        return this.getSueldo() + ( this.cantVentas * ( this.getSueldo()  * ( this.porcentaje / 100 ) ) );
    }

    @Override
    public void cobrarSueldo() {
        System.out.println(this.getNombre() + "(" + this.getId() + ") cobra: " +  this.calcularSueldo());
    }

    public void incrementCantVentas(int valor) {
        this.cantVentas += valor;
    }

    //Getters
    public int getCantVentas() {
        return cantVentas;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    //Setters
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
}