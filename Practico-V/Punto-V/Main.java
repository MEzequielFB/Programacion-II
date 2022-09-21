public class Main {
    public static void main(String[] args) {

        Empleado e1 = new Empleado("Juansito", "Moriarty", "23584392", 20000);

        EmpleadoVendedor ev1 = new EmpleadoVendedor("Martín", "Bonilla", "4347291", 16000, 200, 10);

        EmpleadoBono eb1 = new EmpleadoBono("Julián", "Intelangelo", "45984021", 25000, 25, 2000);

        Empresa empresa1 = new Empresa("Telecom");

        empresa1.addEmpleado(e1);
        empresa1.addEmpleado(ev1);
        empresa1.addEmpleado(eb1);

        ev1.setCantVentas(15);
        eb1.setCantVentas(24);

        System.out.println("Sueldo e1: " + e1.getSueldoMensual());
        System.out.println("Sueldo ev1: " + ev1.getSueldoMensual());
        System.out.println("Sueldo eb1: " + eb1.getSueldoMensual());
        System.out.println("Gastos en sueldos de la empresa: " + empresa1.getGastosEnSueldos());
    }
}