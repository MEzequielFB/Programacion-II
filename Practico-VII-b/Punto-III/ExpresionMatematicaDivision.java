import java.util.ArrayList;

public class ExpresionMatematicaDivision extends ExpresionMatematica {
    
    public ExpresionMatematicaDivision(Expresion expresion1, Expresion exprsion2) {
        super(expresion1, expresion1);
    }

    @Override
    public int getResultado() {
        return this.expresion1.getResultado() / this.expresion2.getResultado();
    }

    @Override
    public ArrayList<String> getOperadores() {

        ArrayList<String> operadores = new ArrayList<>();
        operadores.addAll(this.expresion1.getOperadores());
        operadores.addAll(this.expresion2.getOperadores());
        operadores.add("/");
        return operadores;
    }

    @Override
    public String getExpresion() {
        return "(" + this.expresion1.getExpresion() + "/" + this.expresion2.getExpresion() + ")";
    }
}