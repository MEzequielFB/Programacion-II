public class Cancha {
    
    private static int _contador;
    private int id;

    public Cancha() {
        _contador++;
        this.id = _contador;
    }

    //Getters
    public int getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Cancha otraCancha = (Cancha) o;
            return this.getId() == otraCancha.getId();
        }
        catch(Exception exc) {
            return false;
        }
    }
}