public class ExpresionMatematicaSuma extends ExpresionMatematica {

    public ExpresionMatematicaSuma(Expresion expresion1, Expresion expresion2) {
        super(expresion1, expresion2, "+");
    }

    @Override
    public int getResultado() {
        return this.expresion1.getResultado() + this.expresion2.getResultado();
    }

    @Override
    public String getExpresion() {
        return "(" + this.expresion1.getExpresion() + "+" + this.expresion2.getExpresion() + ")";
    }
}