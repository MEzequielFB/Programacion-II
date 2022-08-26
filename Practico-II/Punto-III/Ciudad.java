public class Ciudad {
    
    private String nombre;
    private int habitantes;
    private double imp1;
    private double imp2;
    private double imp3;
    private double imp4;
    private double imp5;
    private double gastosMantenimiento;

    public Ciudad(String nombre, int habitantes, double imp1, double imp2, double imp3, double imp4, double imp5, double gastosMantenimiento) {

        setNombre(nombre);
        setHabitantes(habitantes);
        setImp1(imp1);
        setImp2(imp2);
        setImp3(imp3);
        setImp4(imp4);
        setImp5(imp5);
        setGastosMantenimiento(gastosMantenimiento);
    }

    //Funcionalidades
    public double getMontoRecaudado() {
        return this.imp1 + this.imp2 + this.imp3 + this.imp4 + this.imp5;
    }

    public boolean estaEnDeficit() {

        if (this.getMontoRecaudado() < this.gastosMantenimiento) {
            return true;
        }
        return false;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public double getImp1() {
        return imp1;
    }

    public double getImp2() {
        return imp2;
    }

    public double getImp3() {
        return imp3;
    }

    public double getImp4() {
        return imp4;
    }

    public double getImp5() {
        return imp5;
    }

    public double getGastosMantenimiento() {
        return gastosMantenimiento;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public void setImp1(double imp1) {
        this.imp1 = imp1;
    }

    public void setImp2(double imp2) {
        this.imp2 = imp2;
    }

    public void setImp3(double imp3) {
        this.imp3 = imp3;
    }

    public void setImp4(double imp4) {
        this.imp4 = imp4;
    }

    public void setImp5(double imp5) {
        this.imp5 = imp5;
    }

    public void setGastosMantenimiento(double gastosMantenimiento) {
        this.gastosMantenimiento = gastosMantenimiento;
    }
}