public class EmpleadoHoras extends Empleado {
    
    private int horasExtra;
    private double montoPorHora;

    public EmpleadoHoras(String nombre, double sueldo) {

        super(nombre, sueldo);
        this.horasExtra = 0;
        this.montoPorHora = 15;
    }

    //Funcionalidades
    private double calcularSueldo() {
        return ( this.getSueldo() + ( this.montoPorHora * this.horasExtra ) );
    }

    @Override
    public void cobrarSueldo() {
        System.out.println(this.getNombre() + "(" + this.getId() + ") cobra: " + this.calcularSueldo());
    }

    public void incrementHorasExtra(int valor) {
        this.horasExtra += valor;
    }

    //Getters
    public int getHorasExtra() {
        return horasExtra;
    }

    public double getMontoPorHora() {
        return montoPorHora;
    }

    //Setters
    public void setMontoXHora(double monto) {
        this.montoPorHora = monto;
    }
}