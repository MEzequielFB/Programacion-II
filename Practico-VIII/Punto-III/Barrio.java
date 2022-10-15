public class Barrio {
    
    private String nombre;
    private Buzon buzon;

    public Barrio(String nombre) {
        this.nombre = nombre;
        this.buzon = null;
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public Buzon getBuzon() {
        return this.buzon;
    }

    //Setters
    public void setBuzon(Buzon buzon) {

        if (this.buzon == null) {
            this.buzon = buzon;
            buzon.setBarrio(this);
        }
    }

    @Override
    public boolean equals(Object o) {

        try {
            Barrio otroBarrio = (Barrio) o;
            return this.getNombre().equalsIgnoreCase(otroBarrio.getNombre());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.nombre + ", " + this.buzon;
    }
}