import java.util.ArrayList;

public abstract class ExpresionMatematica extends Expresion {
    
    protected Expresion expresion1;
    protected Expresion expresion2;
    protected String operador;

    public ExpresionMatematica(Expresion expresion1, Expresion expresion2, String operador) {
        this.expresion1 = expresion1;
        this.expresion2 = expresion2;
        this.operador = operador;
    }

    //Getters
    public String getOperador() {
        return this.operador;
    }

    @Override
    public ArrayList<String> getOperadores() {

        ArrayList<String> operadores = new ArrayList<>();
        operadores.addAll(this.expresion1.getOperadores());
        operadores.addAll(this.expresion2.getOperadores());
        operadores.add(this.operador);
        return operadores;
    }

    @Override
    public ArrayList<Integer> getNumeros() {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.addAll(this.expresion1.getNumeros());
        numeros.addAll(this.expresion2.getNumeros());
        return numeros;
    }
}