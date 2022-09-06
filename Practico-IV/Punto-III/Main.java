public class Main {
    public static void main(String[] args) {
        
        Empleado e1 = new Empleado("Marcelo Patri", 1000);
        EmpleadoHoras e2 = new EmpleadoHoras("Gonzalo Kansas", 700);
        EmpleadoComision e3 = new EmpleadoComision("Julian Marchi", 800);
        EmpleadoComision e4 = new EmpleadoComision("Julian Marchi", 800);

        Empresa empresa1 = new Empresa("Informatic Systems");

        empresa1.addEmpleado(e1);

        empresa1.addEmpleado(e2);
        e2.incrementHorasExtra(2);

        empresa1.addEmpleado(e3);
        e3.incrementCantVentas(3);

        empresa1.addEmpleado(e4);

        empresa1.pagarSueldos();
    }
}