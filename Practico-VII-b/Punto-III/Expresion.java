import java.util.ArrayList;

public abstract class Expresion {

    //Getters
    public abstract int getResultado();

    public abstract ArrayList<Integer> getNumeros();

    public abstract ArrayList<String> getOperadores();

    public abstract String getExpresion();
}