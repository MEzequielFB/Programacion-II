public class ExpresionMatematicaRaiz extends ExpresionMatematica {

    public ExpresionMatematicaRaiz(Expresion expresion1, Expresion expresion2) {
        super(expresion1, expresion2, "v");
    }

    @Override
    public int getResultado() {
        return (int) Math.pow(this.expresion1.getResultado(), (1 / this.expresion2.getResultado()));
    }

    @Override
    public String getExpresion() {
        return "(" + this.expresion1.getExpresion() + "v" + this.expresion2.getExpresion() + ")";
    }
}