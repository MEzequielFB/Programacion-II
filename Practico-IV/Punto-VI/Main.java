public class Main {
    public static void main(String[] args) {

        Empleado e1 = new Empleado("Jorge", "Marca", 23, 100000);
        Empleado e2 = new Empleado("Agustina", "Gustov", 45, 160000);
        Empleado e3 = new Empleado("Federico", "Paq", 39, 65000);

        Jerarquico j1 = new Jerarquico("Esteban", "Quito", 50, 230000);

        Usuario u1 = new Usuario("Eze", "Bonilla", 23, "Eze_fb", "password123");

        Empresa empresa1 = new Empresa("Tec analitics");

        empresa1.addPersona(e1);
        empresa1.addPersona(e2);
        empresa1.addPersona(e3);
        empresa1.addPersona(j1);
        empresa1.addPersona(u1);

        j1.addEmpleado(e1, empresa1);
        j1.addEmpleado(e2, empresa1);
        j1.addEmpleado(e3, empresa1);

        System.out.println(empresa1.getInfoPersonas());
    }
}