import java.util.ArrayList;

public class Ciudad {
    
    public static final int GASTO_MIN_HABITANTES = 100000; //Se controla el gasto público de las ciudades con este mínimo de habitantes

    private String nombre;
    private int habitantes;
    private double gastosMantenimiento;
    private ArrayList<Contribuyente> contribuyentes;

    public Ciudad(String nombre, int habitantes, double gastosMantenimiento) {

        setNombre(nombre);
        setHabitantes(habitantes);
        setGastosMantenimiento(gastosMantenimiento);
        this.contribuyentes = new ArrayList<>();
    }

    //Funcionalidades
    public void addContribuyente(Contribuyente contribuyente) {

        if (!this.contribuyentes.contains(contribuyente)) {
            this.contribuyentes.add((contribuyente));
        }
    }

    public boolean tieneMinimoDeHabitantes() {

        if (this.habitantes >= GASTO_MIN_HABITANTES) {
            return true;
        }
        return false;
    }

    public double getMontoRecaudado() {
        
        double monto_recaudado = 0;
        for (Contribuyente contribuyente : this.contribuyentes) {
            monto_recaudado += contribuyente.getMontoFijo();
        }
        return monto_recaudado;
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

    public void setGastosMantenimiento(double gastosMantenimiento) {
        this.gastosMantenimiento = gastosMantenimiento;
    }
}