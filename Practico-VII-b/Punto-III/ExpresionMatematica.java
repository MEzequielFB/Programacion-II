import java.util.ArrayList;

public abstract class ExpresionMatematica extends Expresion {
    
    protected Expresion expresion1;
    protected Expresion expresion2;

    public ExpresionMatematica(Expresion expresion1, Expresion expresion2) {
        this.expresion1 = expresion1;
        this.expresion2 = expresion2;
    }

    //Getters
    @Override
    public ArrayList<Integer> getNumeros() {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.addAll(this.expresion1.getNumeros());
        numeros.addAll(this.expresion2.getNumeros());
        return numeros;
    }
}